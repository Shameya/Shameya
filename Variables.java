/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variables;

/**
 *
 * @author Usuario
 */

public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int M = 6, T = 1, K = -10;
            Variables cb = new Variables();
       
        if (M > T){
            System.out.println("M > T : Verdadero");
        }else{
            System.out.println("M > T : Falso");
        }
       
         if (T / K == -5){
            System.out.println("T / K == -5 : Verdadero");
        }else{
            System.out.println("T / K == -5 : Falso");
        }
             
         if (((M+T)== 7) && ((M-T)== 5) ){
            System.out.println("(M+T== 7) && (M-T== 5) : Verdadero");
        }else{
            System.out.println("(M+T== 7) && (M-T== 5) : Falso");
        }
         
    }
}

