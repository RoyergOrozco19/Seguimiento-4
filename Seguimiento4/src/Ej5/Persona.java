package Ej5;

public class Persona {
    private String nombre;
    private String identificacion;
    private String contacto;

    public Persona(String nombre, String identificacion, String contacto) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.contacto = contacto;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    public String obtenerContacto() {
        return contacto;
    }
}