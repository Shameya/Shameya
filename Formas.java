/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author Usuario
 */
public abstract class Formas {

    protected String color;
  

public String getColor() {
return color;
}
/**
*
* @param color
*/
public void setColor(String color) {
this.color = color;
}

protected abstract void dibujar();


public void imprimirInformacion(){
System.out.println("Color: " + color);
}
}

