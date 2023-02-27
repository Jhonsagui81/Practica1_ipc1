
package com.mycompany.taller3;

import javax.swing.JOptionPane;

public class Clientes {

    //Atributos 
    private int DPI;
    private String Apellido;
    private String nombre;
    Cuentas[] cuentaAsociada = new Cuentas[5];
    private int contadorCuentas;

    //constructor vacio
    public Clientes() {
        
       
        for (int i = 0; i < cuentaAsociada.length; i++) {
            cuentaAsociada[i]= new Cuentas();
        }  
    }

    //get and set
    public int getContadorCuentas() {
        return contadorCuentas;
    }

    public void setContadorCuentas(int contadorCuentas) {
        this.contadorCuentas = contadorCuentas;
    }

    public int getDPI() {
        return DPI;
    }

    public void setDPI(int DPI) {
        this.DPI = DPI;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cuentas[] getCuentaAsociada() {
        return cuentaAsociada;
    }

    public void setCuentaAsociada(Cuentas[] cuentaAsociada) {
        this.cuentaAsociada = cuentaAsociada;
    }    
    
}
