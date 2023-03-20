
package com.mycompany.taller6;

public class Taller6 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        VentanaInicio ventana1 = new VentanaInicio();  //Crea ventana 
        ventana1.setVisible(true);                   //Se hace visible 
        ventana1.setLocationRelativeTo(null);        //Para que siempre aparezca al centro
    }
}
