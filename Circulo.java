/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author Usuario
 */
public class Circulo extends Formas{

private double radio;
private static final double PI = Math.PI;
private double area;
private double contorno;

protected void dibujar() {
throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}

public double getRadio() {
return radio;
}

public void setRadio(double radio) {
this.radio = radio;
}

public double getArea() {
return area;
}

public void setArea(double area) {
this.area = area;
}

public double getContorno() {
return contorno;
}

public void setContorno(double contorno) {
this.contorno = contorno;
}

public double calcularArea(double radio) {
this.area = 0;
this.radio = radio;
if (this.radio > 0) {
area = PI * this.radio * this.radio;
}
return this.area;
}

 public void imprimirInformacion(){
System.out.println("Radio: " + radio);
System.out.println("Area: " + area);
System.out.println("Contorno: " + contorno);
}

 }


