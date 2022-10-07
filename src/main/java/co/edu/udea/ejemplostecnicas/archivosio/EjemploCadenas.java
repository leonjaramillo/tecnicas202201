package co.edu.udea.ejemplostecnicas.archivosio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EjemploCadenas {

    public static void main(String[] args) {
        String unaRuta = "/Users/leonjaramillo/Documents/Carpeta de ejemplo/variostigres.txt";
        leerPorBytes(unaRuta);
        System.out.println();
        leerPorLineas(unaRuta);
        System.out.println();
        leerPorLineasSeparando(unaRuta);
    }

    public static void leerPorBytes(String ruta) {
        Path miRuta = Paths.get(ruta);
        byte[] bytesArchivo;
        try {
            bytesArchivo = Files.readAllBytes(miRuta);
            for (byte actual : bytesArchivo) {
                System.out.println(actual);
            }
        } catch (IOException e) {
            System.out.println("Hubo un error al acceder el archivo: " + e.getMessage());
        }

    }
    
    public static void leerPorLineas(String ruta) {
        Path miRuta = Paths.get(ruta);
        List<String> lineasArchivo;
        try {
            lineasArchivo = Files.readAllLines(miRuta);
            for (String lineaActual : lineasArchivo) {
                System.out.println(lineaActual);
            }
        } catch (IOException e) {
            System.out.println("Hubo un error al acceder el archivo: " + e.getMessage());
        }
    }
    
    public static void leerPorLineasSeparando(String ruta) {
        String[] palabras;
        Path miRuta = Paths.get(ruta);
        List<String> lineasArchivo;
        try {
            lineasArchivo = Files.readAllLines(miRuta);
            for (String lineaActual : lineasArchivo) {
                palabras = lineaActual.split(" ");
                System.out.println("La primera palabra es " + palabras[0] + " y la segunda palabra es " + palabras[1]);
            }
        } catch (IOException e) {
            System.out.println("Hubo un error al acceder el archivo: " + e.getMessage());
        }
    }
}
