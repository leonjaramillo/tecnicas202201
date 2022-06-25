package co.edu.udea.ejemplostecnicas.arraysystrings;

public class Empleado {
    private String nombres;
    private String apellidos;
    private int celular;

    public Empleado(String nombres, String apellidos, int celular) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.celular = celular;
    }

    public Empleado() {
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", celular=" + celular + '}';
    }
}
