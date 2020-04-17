package sample;


import java.util.ArrayList;

public class Pokemon {

    private String Nombre;
    private String Tipo;
    private ArrayList Habilidad;
    private String Tamaño;
    private int Nivel;
    private int PVida;
    private Pokemon Evolucion;
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

    public Pokemon getEvolucion()
    {
        return Evolucion;
    }

    public void setEvolucion(Pokemon evolucion)
    {
        Evolucion = evolucion;
    }

    public String getNombre()
    {
        return Nombre;
    }

    public void setNombre(String nombre)
    {
        Nombre = nombre;
    }

    public String getTipo()
    {
        return Tipo;
    }

    public void setTipo(String tipo)
    {
        Tipo = tipo;
    }

    public ArrayList getHabilidad()
    {
        return Habilidad;
    }

    public void setHabilidad(ArrayList habilidad)
    {
        Habilidad = habilidad;
    }

    public String getTamaño()
    {
        return Tamaño;
    }

    public void setNivel(int nivel)
    {
        Nivel = nivel;
    }

    public int getNivel()
    {
        return Nivel;
    }

    public void setPVida(int PVida)
    {
        this.PVida = PVida;
    }

    public int getPVida()
    {
        return PVida;
    }


}
