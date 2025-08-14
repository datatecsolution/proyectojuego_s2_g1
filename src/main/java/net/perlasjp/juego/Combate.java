package net.perlasjp.juego;

import java.util.Scanner;

public class Combate {

    private Jugador jugador;

    private Enemigo enemigo;

    public void iniciar(Enemigo e, Jugador j) {
        this.enemigo=e;
        this.jugador=j;

        Scanner scanner = new Scanner(System.in);
        System.out.println ("\niUn " + enemigo.getNombre() + " ha aparecido");

        while (jugador.estaVivo() && enemigo.estaVivo()) {
            System.out.println ("\nTu salud :" + jugador.getSalud() + " | Salud del enemigo: " + enemigo.getSalud());
            System.out.print("¿Atacar (a) o Huir (h)? ");
            String opcion = scanner.nextLine();

            if (opcion.equalsIgnoreCase("a")) {
                enemigo.recibirDanio(jugador.atacar());
                if (enemigo.estaVivo()) {
                    jugador.recibirDanios(enemigo.atacar());

                } else {
                     System.out.println ("¡Derrotaste al" + enemigo.getNombre () + "!");

                }
            } else if (opcion.equalsIgnoreCase("h")) {
                System.out.println("Has huido del combate.");
                return;
            } else {
                System.out.println("Opcion no valida.");
            }

        }

        if (!jugador.estaVivo())

        {
            System.out.println("Has muerto en combate. Fin del juego.");
            System.exit(0);
        }
    }
}