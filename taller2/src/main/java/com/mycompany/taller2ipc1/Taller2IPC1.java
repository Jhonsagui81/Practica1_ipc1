package com.mycompany.taller2ipc1;

public class Taller2IPC1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Persona[] personas = new Persona[5];
        for (int i = 0; i < personas.length; i++) {
            personas[i] = new Persona();
        }
        
        personas[1].setNombre("Jose");
        System.out.println(personas[1].getNombre());
        
        
        Persona persona1 = new Persona();
        persona1.setNombre("LUis");
        persona1.setEdad(12);
        persona1.setCui(465);
        persona1.Hablar();
        
        System.out.println("Es es mi nombre: "+persona1.getNombre());
        System.out.println("Esta es mi edad: "+persona1.getEdad());
        System.out.println("mi cui: "+persona1.getCui());
        
        
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Belarmino");
        estudiante1.setCarnet(2015);
        estudiante1.setCarrera("sistemas");
        estudiante1.curso[0].setNombreCurso("matematica");
        estudiante1.curso[0].setCodigoCurso(212);
        
        System.out.println("Mi nombre es: "+estudiante1.getNombre());
        System.out.println("estudio: "+estudiante1.getCarrera());
        System.out.println("llevo el curso de: " +estudiante1.curso[0].getNombreCurso());
        
        
//        Persona persona2 = new Persona();
//        persona2.nombre = "Mario";
//        persona2.edad = 15;
//        persona2.cui = 4565;
    }
}
