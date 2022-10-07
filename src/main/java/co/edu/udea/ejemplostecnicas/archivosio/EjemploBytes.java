package co.edu.udea.ejemplostecnicas.archivosio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class EjemploBytes {
    public static void main(String[] args) {
        //guardarBytes("/Users/leonjaramillo/Documents/Carpeta de ejemplo/tigre.txt","Este será mi texto inicial.\n\nPara todos mis lectores.");
        //recuperarBytes("/Users/leonjaramillo/Documents/Carpeta de ejemplo/tigre.txt");
        //guardarCaracteres("/Users/leonjaramillo/Documents/Carpeta de ejemplo/tigreChar.txt","Este es un texto de prueba de caracteres. Con punto seguido. Y otro punto seguido.");
        recuperarCaracteres("/Users/leonjaramillo/Documents/Carpeta de ejemplo/tigreChar.txt");
        /*leerPorLineas("/Users/leonjaramillo/Documents/Carpeta de ejemplo/variostigres.txt");
        String[] lineas = {"Primera línea", "Segunda línea" , "Tercera línea", "Cuarta línea"};
        guardarPorLineas("/Users/leonjaramillo/Documents/Carpeta de ejemplo/variostigresnuevos.txt", lineas);
        leerPorLineas("/Users/leonjaramillo/Documents/Carpeta de ejemplo/variostigres.txt");
        Path miRuta = Paths.get("/Users/leonjaramillo/Documents/Carpeta de ejemplo/variostigresnuevos.txt");
        Path otraRuta = Paths.get("/Users/leonjaramillo/Documents/Carpeta de ejemplo/variostigresinexistentes.txt");
        
        System.out.println(miRuta.getFileName());
        System.out.println(miRuta.getFileSystem());
        System.out.println(miRuta.getRoot());
        
        System.out.println(Files.exists(miRuta));
        System.out.println(Files.exists(otraRuta));
        
        
        System.out.println(Files.isReadable(miRuta));
        System.out.println(Files.isWritable(miRuta));
        System.out.println(Files.isExecutable(miRuta));
        try {
                    Files.move(miRuta, Paths.get("/Users/leonjaramillo/Documents/Carpeta de ejemplo/variostigresconotronombre.txt"), REPLACE_EXISTING);        

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }*/
    }
    
    public static void guardarBytes(String ruta, String texto) {
        byte[] bytesDelTexto = texto.getBytes();
        try (OutputStream escritor = new FileOutputStream(ruta)) {
            System.out.println("Tamaño de la cadena: " + texto.length());
            System.out.println("Número de bytes: " + bytesDelTexto.length);
            for(int i = 0; i < bytesDelTexto.length; i++) {
                escritor.write(bytesDelTexto[i]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void recuperarBytes(String ruta) {
        byte[] todosLosBytes;
        String cadena;
        try (InputStream lector = new FileInputStream(ruta)) {
            todosLosBytes = lector.readAllBytes();
            cadena = new String(todosLosBytes);
            System.out.println(cadena);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void guardarCaracteres(String ruta, String texto) {
        char[] caracteresDelTexto = texto.toCharArray();
        try (OutputStreamWriter escritor = new FileWriter(ruta)) {
            for(char caracter : caracteresDelTexto) {
                escritor.write(caracter);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void recuperarCaracteres(String ruta) {
        int caracter;
        try (InputStreamReader lector = new FileReader(ruta)) {
            while((caracter = lector.read()) != -1) {
                System.out.print((char)caracter);
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void leerPorLineas(String ruta) {
        String linea;
        try (BufferedReader lectorPorLineas = new BufferedReader(new FileReader(ruta))) {
            while((linea = lectorPorLineas.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void guardarPorLineas(String ruta, String[] lineas) {
        try (PrintWriter escritor = new PrintWriter(new FileWriter(ruta))) {
            for (String linea : lineas) {
                escritor.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
