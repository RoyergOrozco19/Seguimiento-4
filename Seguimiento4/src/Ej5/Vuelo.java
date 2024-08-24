package Ej5;

public class Vuelo {
    private int numero;
    private String ruta;
    private String fecha;
    private String horaSalida;
    private String horaLlegada;
    private Avion avion;

    public Vuelo(int numero, String ruta, String fecha, String horaSalida, String horaLlegada, Avion avion) {
        this.numero = numero;
        this.ruta = ruta;
        this.fecha = fecha;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.avion = avion;
    }

    public int obtenerNumero() {
        return numero;
    }

    public String obtenerRuta() {
        return ruta;
    }

    public String obtenerFecha() {
        return fecha;
    }

    public String obtenerHoraSalida() {
        return horaSalida;
    }

    public String obtenerHoraLlegada() {
        return horaLlegada;
    }

    public Avion obtenerAvion() {
        return avion;
    }
}