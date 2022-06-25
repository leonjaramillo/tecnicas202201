package co.edu.udea.ejemplostecnicas.poo.herencia;

public class Bicicleta {
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
    
    
}
