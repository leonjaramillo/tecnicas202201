package co.edu.udea.ejemplostecnicas.colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjemploColecciones {
    public static void main(String[] args) {
        /*List<Integer> edades = new LinkedList<>();
        
        edades.add(18);
        edades.add(28);
        
        edades.add(1, 21);
        edades.add(0, 12);
        
        
        procesar(edades);*/
        
        List<Integer> miLista = new LinkedList<>();
        masProceso(miLista);
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
}
