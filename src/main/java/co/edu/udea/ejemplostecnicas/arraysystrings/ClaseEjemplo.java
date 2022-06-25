package co.edu.udea.ejemplostecnicas.arraysystrings;

import java.util.Arrays;

public class ClaseEjemplo {
    public static void main(String[] args) {
        ejemploArrays();
        //ejemploStrings();
    }
    
    static void ejemploArrays() {
        String[] nombres;
        byte[] edades = {5, 60, 87, 18, 4};
        double[] saldos = new double[7];
        Empleado[] empleados;
        
        nombres = new String[4];
        empleados = new Empleado[2];
        
        String[][] profesiones;
        profesiones = new String[3][3];
        
        int[][] notas = new int[4][4];
        
        float[][][] magnitudes;
        
        double[][] promedios = {{3, 4.5, 2.8},{2, 4.8, 3, 2.1}};
        
        System.out.println(saldos[1]);
        System.out.println(nombres[3]);
        System.out.println(empleados[0]);
        System.out.println(edades[2]);
        edades = new byte[6];
        System.out.println(edades[2]);
        
        edades[2] = 120;
        System.out.println(edades[2]);
        nombres[1] = "Juan Pablo";
        System.out.println(nombres[1]);
        
        System.out.println("Tamaño: " + empleados.length);
        
        Arrays.fill(saldos, 1000000);
        
        for(double saldoActual : saldos) {
            System.out.println(saldoActual);
        }
        
        System.out.println("Elemento: " + promedios[1][0]);
        System.out.println("Elemento: " + promedios[0][2]);
        System.out.println("Elemento: " + promedios[1][3]);
        
        
    }
    
    static void ejemploStrings() {
        char[] apellido = {'P','e','ñ','a'};
        
        String nombre;
        nombre = "Steven";
        
        String otroNombre = "STEVEN.";
        
        String profesion = "ingeniero";
        
        String cadenaApellido = new String(apellido);
        
        profesion = "doctor";
        
        if(nombre.equals(otroNombre)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
        
        if(nombre.equalsIgnoreCase(otroNombre)) {
            System.out.println("Son iguales pero ignorando mayúsculas");
        } else {
            System.out.println("Son diferentes ignorando mayúsculas");
        }
        
        
        
    }
    
}
