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
    
    
}
