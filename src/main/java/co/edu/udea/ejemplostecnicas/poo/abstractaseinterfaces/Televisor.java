package co.edu.udea.ejemplostecnicas.poo.abstractaseinterfaces;

public class Televisor implements Muteable {
    
    private int volumen;

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    

    @Override
    public void mute() {
        volumen = 0;
    }
    
}
