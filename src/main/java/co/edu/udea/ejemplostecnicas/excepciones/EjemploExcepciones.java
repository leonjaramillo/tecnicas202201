package co.edu.udea.ejemplostecnicas.excepciones;

import co.edu.udea.ejemplostecnicas.poo.abstractaseinterfaces.Circulo;
import co.edu.udea.ejemplostecnicas.poo.abstractaseinterfaces.RadioNegativoException;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EjemploExcepciones {

    public static void main(String[] args) {
        Circulo miCirculo;
        try {
            miCirculo = new Circulo(-5);
            System.out.println(miCirculo.getArea());
        } catch (RadioNegativoException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void hacerCualquierCosa() {
        try {
            File archivo = new File("/users/leonjaramillo/Desktop/docu.txt");
            Desktop escritorio = Desktop.getDesktop();
            escritorio.open(archivo);
        } catch (IOException e) {
            System.out.println("Hubo un error de entrada y salida");
        }
    }
}
