package co.edu.udea.ejemplostecnicas.poo;

public class ClasePrincipal {
    public static void main (String[] args) {
        System.out.println(Parlante.getNumeroExistencias());
        //Declaración
        Parlante unParlante;
        
        //ClasePrincipal -> unParlante.saludar()
        //               <- 
        
        //Instanciación
        unParlante = new Parlante();
        
        //--------------------
        System.out.println(unParlante.saludar());
        
        System.out.println(unParlante.saludar(8));
    }
}
