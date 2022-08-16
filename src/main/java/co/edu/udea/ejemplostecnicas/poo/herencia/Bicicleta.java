package co.edu.udea.ejemplostecnicas.poo.herencia;

import co.edu.udea.ejemplostecnicas.poo.abstractaseinterfaces.Pedaleable;
import java.util.Objects;

public class Bicicleta implements Pedaleable {
    private String color;
    private String modelo;
    private String referencia;
    private int anioFabricacion;
    protected double velocidad;
    private Marco marco;
    private LuzDelantera luz;

    public Bicicleta(String color, String modelo, String referencia, int anioFabricacion, Marco marco) {
        this.color = color;
        this.modelo = modelo;
        this.referencia = referencia;
        this.anioFabricacion = anioFabricacion;
        this.marco = marco;
        this.velocidad = 0;
    }

    public Bicicleta() {
        this("azul", "Marlin", "8", 2022, new Marco());
    }
    
    public void pedalear() {
        velocidad += 5;
    }
    
    public void frenar() {
        if(velocidad > 0) {
            velocidad -= 3;
        }
        if(velocidad < 0) {
            velocidad = 0;
        }
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public String getModelo() {
        return modelo;
    }

    public String getReferencia() {
        return referencia;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    
    public Marco getMarco() {
        return marco;
    }

    public LuzDelantera getLuz() {
        return luz;
    }

    public void setLuz(LuzDelantera luz) {
        this.luz = luz;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "color=" + color + ", modelo=" + modelo + ", referencia=" + referencia + ", anioFabricacion=" + anioFabricacion + ", velocidad=" + velocidad + ", marco=" + marco + ", luz=" + luz + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.color);
        hash = 67 * hash + Objects.hashCode(this.modelo);
        hash = 67 * hash + Objects.hashCode(this.referencia);
        hash = 67 * hash + this.anioFabricacion;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.velocidad) ^ (Double.doubleToLongBits(this.velocidad) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.marco);
        hash = 67 * hash + Objects.hashCode(this.luz);
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
        final Bicicleta other = (Bicicleta) obj;
        if (this.anioFabricacion != other.anioFabricacion) {
            return false;
        }
        if (Double.doubleToLongBits(this.velocidad) != Double.doubleToLongBits(other.velocidad)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.referencia, other.referencia)) {
            return false;
        }
        if (!Objects.equals(this.marco, other.marco)) {
            return false;
        }
        return Objects.equals(this.luz, other.luz);
    }
    
    
}
