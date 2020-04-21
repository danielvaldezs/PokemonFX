package sample;


import java.util.ArrayList;

public class Pokemon {

    public String Nombre;
    public String Tipo;
    public ArrayList habilidades;
    public String Tamaño;
    public int Nivel;
    public int PVida;
    Pokemon Evolucion;
    public boolean alive;

    public Pokemon(String nombre, String tipo, ArrayList habilidad, String tamaño, int nivel, int PVida, Pokemon evolucion, boolean alive) {
        Nombre = nombre;
        Tipo = tipo;
        habilidades = habilidades;
        Tamaño = tamaño;
        Nivel = nivel;
        this.PVida = PVida;
        Evolucion = evolucion;
        alive = alive;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public ArrayList getHabilidades() {
        return habilidades;
    }

    public void setHabilidad(ArrayList habilidades) {
        habilidades = habilidades;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String tamaño) {
        Tamaño = tamaño;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int nivel) {
        Nivel = nivel;
    }

    public int getPVida() {
        return PVida;
    }

    public void setPVida(int PVida) {
        this.PVida = PVida;
    }

    public Pokemon getEvolucion() {
        return Evolucion;
    }

    public void setEvolucion(Pokemon evolucion) {
        Evolucion = evolucion;
    }

    public void setHabilidades(ArrayList habilidades) {
        this.habilidades = habilidades;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
