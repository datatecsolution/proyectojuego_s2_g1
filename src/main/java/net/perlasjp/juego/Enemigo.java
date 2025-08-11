package net.perlasjp.juego;

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

}
