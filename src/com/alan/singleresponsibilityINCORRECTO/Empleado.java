package com.alan.singleresponsibilityINCORRECTO;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre;
    private String departamento;
    private int salario;

    //Responsable acceder a la informacion
    public Empleado(String nombre, String departamento, int salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    //Responsable de guardar en BD
    public void guardarEmpleado(){
        List<Empleado> baseEmpleados = new ArrayList<>();
        Empleado empleadoNuevo = new Empleado("Alan","TI",100);
        baseEmpleados.add(empleadoNuevo);
        System.out.println("Se ha guardado correctamente el empleado nuevo: ");
    }


    //Responsable del calculo

    public int calcularSalario(){
        int resultado=0;
        for(int i=0;i<14;i++){
            resultado+=100;
        }
        return resultado;
    }





}
