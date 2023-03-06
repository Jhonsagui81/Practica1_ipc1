package proyecto1;

import java.util.Date;

public class Personas {

    //Atributos 
    String nombre;
    Date Fecha;

    //Metodo Constructor.

    public Personas(String nombre, Date Fecha) {
        this.nombre = nombre;
        this.Fecha = Fecha;
    }
    //metodos..
    public void Mostrar(){
        System.out.println(nombre);
        System.out.println(Fecha);
    }
    
    
    //Get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

}
