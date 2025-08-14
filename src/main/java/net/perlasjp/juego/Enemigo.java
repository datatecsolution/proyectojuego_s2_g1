package net.perlasjp.juego;

import java.util.Random;

public class Enemigo {

    private String nombre;
    private int salud;
    private int fuerza;

    public int atacar() {
        return fuerza;
    }

    public void recibirDanio(int cantidad) {
        salud = salud - cantidad;
        if (salud < 0)
            salud = 0;
    }

    public boolean estaVivo() {
        return salud > 0;

    }

    public Enemigo(String n, int s) {

        nombre=n;
        salud=s;
        fuerza = new Random().nextInt(5) + 5;

    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

}
