package co.edu.udea.ejemplostecnicas.poo;

public class Parlante {
    private static int numeroExistencias = 0;
    public static final int VOLUMEN_MAXIMO = 30;
    private boolean encendido;
    private int volumen;
    private int potencia;
    private String propietario;
    
    public Parlante() {
        this(false, 30, 240, "John Doe");
    }
    
    public Parlante(String propietario) {
        this(false, 25, 230, propietario);
    }

    public Parlante(boolean encendido, int volumen, int potencia, String propietario) {
        this.encendido = encendido;
        this.volumen = volumen;
        this.potencia = potencia;
        this.propietario = propietario;
        numeroExistencias++;
    }
    
    public void encender() {
        encendido = true;
    }
    
    public void apagar() {
        encendido = false;
    }
    
    public boolean getEncendido() {
        return encendido;
    }
    
    public int getPotencia() {
        return potencia;
    }
    
    public void subirVolumen() {
        if(volumen < VOLUMEN_MAXIMO) {
            volumen++;
        }
    }
    
    public void bajarVolumen() {
        if(volumen > 0) {
            volumen--;
        }
    }
    
    public int getVolumen() {
        return volumen;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    public String saludar() {
        return "Hola, " + propietario + ", el volumen máximo de este parlante es: " + VOLUMEN_MAXIMO;
    }
    
    public String saludar(int hora) {
        if(hora >= 0 && hora < 12) {
            return "Buenos días, " + propietario;
        } else if(hora >= 12 && hora < 19) {
            return "Buenos tardes, " + propietario;
        } else if(hora >= 19 && hora < 25) {
            return "Buenos noches, " + propietario;
        } else {
            return "Hola, " + propietario;
        }
    }
    
    public double sumarFrecuencias(double... frecuencias) {
        double suma = 0;
        for(double frecuenciaActual : frecuencias) {
            suma += frecuenciaActual;
        }
        return suma;
    }

    public static int getNumeroExistencias() {
        return numeroExistencias;
    }

    @Override
    public String toString() {
        return "Parlante{" + "encendido=" + encendido + ", volumen=" + volumen + ", potencia=" + potencia + ", propietario=" + propietario + '}';
    }
    
    public void probar() {
        int volumen = 50;
        System.out.println("Volumen variable local: " + volumen);
        System.out.println("Volumen atributo: " + this.volumen);
        System.out.println(this.saludar());
    }
    
    public static void mostrarExistencias() {
        System.out.println(numeroExistencias + " existencias");
    }
}