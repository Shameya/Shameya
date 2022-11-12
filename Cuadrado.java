/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author Usuario
 */
public class Cuadrado extends Formas{
    
private double lado;

public double getLado() {
return lado;
}

public void setLado(double lado) {
this.lado = lado;
}

protected void dibujar() {
throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}

public double area(double lado) {
double area = 0;
this.lado = lado;
if (this.lado > 0) {
area = Math.pow(lado, 2);
}
return area;
}
public void imprimirInformacion(){
System.out.println("Lado: " + lado);

}
}

