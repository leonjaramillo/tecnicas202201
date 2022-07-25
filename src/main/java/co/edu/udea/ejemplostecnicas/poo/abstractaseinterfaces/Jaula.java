package co.edu.udea.ejemplostecnicas.poo.abstractaseinterfaces;

public class Jaula {
    private Ave miAve;

    public Jaula() {
    }

    public Jaula(Ave miAve) {
        this.miAve = miAve;
    }

    public Ave getMiAve() {
        return miAve;
    }

    public void setMiAve(Ave miAve) {
        this.miAve = miAve;
    }
}
