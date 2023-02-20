

package com.mycompany.practica12023;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practica12023 {
        
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // para usuarios opcion 1
        String User;
        String Password;
        boolean ingreso = false; 
        int menuPrincipal;
        
        // para opcion agregar productos 
        String[] nombre = new String[20];
        double[] precio = new double[20];
        int menuAddProductos = 0;
        int contadorProductos = 0;
        
        // para opcion agregar cupones de descuento 
        String[] cupdescuento = new String[50];
        double[] descuento = new double[50];
        String cuponDescuento;
        double PorcentajeDesc = 0;
        int contadorCupones = 0;
        int menuAddCupones = 0;
        
        // Para opcion Realizar ventas
        String nombreCliente = null;
        int nit = 0;
        int NoProducto = 0;
        int CantidadProducto = 0;
        double total = 0;
        int menuAddVentas = 0;
        int AplicarDesc = 0;
        int suma = 0;
        String cup;
        String es;
        double desc = 0;
        
        //Para opcion factura
        String nombrecajero = "Jhonatan Aguilar";
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        
        
        do{
            System.out.println("--------------------------");
            System.out.println("");
            System.out.print("Ingrese su nombre de usuario: ");
            User = sc.nextLine();

            System.out.print("Ingrese su contrasenia: ");
            Password = sc.nextLine();

            System.out.println("--------------------------");

            
            if(User.equals("Jhonatan") && Password.equals("123")){
                ingreso = true;
                System.out.println("BIENVENIDO AL SISTEMA DE VENTAS");

                //           aqui inicia toda la magia 
                do{  //banderin 
                    System.out.println("________________________________________");
                    System.out.println("[1]. Agregar productos."); //Menú de opciones
                    System.out.println("[2]. Agregar cupón de descuento.");
                    System.out.println("[3]. Realizar ventas.");
                    System.out.println("[4]. Emitir factura.");
                    System.out.println("[5]. Realizar reporte.");
                    System.out.println("[6]. Salir.");
                    System.out.println("________________________________________");
                    System.out.print("\nIngrese el numero de la opción que quiera realizar: ");
                    menuPrincipal = sc.nextInt();

                    switch(menuPrincipal){
                        case 1:
                            Scanner sc1 = new Scanner(System.in);
                            System.out.println("\nMENU AGREGAR PRODUCTOS AL SISTEMA");
                            
                            do{
                                System.out.print("\nIngrese el nombre del producto: ");
                                String producto = sc1.nextLine();
                                boolean existe = false;
                                
                                for (int i = 0; i < 20; i++) {
                                    if (nombre[i] != null && nombre[i].equals(producto)) {
                                        System.out.println("El producto ya esta agregado, ingrese otro");
                                        existe = true;
                                        break;
                                    }
                                }
                                
                                if (existe == true){
                                    continue; 
                                }
                                
                                
                                System.out.print("Ingrese el precio del producto: ");
                                double precioproducto = sc1.nextDouble();
                                
                                
                                if (precioproducto > 0) { //Validar si el precio es mayor a 0
                                    for (int i = 0; i < 20; i++) { //Primer ciclo para llenar los arrays
                                        nombre[contadorProductos] = producto; //Igualar las variables
                                        precio[contadorProductos] = precioproducto;
                                        break;
                                    }
                                } else {
                                    System.out.println("EL PRECIO DEL PRODUCTO NO PUEDE SER IGUAL A 0");
                                    continue;
                                }
                                
                                for(int i = 0; i < 20; i++){
                                    if(nombre[i] != null){
                                        System.out.println("\n-------------------------------------------------");
                                        System.out.println("[" + i + "]." + "Producto: " + nombre[i] + " - " + "Precio: Q." + precio[i]);
                                    }
                                }   
                                contadorProductos += 1;
                                System.out.println("---------------------------------------------");
                                System.out.println("Desea agregar otro producto?");
                                System.out.println("[1]. Si");
                                System.out.println("[2]. No");
                                System.out.println("---------------------------------------------");
                                System.out.print("\nIngrese una opcion: ");
                                
                                menuAddProductos = sc1.nextInt();
                                sc1.nextLine();
                            }while(menuAddProductos != 2);
                            continue;
                        case 2:
                            Scanner sc2 = new Scanner(System.in);
                            System.out.println("\n---USTED SE ENCUENTRA EN EL MENU -AGREGAR CUPON DE DESCUENTO---");
                            do {
                                System.out.print("Ingrese el cupon de descuento de 4 caracteres: ");
                                cuponDescuento = sc2.nextLine();
                                boolean cuponExistente = false;
                                for (int i = 0; i < 20; i++) {
                                    if (cupdescuento[i] != null && cupdescuento[i].equals(cuponDescuento)) {
                                        System.out.println("El cupon de descuento ya esta agregado, ingrese otro");
                                        cuponExistente = true;
                                    }
                                }
                                
                                if (cuponDescuento.length() > 4) {
                                    System.out.println("EL CODIGO SOLO PUEDE TENER 4 CARACTERES");
                                    sc2.nextLine();
                                    continue;
                                }
                                if (cuponExistente) {
                                    continue;
                                }
                                
                                System.out.print("Ingrese el porcentaje de descuento: ");
                                PorcentajeDesc = sc2.nextInt();
                                if (PorcentajeDesc > 0 && PorcentajeDesc < 100) {
                                    for (int i = 0; i < 50; i++) {
                                        cupdescuento[contadorCupones] = cuponDescuento;
                                        descuento[contadorCupones] = PorcentajeDesc;
                                        break;
                                    }
                                } else {
                                    System.out.println("EL PORCENTAJE DE DESCUENTO NO PUEDE SER IGUAL A 0 y 100");
                                    sc2.nextLine();
                                    continue;
                                }
                                
                                for (int i = 0; i < 50; i++) {
                                    if (cupdescuento[i] != null) {
                                        System.out.println("\n-------------------------------------------------");
                                        System.out.println("[" + i + ".]" + cupdescuento[i] + "-" + descuento[i] + "%");
                                    }
                                }
                                contadorCupones += 1;
                                System.out.println("--------------------------------------------------------------");
                                System.out.println("Desea agregar otro cupon de descuento?");
                                System.out.println("[1]. Si");
                                System.out.println("[2]. No");
                                System.out.println("--------------------------------------------------------------");
                                menuAddCupones = sc2.nextInt();
                                sc2.nextLine();
                            } while (menuAddCupones != 2);
                        continue;
                        
                        case 3:
                            Scanner sc3 = new Scanner(System.in);
                            System.out.print("\n---USTED SE ENCUENTRA EN EL MENU -REALIZAR VENTAS---");
                            System.out.print("\nIngrese su nombre: ");
                            nombreCliente = sc3.nextLine();
                            
                            System.out.print("Ingrese su nit o coloque un 0 si no tiene: ");
                            nit = sc3.nextInt();
                            
                            do{
                                System.out.println("\nEsta es la lista de productos que puede comprar: ");
                                for(int i = 0; i< 20; i++){
                                    if(nombre[i] != null){
                                        System.out.println("--------------------------------------------------------------");
                                        System.out.println("["+i+"]"+" Producto: "+nombre[i]+ " - " + " Precio: Q."+ precio[i]);
                                        System.out.println("--------------------------------------------------------------");
                                    }
                                }
                                
                                System.out.print("\nSeleccione el numero del producto que desea comprar: ");
                                NoProducto = sc3.nextInt();
                                
                                System.out.print("Escriba la cantidad de productos que desea comprar: ");
                                CantidadProducto = sc3.nextInt();
                                
                                for (int i = 0; i<20; i++){
                                    total = 0;         //total individual de cada compra
//                                    cantidad[i] = CantidadProducto;
//                                    nombre2[i] = NoProducto;    //no entiendo aun
//                                    cantidad[i] = CantidadProducto;
                                    
                                    if(i == NoProducto){
                                        System.out.println("\nProducto Seleccionado: "+ nombre[NoProducto]);
                                        total = precio[NoProducto] * CantidadProducto;
                                    }
                                    
                                    suma += total;
                                }
                                System.out.println("EL TOTAL DE LA COMPRA ES: " + suma);
                                System.out.println("_______________________________");
                                System.out.println("Desea comprar otro producto?");
                                System.out.println("[1]. Si");
                                System.out.println("[2]. No");
                                System.out.println("_______________________________");
                                menuAddVentas = sc3.nextInt();
                                
                            }while(menuAddVentas != 2);
                            
                            System.out.println("\n______________________________________________________");
                            System.out.println("Desea aplicar un código de descuento a sus compras?");
                            System.out.println("[1]. Si");
                            System.out.println("[2]. No");
                            System.out.println("______________________________________________________");
                            AplicarDesc = sc3.nextInt();
                            sc3.nextLine();
                            
                            System.out.print("Ingrese su codigo de descuento: ");
                            cup = sc3.nextLine();
                            for (int i = 0; i < 50; i++) {
                                es = cupdescuento[i];
                                if(es.equals(cup)){
                                    System.out.println("Cupon valido: "+cupdescuento[i]);
                                    System.out.println("Descuento a realizar: "+descuento[i]+"%");
                                    desc = suma -(suma * (descuento[i]/100));
                                    break;
                                }
                                
                            }
                            
                            System.out.println("Total de la compra: "+ desc);
                            continue;
                        case 4:
                            
                            break;
                        case 5:

                            break;
                        case 6:
                            break;
                    } //fin switch 
                    sc.nextLine();
                }while(menuPrincipal != 6);
                
            }else{  // else de validacion de usuario 
                System.out.println("Usuario o contrasenia incorrectos");
            } //fin else validacion de usuario 
        
        }while(ingreso == false); //repetir usuario 

        
        
    }
    
}
