/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package tarea.individual;

import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Linea;
import helpers.Triangulo;

/**
 *
 * @author Usuario
 */
public class TareaIndividual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Circulo circulo = new Circulo ();
       Linea linea = new Linea ();
       Triangulo triangulo = new Triangulo ();
       Cuadrado cuadrado = new Cuadrado ();

    System.out.println("Formas1" );
    /**
     * @param imprimirInformacion extrae la informacion de cada subclase por eso se pone el nombre
     de la subclase al principio para expecificar de cual se va extraer la informacion
     */
    System.out.println("--Circulo--" );
    circulo.imprimirInformacion();
    System.out.println("--Linea--" );
    linea.imprimirInformacion();
    System.out.println("--Triangulo--" );
    triangulo.imprimirInformacion();
    System.out.println("--Cuadrado--" );
    cuadrado.imprimirInformacion();





    }
}
  
    
