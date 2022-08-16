package co.edu.udea.ejemplostecnicas.poo.abstractaseinterfaces;

public class Rectangulo extends FiguraGeometrica {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
        setColor("blanco");
    }
    
    @Override
    public double getArea() {
        return ancho * alto;
    }

    @Override
    public double getPerimetro() {
        return 2 * ancho + 2 * alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.ancho) ^ (Double.doubleToLongBits(this.ancho) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.alto) ^ (Double.doubleToLongBits(this.alto) >>> 32));
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
        final Rectangulo other = (Rectangulo) obj;
        if (Double.doubleToLongBits(this.ancho) != Double.doubleToLongBits(other.ancho)) {
            return false;
        }
        return Double.doubleToLongBits(this.alto) == Double.doubleToLongBits(other.alto);
    }
    
    
}
