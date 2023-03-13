
//5!  = 5*4*3*2*1

package com.mycompany.taller5;

import java.util.Scanner;

public class Taller5 {

    public static void main(String[] args) {
        //definir escaner
        Scanner sc = new Scanner(System.in);
        //Varibles 
        int numero = 0;
        int resultado = 0;
        
        //Pedir el numero a operar
        System.out.print("Ingrese el numero del que desesa conocer el factorial: ");
        numero = sc.nextInt();
        
        //Mostrar el resultado 
        resultado = Recursivo(numero);
        System.out.println("El factorial de "+numero+" es: "+resultado);
        
        
        
        //HILOS
        Cronometro c1 = new Cronometro("Cronomertro1");
        c1.start();
        
    }
    
    
    public static int Recursivo(int n){
        if (n == 1){
            return 1;   //caso BAse
        }else{
            return n * Recursivo(n-1);//caso recursivo
        }
    }
}
