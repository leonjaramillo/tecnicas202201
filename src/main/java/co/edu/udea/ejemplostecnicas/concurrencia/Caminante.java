package co.edu.udea.ejemplostecnicas.concurrencia;

public class Caminante implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i<7; i++) {
            System.out.println("Soy un hilo secundario, y llevo " + (i+1) + " pasos.");
            try {
                Thread.sleep(3000l);
            } catch (InterruptedException ex) {
                //Se trataría una eventual interrupción
            }
        }
    }
    
    public static void main(String[] args) {
        Thread otroHilo = new Thread(new Caminante());
        otroHilo.start();
        for(int i = 0; i<7; i++) {
            System.out.println("Soy el hilo principal, y llevo " + (i+1) + " pasos.");
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException ex) {
                //Se trataría una eventual interrupción
            }
        }
    }
    
}
