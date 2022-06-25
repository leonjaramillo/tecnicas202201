package co.edu.udea.ejemplostecnicas.poo.herencia;

public class ClasePrincipal {
    public static void main(String[] args) {
        LuzDelantera lucecita = new LuzDelantera("GW", 500);
        Bicicleta miCicla = new Bicicleta();
        BicicletaMontania otraCicla = new BicicletaMontania();
        
        System.out.println(miCicla.getMarco().getTalla());
        miCicla.setLuz(lucecita);
        System.out.println(miCicla.getLuz().getMarca());
        
        otraCicla.setLuz(new LuzDelantera("Bontrager", 300));
        System.out.println(otraCicla.getLuz().getPotencia());
        otraCicla.setColor("rojo");
        System.out.println(miCicla);
        System.out.println(otraCicla);
        
        
    }
}
