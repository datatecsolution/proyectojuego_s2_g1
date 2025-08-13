package net.perlasjp.juego;

public class Jugador {

    private String nombre;

    private int salud;

    private int fuerza;

    public int atacar() {
        return fuerza;
    }

    public void recibirDanios(int cantidad) {
        salud = salud - cantidad;
        if (salud < 0)
            salud = 0;
    }

    public boolean estaVivo() {

        return salud > 0;
    }

    public Jugador(String n) {
        nombre = n;
        salud = 100;
        fuerza = 10;

    }

    public String getNombre() {
        return nombre;

    }

    public int getSalud() {
        return salud;
    }

    public void mostrarEstado() {
        System.out.println(" Jugador: " + nombre);
        System.out.println(" Saludo: " + salud);
        System.out.println(" Ataque: " + fuerza);
    }

}
