package co.edu.udea.ejemplostecnicas.concurrencia;

public class HiloAdicional implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 100000; i=i+2) {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        Thread nuevoHilo = new Thread(new HiloAdicional());
        nuevoHilo.start();
        for(int i = 1; i < 100000; i=i+2) {
            System.out.println(i);
        }
    }
}
