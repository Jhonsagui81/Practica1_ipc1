
package com.mycompany.taller3;



public class Cuentas {
        // atributos
    private int idCuenta;
    private double SaldoCuenta;
    
    //constructores
    public Cuentas() {
        
    }

    public Cuentas(int idCuenta) {
        this.idCuenta = (idCuenta+1);
    }
    //METODOS
    
    public void retirarSaldo(double SaldoCuenta){
        this.SaldoCuenta -= SaldoCuenta;
    }
    
    //get y set
    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public double getSaldoCuenta() {
        return SaldoCuenta;
    }
    
    public void setSaldoCuenta(double SaldoCuenta) {
        this.SaldoCuenta += SaldoCuenta;
    }
}
