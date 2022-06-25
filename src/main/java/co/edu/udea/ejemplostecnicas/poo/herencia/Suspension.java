package co.edu.udea.ejemplostecnicas.poo.herencia;

public class Suspension {
    private String marca;
    private int recorrido;

    public Suspension(String marca, int recorrido) {
        this.marca = marca;
        this.recorrido = recorrido;
    }

    public Suspension() {
        this("FOX", 100);
    }

    public String getMarca() {
        return marca;
    }

    public int getRecorrido() {
        return recorrido;
    }
}
