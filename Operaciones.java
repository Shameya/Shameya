/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesa;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Introduzca el primer valor:");
    Scanner Numero = new Scanner(System.in);
    int numero1=Numero.nextInt();
    System.out.println("Introduzca el segundo valor:");
    int numero2 = Numero.nextInt();

     int suma= numero1 + numero2;
     int resta = (numero1 - numero2);
     int multiplicación = numero1 * numero2;
     double num1double = numero1 ; 
     double num2double = numero2;
     double división = num1double / num2double;
     int modulo = numero1 % numero2;

     System.out.println("Suma: " + suma);
     System.out.println("Resta: " + resta );
     System.out.println("Multiplicación: " + multiplicación );
     System.out.println("División: " + división );
     System.out.println("Modulo: " + modulo );

}
}