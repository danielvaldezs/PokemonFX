package sample;


import java.util.ArrayList;

public class Pokemon {

    public String Nombre;
     public String Tipo;
    public ArrayList Habilidad;
     public String Tamaño;
     public int Nivel;
     public int PVida;
    Pokemon Evolucion;
    //private Habilidad habilidad;


    public Pokemon(){}

    public Pokemon(String Nombre, String Tipo, String Tamaño, int Nivel, int PVida)
    {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Tamaño = Tamaño;
        this.Nivel = Nivel;
        this.PVida = PVida;
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

    public ArrayList getHabilidad() {
        return Habilidad;
    }

    public void setHabilidad(ArrayList habilidad) {
        Habilidad = habilidad;
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
}
