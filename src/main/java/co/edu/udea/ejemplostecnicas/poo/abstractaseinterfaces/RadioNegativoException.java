package co.edu.udea.ejemplostecnicas.poo.abstractaseinterfaces;

public class RadioNegativoException extends Exception {

    public RadioNegativoException() {
        super("RadioNegativoException: Intentó asignar un radio negativo");
    }
}
