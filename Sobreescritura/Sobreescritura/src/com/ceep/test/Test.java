package com.ceep.test;

import com.ceep.dominio.*;

public class Test {
    
    public static void main(String[] args) {
        
        Empleado empl1 = new Empleado("Santiago", 23000.0);
        //System.out.println(empl1.mostrarDetalles());
        determinarTipo(empl1);
        imprimir(empl1);
        
        Gerente geren1 = new Gerente("Luis", 35000.0, "IT");
        //System.out.println(geren1.mostrarDetalles());
        determinarTipo(geren1);
        imprimir(geren1);
        
        Empleado empl2;
        empl2 = new Escritor("Cervantes", 55000, TipoEscritura.CLASICO);
        System.out.println(empl2.mostrarDetalles());
        System.out.println(((Escritor)empl2).getTipoEscritura().getDescripcion());
        
        Escritor escritor = (Escritor) empl2;
        escritor.getTipoEscritura();
        
        Empleado empl3 = escritor;
        
        
    }
    
    public static void imprimir(Empleado emp){
        System.out.println(emp.mostrarDetalles());
    }
    
    public static void determinarTipo(Empleado emp){
        if (emp instanceof Gerente){
            System.out.println("Empleado es de tipo Gerente");
            System.out.println(((Gerente) emp).getDepartamento());
        }
        else if (emp instanceof Empleado) {
            System.out.println("Empleado es de tipo Empleado");
        }
        else if (emp instanceof Object){
            System.out.println("Empleado es de tipo Object");
        }
    }
    
    
}
