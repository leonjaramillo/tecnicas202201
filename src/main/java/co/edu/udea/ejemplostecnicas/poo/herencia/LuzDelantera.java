package co.edu.udea.ejemplostecnicas.poo.herencia;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.marca);
        hash = 37 * hash + this.potencia;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LuzDelantera other = (LuzDelantera) obj;
        if (this.potencia != other.potencia) {
            return false;
        }
        return Objects.equals(this.marca, other.marca);
    }
    
    
}
