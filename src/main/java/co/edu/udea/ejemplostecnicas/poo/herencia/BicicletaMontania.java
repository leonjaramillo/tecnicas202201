package co.edu.udea.ejemplostecnicas.poo.herencia;

public class BicicletaMontania extends Bicicleta {
    private Suspension suspension;
    private int cambio;
    
    public BicicletaMontania(Suspension suspension, int cambio, String color, String modelo, String referencia, int anioFabricacion, Marco marco) {
        super(color, modelo, referencia, anioFabricacion, marco);
        this.suspension = suspension;
        this.cambio = cambio;
    }
    
    public BicicletaMontania(Suspension suspension, int cambio) {
        super();
        this.suspension = suspension;
        this.cambio = cambio;
    }
    
    public BicicletaMontania() {
        super();
        suspension = new Suspension();
        cambio = 4;
    }

    public Suspension getSuspension() {
        return suspension;
    }

    public void setSuspension(Suspension suspension) {
        this.suspension = suspension;
    }

    public int getCambio() {
        return cambio;
    }

    public void subirCambio() {
        if(cambio < 12) {
            cambio++;
        }
    }
    
    public void bajarCambio() {
        if(cambio > 1) {
            cambio--;
        }
    }
    
    @Override
    public void pedalear() {
        velocidad += cambio;
    }
    
    @Override
    public void frenar() {
        super.frenar();
        super.frenar();
    }

    @Override
    public String toString() {
        return "BicicletaMontania{" + "suspension=" + suspension + ", cambio=" + cambio + '}';
    }
}
