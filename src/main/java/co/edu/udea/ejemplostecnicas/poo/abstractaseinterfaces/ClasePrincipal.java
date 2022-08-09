package co.edu.udea.ejemplostecnicas.poo.abstractaseinterfaces;

import co.edu.udea.ejemplostecnicas.poo.Parlante;
import co.edu.udea.ejemplostecnicas.poo.herencia.Bicicleta;
import co.edu.udea.ejemplostecnicas.poo.herencia.BicicletaMontania;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class ClasePrincipal {
    
    public static void sumar(List<Integer> numeros) {
        int suma = 0;
        for(int i : numeros) {
            suma += i;
        }
        System.out.println("Suma: " + suma);
    }
    
    public static void silenciarCualquierDispositivo(Muteable d) {
        d.mute();
    }
    public static void main(String[] args) {
        /*Jaula nuevaJaula = new Jaula();
        Jaula otraJaula = new Jaula();
        Pato miPato = new Pato();
        nuevaJaula.setMiAve(miPato);
        nuevaJaula.getMiAve().graznar();
        Loro miNuevoLoro = new Loro();
        nuevaJaula.setMiAve(miNuevoLoro);
        nuevaJaula.getMiAve().graznar();
        otraJaula.setMiAve(miNuevoLoro);
        otraJaula.getMiAve().graznar();
        //-------
        Lienzo miLienzo = new Lienzo();
        miLienzo.dibujarFigura(new Circulo(2));
        miLienzo.dibujarFigura(new Rectangulo(3, 4));
        miLienzo.dibujarFigura(new Rectangulo(1, 7));
        System.out.println("El área  es " + miLienzo.sumarAreas());
        //------
        System.out.println("-------- List ---------");
        
        List<Integer> edades = new ArrayList<>();
        
        edades.add(4);
        edades.add(10);
        edades.add(25);
        edades.add(2);
        edades.add(105);
        
        sumar(edades);
        
        System.out.println("-------- Muteable ---------");
        
        Televisor t = new Televisor();
        silenciarCualquierDispositivo(t);
        
        Parlante p = new Parlante();
        silenciarCualquierDispositivo(p);
        
        Tablet tab = new Tablet();
        silenciarCualquierDispositivo(tab);
        
        System.out.println("-------- Muteable ---------");
        
        Pedaleable juguete = new BicicletaMontania();
        Persona juan = new Persona();
        
        juan.pedalear(juguete);
        
        double edadDoble = 1000000000;
        float edadFlotante = (float)edadDoble;
        long nuevaEdad = (long)edadFlotante;
        int masEdad = (int)nuevaEdad;
        short otraEdad = (short)masEdad;
        byte edad = (byte)otraEdad;
        
        System.out.println("Edad Doble: " + edadDoble);
        System.out.println("Edad Flotante: " + edadFlotante);
        System.out.println("Nueva Edad: " + nuevaEdad);
        System.out.println("Más Edad: " + masEdad);
        System.out.println("Otra Edad: " + otraEdad);
        System.out.println("Edad: " + edad);
        
        FiguraGeometrica figura = new Circulo(3);
        Circulo circulo = new Circulo(4);
        
        figura = circulo;
        
        circulo = (Circulo)figura;*/
        
        double resultado = Math.abs(67);
        System.out.println(resultado);
        
    }
    
    
}
