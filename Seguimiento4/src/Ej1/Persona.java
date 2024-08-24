package Ej1;

public class Persona {

    private String nombre;
    private int Id;
    private String direccion;

    public Persona(String nombre, int Id, String direccion) {
        this.nombre = nombre;
        this.Id = Id;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}