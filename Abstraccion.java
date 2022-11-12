/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstraccion;

import helpers.Napoli;
import helpers.Porto;
import helpers.Sevilla;

/**
 *
 * @author Usuario
 */
public class Abstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         

        Napoli napoli = new Napoli ();
        Porto porto = new Porto ();
        Sevilla sevilla = new Sevilla ();

   
      System.out.println(napoli.getEquipo());
      System.out.println(porto.getEquipo());
      System.out.println(sevilla.getEquipo());
      System.out.println(napoli.getCapitan());
      System.out.println(porto.getCapitan());
      System.out.println(sevilla.getCapitan());

    }
    
}
