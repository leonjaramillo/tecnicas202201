package co.edu.udea.ejemplostecnicas.poo.abstractaseinterfaces;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.color);
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
        final FiguraGeometrica other = (FiguraGeometrica) obj;
        return Objects.equals(this.color, other.color);
    }
    
    
}
