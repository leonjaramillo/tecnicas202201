package co.edu.udea.ejemplostecnicas.poo.abstractaseinterfaces;

public abstract class Ave {
    private String colorPico;
    
    public abstract void graznar();

    public String getColorPico() {
        return colorPico;
    }

    public void setColorPico(String colorPico) {
        this.colorPico = colorPico;
    }
}
