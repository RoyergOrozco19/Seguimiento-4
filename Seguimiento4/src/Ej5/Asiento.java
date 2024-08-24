package Ej5;

public class Asiento {
    private int numero;
    private String clase;
    private String estado;

    public Asiento(int numero, String clase, String estado) {
        this.numero = numero;
        this.clase = clase;
        this.estado = estado;
    }

    public int obtenerNumero() {
        return numero;
    }

    public String obtenerClase() {
        return clase;
    }

    public String obtenerEstado() {
        return estado;
    }

    public void reservar() {
        estado = "reservado";
    }

    public void ocupar() {
        estado = "ocupado";
    }
}