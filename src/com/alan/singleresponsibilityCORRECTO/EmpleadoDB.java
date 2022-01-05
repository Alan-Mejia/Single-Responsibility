package com.alan.singleresponsibilityCORRECTO;

import com.alan.singleresponsibilityINCORRECTO.Empleado;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoDB {
    public void guardarEmpleado(){
        List<com.alan.singleresponsibilityINCORRECTO.Empleado> baseEmpleados = new ArrayList<>();
        com.alan.singleresponsibilityINCORRECTO.Empleado empleadoNuevo = new Empleado("Alan","TI",100);
        baseEmpleados.add(empleadoNuevo);
        System.out.println("Se ha guardado correctamente el empleado nuevo: ");
    }

}
