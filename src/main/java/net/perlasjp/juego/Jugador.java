package net.perlasjp.juego;

public class Jugador {

    private String nombre;

    private int salud;

    private int fuerza;

    public int atacar() {
        return fuerza;
    }

    public void recibirDanios(int danio) {

    }

    public boolean estaVivo() {

        return false;
    }

}
