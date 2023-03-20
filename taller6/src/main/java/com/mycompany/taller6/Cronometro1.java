
package com.mycompany.taller6;


public class Cronometro1 extends Thread{
      //Atributos
    private int segundos;
    private String nombre;
    private int min;
    
    //Ventana
    private Temporizador ventana;
    
    //Constructor
    public Cronometro1(Temporizador ventana){
        this.nombre = "";
        this.segundos = 0;
        this.min = 0;
        this.ventana = ventana;
    }
    
    //Metodo obligatorio para hilos
    public void run(){
        try{
            while(true){
                
                ventana.jLabelTotal.setText(+min+" : "+segundos);
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
    
    
    
}
