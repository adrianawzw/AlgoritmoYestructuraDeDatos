package PC3_colas;

public class Paciente {
    String nombre;
    String motivo;

    public Paciente(String nombre, String motivo) {
        this.nombre = nombre;
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", motivo=" + motivo + '}';
    }
    
    
}
