package co.edu.udea.ejemplostecnicas.poo.herencia;

public class Marco {
    private int referencia;
    private char talla;
    private double peso;

    public Marco(int referencia, char talla, double peso) {
        this.referencia = referencia;
        this.talla = talla;
        this.peso = peso;
    }

    public Marco() {
        this(202201, 'L', 10.5);
    }

    public int getReferencia() {
        return referencia;
    }

    public char getTalla() {
        return talla;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Marco{" + "referencia=" + referencia + ", talla=" + talla + ", peso=" + peso + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.referencia;
        hash = 47 * hash + this.talla;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.peso) ^ (Double.doubleToLongBits(this.peso) >>> 32));
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
        final Marco other = (Marco) obj;
        if (this.referencia != other.referencia) {
            return false;
        }
        if (this.talla != other.talla) {
            return false;
        }
        return Double.doubleToLongBits(this.peso) == Double.doubleToLongBits(other.peso);
    }
    
    
}
