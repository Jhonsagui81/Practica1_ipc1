
package com.mycompany.taller2ipc1;


public class Estudiante extends Persona {
    private int carnet;
    private String carrera;
    Cursos[] curso = new Cursos[2];

    public Estudiante() {
        carnet = 0;
        carrera = "";
        for (int i = 0; i < curso.length; i++) {
            curso[i] = new Cursos();
        }
    }
    
    
    
    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
   
    
    
}
