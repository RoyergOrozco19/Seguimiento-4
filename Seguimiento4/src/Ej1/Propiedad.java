package Ej1;

public class Propiedad {
    private String direccion;
    private int valor;

    public Propiedad(String direccion, int valor) {
        this.direccion = direccion;
        this.valor = valor;
    }

    public String obtenerDireccion() {
        return direccion;
    }
    public int obtenerValor() {
        return valor;
    }

}
