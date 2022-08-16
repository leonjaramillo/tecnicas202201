package co.edu.udea.ejemplostecnicas.colecciones;

import co.edu.udea.ejemplostecnicas.poo.abstractaseinterfaces.Circulo;
import co.edu.udea.ejemplostecnicas.poo.abstractaseinterfaces.FiguraGeometrica;
import co.edu.udea.ejemplostecnicas.poo.abstractaseinterfaces.RadioNegativoException;
import co.edu.udea.ejemplostecnicas.poo.abstractaseinterfaces.Rectangulo;
import co.edu.udea.ejemplostecnicas.poo.herencia.Bicicleta;
import co.edu.udea.ejemplostecnicas.poo.herencia.Marco;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class EjemploColecciones {
    public static void main(String[] args) {
        /*List<Integer> edades = new LinkedList<>();
        
        edades.add(18);
        edades.add(28);
        
        edades.add(1, 21);
        edades.add(0, 12);
        
        
        procesar(edades);
        
        List<Integer> miLista = new LinkedList<>();
        masProceso(miLista);
        
        List<String> nombres = new LinkedList<>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Luis");
        nombres.add("Jacobo");
        procesarListaDeCadenas(nombres);*/
        
        List<FiguraGeometrica> miLista = new ArrayList<>();
        
        Circulo c = null;
        try {
            c = new Circulo(6);
        } catch (RadioNegativoException ex) {
            System.out.println(ex.getMessage());
        }
        miLista.add(c);
        
        FiguraGeometrica f = new Rectangulo(4, 5);
        miLista.add(f);
        
        miLista.add(new Rectangulo(10, 10));
        System.out.println("Tamaño de la lista: " + miLista.size());
        
        System.out.println("Área total: " + sumarAreas(miLista));
        //jugarConTablasHash();
    }
    
    public static void procesar(List<Integer> edades) {
        if(edades.contains(18)) {
            System.out.println("Contiene el 18");
        } else {
            System.out.println("No contiene el 18");
        }
        if(edades.contains(43)) {
            System.out.println("Contiene el 43");
        } else {
            System.out.println("No contiene el 43");
        }
        
        System.out.println("El elemento en la posición 3 es: " + edades.get(3));
        System.out.println("El elemento en la posición 0 es: " + edades.get(0));
        
        
        
        for(Integer edad : edades) {
            System.out.println(edad);
        }
        System.out.println("Tamaño: " + edades.size());
        
        
        System.out.println("Se quitarán dos elementos");
        edades.remove(0);
        edades.remove((Integer)28);
        
        for(int i = 0; i < edades.size(); i++) {
            System.out.println(edades.get(i));
        }
        
        System.out.println("Tamaño: " + edades.size());
        
        
        
        
        edades.clear();
        System.out.println("Tamaño: " + edades.size());
    }
    
    public static void masProceso(List<Integer> numeros) {
        long inicio = System.currentTimeMillis();
        for(int i =0; i < 100000000; i++) {
            numeros.add(i);
        }
        long medio = System.currentTimeMillis();
        System.out.println(medio - inicio);
        for(int i =0; i < 100000000; i++) {
            numeros.get(i);
        }
        long fin = System.currentTimeMillis();
        System.out.println(fin - medio);
    }
    
    public static void procesarListaDeCadenas(List<String> cadenas) {
        String frase = "";
        System.out.println("Tamaño de la lista: " + cadenas.size());
        cadenas.add("James");
        System.out.println("Tamaño de la lista: " + cadenas.size());
        for(int i = 0; i < cadenas.size(); i++) {
            System.out.println(cadenas.get(i));
        }
        for(String nombre : cadenas) {
            System.out.println(nombre.length());
        }
        for(String cadena : cadenas) {
            frase = frase.concat(cadena).concat(" - ");
        }
        System.out.println(frase);
        for(String cadena : cadenas) {
            for(int i = 0; i < cadena.length(); i++) {
                System.out.println(cadena.charAt(i));
            }
            System.out.println(" ");
        }
    }
    
    public static double sumarAreas(List<FiguraGeometrica> figuras) {
        double areaTotal = 0;
        for(int i = 0; i < figuras.size(); i++) {
            areaTotal = areaTotal + figuras.get(i).getArea();
        }
        return areaTotal;
    }
    
    public static void jugarConTablasHash() {
        /*Map<Integer, String> numeros;
        numeros = new Hashtable<>();
        
        numeros.put(5, "cinco");
        numeros.put(75, "setenta y cinco");
        numeros.put(20, "veinte");
        numeros.put(-8, "menos ocho");
        numeros.put(1000, "mil");
        
        System.out.println(numeros.size());
        
        System.out.println(numeros.get(20));
        System.out.println(numeros.get(-8));
        System.out.println(numeros.get(75));*/
        
        Map<String, Bicicleta> taller;
        taller = new Hashtable<>();
        
        taller.put("Sebastián", new Bicicleta());
        taller.put("Juan", new Bicicleta("roja", "Rockhopper", "Cualquiera", 2021, new Marco()));
        taller.put("Stiven", new Bicicleta("amarilla", "Specialized", "Otra", 2023, new Marco()));
        
        
        System.out.println(taller.get("Juan"));
        System.out.println(taller.get("Sebastián"));
    }
}
