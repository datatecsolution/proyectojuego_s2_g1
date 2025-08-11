package net.perlasjp.juego;

import java.util.Scanner;

public class Juego {

    private Jugador jugador;
    private Enemigo enemigo;
    private Combate combate;

    public void iniciar() {

        Scanner scanner = new Scanner(System.in);
        combate = new Combate();
        Historia historia = new Historia();

        System.out.println("¡Bienvenido al juego de aventura!");
        System.out.print("Ingresa tu nombre:");
        String nombre = scanner.nextLine();
        jugador = new Jugador();

        historia.introduccion();

        while (true) {
            System.out.println("\n¿Que desea hacer?");
            System.out.println("1. Explorar");
            System.out.println("2. Ver estado");
            System.out.println("3. Salir");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    Enemigo enemigo = new Enemigo();
                    combate.iniciar(enemigo, jugador);
                    break;
                case "2":
                    // vamos a agregar otro metodo de jugador
                    break;
                case "3":
                    System.out.println("¡Gracias por jugar!");
                    return;
                default:
                    System.out.println("OPcion no valida");

            }

        }

    }

}
