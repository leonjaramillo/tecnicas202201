package co.edu.udea.ejemplostecnicas.concurrencia;

public class Cronometro implements Runnable {
    @Override
    public void run() {
        System.out.println("Primera instrucción del hilo secundario.");
        try {
            Thread.sleep(4000l);
        } catch (InterruptedException ex) {
            //Se trataría una eventual interrupción
        }
        System.out.println("Última instrucción del hilo secundario.");
    }
    
    public static void main(String[] args) {
        long inicio, fin;
        System.out.println("Primera instrucción del hilo principal.");
        inicio = System.currentTimeMillis();
        Thread otroHilo = new Thread(new Cronometro());
        otroHilo.start();
        try {
            otroHilo.join();
        } catch (InterruptedException ex) {
            //Se trataría una eventual interrupción
        }
        fin = System.currentTimeMillis();
        System.out.println("Pasaron " + (fin - inicio) + " milisegundos.");
        System.out.println("Última instrucción del hilo principal.");
        
    }
}
