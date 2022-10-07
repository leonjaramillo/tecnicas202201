package co.edu.udea.ejemplostecnicas.archivosio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.WRITE;

public class EjemploAleatorio {

    public static void main(String[] args) {
        String unaRuta = "/Users/leonjaramillo/Documents/Carpeta de ejemplo/tigresaleatorios.txt";
        try {
            //escribirArchivoInicial(unaRuta);
            escribirRegistrosAdicionales(unaRuta);
        } catch (IOException e) {
            System.out.println("Hubo un error al acceder el archivo: " + e.getMessage());
        }
    }

    public static void escribirArchivoInicial(String ruta) throws IOException {
        String cadena = "Esta es la posición 01\nEsta es la posición 02\nEsta es la posición 03\n";
        Path miRuta = Paths.get(ruta);
        byte[] bytesCadena = cadena.getBytes();
        Files.write(miRuta, bytesCadena);
    }

    public static void escribirRegistrosAdicionales(String ruta) throws IOException {
        int posicionInicial = 2;
        String cadena1 = "Esta nueva posición 03\n";
        String cadena2 = "Esta es la posición 04\n";
        
        int numBytes = cadena1.getBytes().length;
        System.out.println(numBytes);
        
        int byteInicial = numBytes * posicionInicial;
        
        Path miRuta = Paths.get(ruta);
        
        FileChannel canal = FileChannel.open(miRuta, WRITE);
        canal.position(byteInicial);
        
        ByteBuffer buffer = ByteBuffer.wrap(cadena1.getBytes());
        while (buffer.hasRemaining()) {
            canal.write(buffer);
        }
        
        buffer = ByteBuffer.wrap(cadena2.getBytes());
        while (buffer.hasRemaining()) {
            canal.write(buffer);
        }
    }
}
