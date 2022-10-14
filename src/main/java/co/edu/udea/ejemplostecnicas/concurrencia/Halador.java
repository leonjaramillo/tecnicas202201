package co.edu.udea.ejemplostecnicas.concurrencia;

import java.util.Queue;

public class Halador implements Runnable {
    Queue<Integer> lista;
    int n;
    
    public Halador(int n, Queue lista) {
        this.lista = lista;
        this.n = n;
    }

    @Override
    public void run() {
        Integer e;
        
        while((e = this.lista.poll()) != null) {
            System.out.println("Elemento halado por el hilo " + this.n + ": " + e);
        }
    }
    
}
