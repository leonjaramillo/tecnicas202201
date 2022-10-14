package co.edu.udea.ejemplostecnicas.concurrencia;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MainClass {
    static Queue<Integer> lista;
    
    public static void main(String[] args) {
        initLista(500000);
        //singleThread();
        multiThread();
    }
    
    static void initLista(int n) {
        lista = new ConcurrentLinkedQueue<>();
        for(int i = 0; i < n ; i++) {
            lista.add(i);
        }
    }
    
    public static void singleThread() {
        (new HaladorUnico(lista)).halar();
    }
    
    public static void multiThread() {
        (new Thread(new Halador(1, lista))).start();
        (new Thread(new Halador(2, lista))).start();
        (new Thread(new Halador(3, lista))).start();
    }
}
