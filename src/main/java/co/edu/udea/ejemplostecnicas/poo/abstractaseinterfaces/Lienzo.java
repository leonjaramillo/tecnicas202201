package co.edu.udea.ejemplostecnicas.poo.abstractaseinterfaces;

public class Lienzo {
    private FiguraGeometrica[] figuras;
    private int indiceActual;

    public Lienzo() {
        indiceActual = 0;
        figuras = new FiguraGeometrica[10];
    }
    
    public void dibujarFigura(FiguraGeometrica figura) {
        figuras[indiceActual] = figura;
        indiceActual++;
    }
    
    public double sumarAreas() {
        double suma = 0;
        for(int i = 0; i < indiceActual ; i++) {
            suma += figuras[i].getArea();
        }
        return suma;
    }
}
