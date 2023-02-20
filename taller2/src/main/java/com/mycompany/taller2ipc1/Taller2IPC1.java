package com.mycompany.taller2ipc1;

public class Taller2IPC1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //definir el espacion en memoria de un arrglo de objetos
        Persona[] personas = new Persona[5];
        
        for (int i = 0; i < personas.length; i++) { //para crear/instanciar cada uno de los 
            personas[i] = new Persona();            //objetos del arreglo 
        }
        
        //prueba de uno de los objetos del arreglo
        personas[1].setNombre("Jose");
        System.out.println(personas[1].getNombre());
        
        //obejeto simple, tipo Persona
        Persona persona1 = new Persona();
        persona1.setNombre("LUis");     //rellenando valores
        persona1.setEdad(12);
        persona1.setCui(465);
        persona1.Hablar();
        
        //imprimiendo valores
        System.out.println("Es es mi nombre: "+persona1.getNombre());
        System.out.println("Esta es mi edad: "+persona1.getEdad());
        System.out.println("mi cui: "+persona1.getCui());
        
        //objeto simple, tipo Estudiante 
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Belarmino");     //metodos de la clase heredada (Persona)
        estudiante1.setCarnet(2015);
        estudiante1.setCarrera("sistemas");
        estudiante1.curso[0].setNombreCurso("matematica");  //metodos de la clase Cursos
        estudiante1.curso[0].setCodigoCurso(212);           //debido que se definio un arreglo de Cursos
       
        
        //imprimiendo los datos
        System.out.println("Mi nombre es: "+estudiante1.getNombre());
        System.out.println("estudio: "+estudiante1.getCarrera());
        System.out.println("llevo el curso de: " +estudiante1.curso[0].getNombreCurso());
        
        //objeto simple, sin hacer encapsulamiento
//        Persona persona2 = new Persona();
//        persona2.nombre = "Mario";
//        persona2.edad = 15;
//        persona2.cui = 4565;
    }
}
