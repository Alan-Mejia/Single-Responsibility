package com.alan.singleresponsibilityCORRECTO;

public class EmpleadoBeneficios {


    public int calcularSalario(){
        int resultado=0;
        for(int i=0;i<14;i++){
            resultado+=100;
        }
        return resultado;
    }

    public int vaciones(){
        int dia = 30;
        if(dia>100){
            return 5;
        }
        return 10;
    }



}
