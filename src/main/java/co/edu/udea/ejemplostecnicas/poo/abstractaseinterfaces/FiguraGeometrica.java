package co.edu.udea.ejemplostecnicas.poo.abstractaseinterfaces;

public abstract class FiguraGeometrica {
    private String color;
    
    public abstract double getArea();
    public abstract double getPerimetro();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
