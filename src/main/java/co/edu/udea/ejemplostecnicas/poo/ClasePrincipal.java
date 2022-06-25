package co.edu.udea.ejemplostecnicas.poo;

public class ClasePrincipal {
    public static void main (String[] args) {
        System.out.println(Parlante.getNumeroExistencias());
        //Declaración
        Parlante unParlante;
        
        //Instanciación
        unParlante = new Parlante();
        System.out.println(Parlante.getNumeroExistencias());
        
        //Declaración + Instanciación
        Parlante otroParlante = new Parlante(false, 10, 400, "Juan David");
        
        System.out.println(unParlante.saludar(7));
        System.out.println(otroParlante.sumarFrecuencias(25, 80, 47));
        
        
        unParlante.probar();
        System.out.println(Parlante.getNumeroExistencias());
        Parlante.mostrarExistencias();
        
        System.out.println(Math.PI);
        System.out.println(Math.cos(1));
    }
}
