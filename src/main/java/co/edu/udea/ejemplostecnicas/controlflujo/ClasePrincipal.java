package co.edu.udea.ejemplostecnicas.controlflujo;

import java.util.Scanner;

public class ClasePrincipal {
    public static void main(String[] args) {
        //ejemploIf();
        //ejemploSwitch();
        //ejemploWhile();
        //ejemploDoWhile();
        //ejemploFor();
        ejemploForMejorado();
    }
    
    public static void ejemploIf() {
        System.out.println("Ingrese su edad:");
        
        Scanner entrada = new Scanner(System.in);
        int edad = entrada.nextInt();
        
        if (edad < 6) {
            System.out.println("Usted es un infante");
            if (edad % 2 == 0) {
                System.out.println("Su edad es par");
            } else {
                System.out.println("Su edad es impar");
            }
        } else if (edad < 11) {
            System.out.println("Usted es niño");
        } else if (edad < 21) {
            System.out.println("Usted es adolescente");
        } else if (edad < 28) {
            System.out.println("Usted es joven adulto");
        } else {
            System.out.println("Usted es adulto");
        }
        
        System.out.println("Usted tiene " + edad + " años");
    }
    
    public static void ejemploSwitch() {
        System.out.println("Ingrese el nombre de un país:");
        
        Scanner entrada = new Scanner(System.in);
        String pais = entrada.nextLine();
        
        
        switch (pais) {
            case "Alemania":
                System.out.println("La capital es Berlín");
                System.out.println("Hacen buenos autos");
                break;
            case "Austria":
                System.out.println("La capital es Viena");
                System.out.println("Se toma buen café");
                break;
            case "Francia":
                System.out.println("La capital es París");
                break;
            case "Belgica":
                System.out.println("La capital es Bruselas");
                break;
            case "Inglaterra":
                System.out.println("La capital es Londres");
                System.out.println("Tienen un gran centro financiero");
                break;
            default:
                System.out.println("No me sé esa capital");
                break;
        }
        
        switch (pais) {
            case "Alemania":
            case "Austria":
                System.out.println("Hablan alemán");
                break;
            case "Francia":
            case "Belgica":
                System.out.println("Hablan francés");
                break;
            case "Inglaterra":
                System.out.println("Hablan inglés");
                break;
            default:
                System.out.println("No sé qué idioma hablan");
                break;
        }
    }
    
    public static void ejemploWhile() {
        String opcion;
        Scanner entrada = new Scanner(System.in);
        
        ciclo: while (true) {
            System.out.println("Ingrese la opción mensaje para recibir un mensaje o la opción salir para salir de la aplicación:");
            opcion = entrada.nextLine();
            
            switch (opcion) {
                case "mensaje":
                    System.out.println("Estoy mostrando un mensaje");
                    break;
                case "salir":
                    break ciclo;
                default:
                    System.out.println("Opción errada");
                    break;
            }
        }
    }
    
    public static void ejemploDoWhile() {
        int i = 0;
        int n = 50;
        
        do {
            System.out.println("Voy en " + i);
            i++;
        } while(i < n);
    }
    
    public static void ejemploFor() {
        for(int i = 0; i < 100; i++) {
            if(i % 3 != 0) {
                continue;
            }
            System.out.println("Voy en " + i);
        }
    }
    
    public static void ejemploForMejorado() {
        String[] nombres = {"Hugo", "Paco", "Luis"};
        for(int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        System.out.println("-----");
        for(String nombreActual : nombres) {
            System.out.println(nombreActual);
        }
    }
}
