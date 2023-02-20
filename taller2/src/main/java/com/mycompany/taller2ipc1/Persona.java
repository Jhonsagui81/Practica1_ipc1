package com.mycompany.taller2ipc1;

public class Persona {
    
    //atributos 
    private String nombre;
    private int edad;
    private int cui;
    
    //CONTRUCTORES - POLIMORFISMO
     public Persona(String nombre, int edad, int cui) {
        this.nombre = nombre;
        this.edad = edad;
        this.cui = cui;
    }
    
     public Persona() {
       nombre = "";
       edad = 0;
       cui = 0;
    }

   
    
    
    
    //get --> muestra datos 
    //set --> para asignarlos 
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCui() {
        return cui;
    }

    public void setCui(int cui) {
        this.cui = cui;
    }
   
//    
    
    //metodos 
    public void Hablar(){
        System.out.println("Hola, mi nombre es: "+ getNombre());
    }
   
}
