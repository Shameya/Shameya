/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author Usuario
 */
public class Linea extends Formas {

private double largo;

public double getLargo() {
return largo;
}

public void setLargo(double largo) {
this.largo = largo;
}

protected void dibujar() {
throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}
public void imprimirInformacion(){
System.out.println("Largo: " + largo);
}

}