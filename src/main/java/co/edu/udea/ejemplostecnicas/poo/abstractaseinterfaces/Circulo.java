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
    
    
}
