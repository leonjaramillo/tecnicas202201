package co.edu.udea.ejemplostecnicas.poo.abstractaseinterfaces;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) throws RadioNegativoException {
        setColor("blanco");
        if(radio >= 0) {
            this.radio = radio;
        } else {
            throw new RadioNegativoException();
        }
    }
    
    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double getPerimetro() {
        return (2 * Math.PI) * radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) throws RadioNegativoException {
        if(radio >= 0) {
            this.radio = radio;
        } else {
            throw new RadioNegativoException();
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.radio) ^ (Double.doubleToLongBits(this.radio) >>> 32));
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
        final Circulo other = (Circulo) obj;
        return Double.doubleToLongBits(this.radio) == Double.doubleToLongBits(other.radio);
    }
    
    
}
