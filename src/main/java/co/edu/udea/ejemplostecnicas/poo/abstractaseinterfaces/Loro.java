package co.edu.udea.ejemplostecnicas.poo.abstractaseinterfaces;

public class Loro extends Ave {
    
    public Loro() {
        setColorPico("blanco");
    }
    
    public Loro(String colorPico) {
        setColorPico(colorPico);
    }

    @Override
    public void graznar() {
        System.out.println("Quiere cacao?");
    }
    
}
