package com.mycompany.taller3;

public class Taller3 {
        
    static int ContadorClientes = 0;
    
    public static void main(String[] args) {
    
      
        Login login = new Login();
        login.setVisible(true);

    }
    
    public static String Aleatorio(){
               
       String CadenaAleatoria = "";
        
        for (int i = 0; i < 4; i++) {
            double  num = Math.random()*4;  //012.6546
            int x = (int)num;
            
            switch(x){
                case 1:
                    CadenaAleatoria +="a";
                    break;
                case 2:
                    CadenaAleatoria +="d";
                    break;
                case 3:
                    CadenaAleatoria +="z";
                    break;
                case 0:
                    CadenaAleatoria +="i";
                    break;
            }
        }
       
        return CadenaAleatoria;
    }
    
}
