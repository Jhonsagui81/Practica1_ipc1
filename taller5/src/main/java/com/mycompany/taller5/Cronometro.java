
package com.mycompany.taller5;

public class Cronometro extends Thread {
    //Atributos
    private int segundos;
    private String nombre;
    private int min;
    
    //Constructor
    public Cronometro(String nombre){
        this.nombre = nombre;
        this.segundos = 0;
        this.min = 0;
    }
    
    //Metodo obligatorio para hilos
    public void run(){
        try{
            while(true){
                System.out.println("HIlo: "+nombre+" Tiempo: "+min+" : "+segundos);
                if(segundos == 60){
                    min++;
                    segundos = 0;
                }
                sleep(1000);
                segundos++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    //get y set 
    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
