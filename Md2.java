/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursos;
import java.util.Scanner; 
/**
 *
 * @author Usuario
 */
public class Md2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Recursos recursos = new Recursos(); 
            recursos.Bienvenida();                  
            recursos.edad(10);               
    }
   
    public static class Recursos {

  public void Bienvenida() {
    System.out.println("Programación Orientada a Objetos 2021");
}
    
public void edad (int edad) {
  if (edad <=21){
     System.out.println("Eres mayor de edad");
  }else{
     System.out.println("Eres menor de edad");
     }
    }

      public void multiplicar(int n1, int n2){
Scanner sc = new Scanner(System.in);
int numeros[] = new int[2];
for(int i = 0 ; i < 2 ; i++){
   System.out.println("Por favor ingresa el "+(i+1)+ " número:");
   numeros[i] = Integer.parseInt(sc.nextLine()); 
 
int mult = numeros[0] * numeros[1];
System.out.println("La multiplicación es :" +mult);
}
    }

        /**
         *
         * @param num
         */
        public void numero(int num){
int[] listaNumeros = null;
if(num>0){
listaNumeros = new int[num + 1];
for(int i = 1; i <listaNumeros.length; i++){
listaNumeros[i] = i;
System.out.println(listaNumeros[i]);
}
}
}   
  }
}



 

 

  
  
    

