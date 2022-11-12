/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author Usuario
 */
public class Triangulo extends Formas {

private double base;
private double altura;
private double angulo;

public double getBase() {
return base;
}

public void setBase(double base) {
this.base = base;
}

public double getAltura() {
return altura;
}

public void setAltura(double altura) {
this.altura = altura;
}

public double getAngulo() {
return angulo;
}

public void setAngulo(double angulo) {
this.angulo = angulo;
}

public double calcularArea(double base, double altura) {
double area = 0;
this.base = base;
this.altura = altura;

if (this.base > 0 && this.altura > 0) {
area = (this.base * this.altura) / 2;
}
return area;
}

protected void dibujar() {
throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}
public void imprimirInformacion(){
System.out.println("Base: " + base);
System.out.println("Altura: " + altura);
System.out.println("Angulo: " + angulo);
}
}
    

