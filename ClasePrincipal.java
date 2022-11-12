/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoclaseprincipal;

/**
 *
 * @author Usuario
 */
public class ClasePrincipal {

     /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here

        //Instanciar la clase Empleado
       Empleado empleado = new Empleado();

        //Establecer información para el objecto empleado
        empleado.setNombre("Carlos Bodden");
        empleado.setSueldo("12000");
        empleado.setNum_e("59");

        //obtener la información
        System.out.println("El nombre del empeado es: "+  empleado.setNombre());
        System.out.println("El sueldo del empleado es: "+ empleado.setSueldo());
        System.out.println("El numero del empleado es: "+ empleado.setNum_e());





    }
    
}
