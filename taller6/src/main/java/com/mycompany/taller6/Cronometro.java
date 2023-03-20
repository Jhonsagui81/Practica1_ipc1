
package com.mycompany.taller6;

import java.awt.Color;
//import java.awt.Rectangle;
//import javax.swing.JLabel;

public class Cronometro extends Thread{
    private int segundosActivida;
    private int segundosDescanso;
    private int Descansoset;
    private int segundoPreparacion;
    private String nombre;
    
    //Ventana
    private Temporizador ventana;
  
    
    //METODO CONSTRUCTOR 
    public Cronometro(int segundoActivida, int segundosDescanso, int Descansoset,  Temporizador ventana){
        this.segundosActivida = segundoActivida;
        this.segundosDescanso = segundosDescanso;
        this.Descansoset = Descansoset;
        this.ventana = ventana;         //Inicia una ventana Tipo Temporizador
        //Preparacion
        this.segundoPreparacion = 5;
        
       
    }
    
    //Metodo obligatorio para hilos
    public void run() {
        try {
           
            int contadorPreparacion = 0; //para dar 5s de preparacion
            int contadorSet = 1;    //para dar descanso despues de un set 

            //Para tiempo de preparacion
            while (contadorPreparacion < 5) {   
                System.out.println("Cronometro:" + segundoPreparacion);
                //Temporizador
                ventana.jlabelTime.setText("" + segundoPreparacion);
                ventana.jlabelTime.setOpaque(true);
                ventana.jlabelTime.setForeground(Color.yellow);
                
                //Barra de tiempo
                
                sleep(1000);
                segundoPreparacion--;
                contadorPreparacion++;
            }
            
            //Principal
            do {
                
                //Variables auxiliares (para no alterar datos recolectados) 
                int activida = segundosActivida;
                int descanso = segundosDescanso;
                int descansoSet = Descansoset;

                //Para tiempo de activida 
                while (activida != 0) {
                    
                    //Primer caso 5s para preparar 
                    if (segundoPreparacion == 0) {
                        
                        //Segundo Caso: s de actividad 
                        //TEMPORIZADOR
                        System.out.println("Cronometro:" + activida);
                        ventana.jlabelTime.setText("" + activida);
                        ventana.jlabelTime.setOpaque(true);
                        ventana.jlabelTime.setForeground(Color.cyan);
                        //TEXTO TEMPORIZADOR 
                        ventana.jLabelIndicador.setText("YAA!");
                        
                        
                      
                        
                        
                        sleep(1000);
                        activida--;
                    }
                   
                } //Temina while primario 

                
                //para tiempo de descando entre sets
                if (contadorSet == 2) {
                    while (descansoSet != 0) {
                        System.out.println("Cronometro:" + descansoSet);
                        ventana.jlabelTime.setText("" + descansoSet);
                        ventana.jlabelTime.setOpaque(true);
                        ventana.jlabelTime.setForeground(Color.green);
                        
                        ventana.jLabelIndicador.setText("Recupera Energia!!");

                        sleep(1000);
                        descansoSet--;
                    } //termina tercer while
                    contadorSet = 0;   //para volver a contar los sets 
                } else {
                    //Para tiempo de descanso entre serie 
                    while (descanso != 0) {
                        if (activida == 0) {
                            System.out.println("Cronometro:" + descanso);
                            ventana.jlabelTime.setText("" + descanso);
                            ventana.jlabelTime.setOpaque(true);
                            ventana.jlabelTime.setForeground(Color.red);

                            ventana.jLabelIndicador.setText("Toma aire");
                            
                            sleep(1000);
                            descanso--;
                        }
                    } //termina while secundario

                }
                
                contadorSet++;
            } while (contadorSet != 4);  //Repite todo un set 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
   

   
    
}
