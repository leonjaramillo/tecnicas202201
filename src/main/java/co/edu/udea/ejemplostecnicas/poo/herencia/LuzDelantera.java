package co.edu.udea.ejemplostecnicas.poo.herencia;

public class LuzDelantera {
    private String marca;
    private int potencia;

    public LuzDelantera(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    public LuzDelantera() {
        this("Shimano", 100);
    }

    public String getMarca() {
        return marca;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        return "LuzDelantera{" + "marca=" + marca + ", potencia=" + potencia + '}';
    }
    
    
}
