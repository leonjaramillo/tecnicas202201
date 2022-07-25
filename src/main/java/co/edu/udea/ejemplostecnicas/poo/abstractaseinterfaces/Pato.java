package co.edu.udea.ejemplostecnicas.poo.abstractaseinterfaces;

public class Pato extends Ave {

    public Pato() {
        setColorPico("amarillo");
    }
    
    public Pato(String colorPico) {
        setColorPico(colorPico);
    }
    
    @Override
    public void graznar() {
        System.out.println("Cuack!");
    }
    
}
