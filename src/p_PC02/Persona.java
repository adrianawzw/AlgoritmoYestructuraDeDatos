package p_PC02;

public class Persona {
     String nombre;
     String dni;
     int edad;
     Persona siguiente;

    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.siguiente = null;
    }
    
}
