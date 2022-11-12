/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensional;

/**
 *
 * @author Usuario
 */
public class Multidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String nombre[] = new String [5];

             nombre[0] = "1 Victor Sosa       |TDAC                         |Sin trabajo";

             nombre[1] = "2 Luis Medrado      |Ing. en Computación          |Academia Europea    ";

             nombre[2] = "3 Yudy Castro       |Ing. en Computacion          |En la municipalidad de el progreso Yoro ";

             nombre[3] = "4 Delmer Mendoza    |Ing. Produccion Industrial   |Sin trabajo    ";

             nombre[4] = "5 Oscar Carranza    |Ing. en Computacion          | Empleado de oficina ";   //Error:No existe esta variable array de índice 4

         for(int i=0; i<nombre.length; i++){
		System.out.println(nombre[i]);
	}
	}
     }
    


    
