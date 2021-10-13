package com.ceep.dominio;

public class Empleado {
    protected double sueldo;
    protected String nombre;
    
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String mostrarDetalles(){
        return "Empleado: " + this.nombre + ", " + this.sueldo;
    }
    
}
