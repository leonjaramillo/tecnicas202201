package co.edu.udea.ejemplostecnicas.concurrencia;

import java.util.Queue;

public class HaladorUnico {
    Queue<Integer> lista;
    
    public HaladorUnico(Queue lista) {
        this.lista = lista;
    }
    
    public void halar() {
        Integer e;
        
        while((e = lista.poll()) != null) {
            System.out.println("Elemento halado por el hilo único: " + e);
        }
    }
}
