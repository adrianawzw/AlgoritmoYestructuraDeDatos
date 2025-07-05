package sem12_cl;

public class Persona {
    String nombre;
    String pelicula;

    public Persona(String nombre, String pelicula) {
        this.nombre = nombre;
        this.pelicula = pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPelicula() {
        return pelicula;
    }
}
