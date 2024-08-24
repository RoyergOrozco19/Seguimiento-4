package Ej5;

import java.util.ArrayList;
import java.util.List;

public class Avion {
    private String modelo;
    private int capacidad;
    private List<Asiento> listaAsientos;

    public Avion(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.listaAsientos = new ArrayList<>();
        for (int i = 1; i <= capacidad; i++) {
            listaAsientos.add(new Asiento(i, "economica", "disponible"));
        }
    }

    public String obtenerModelo() {
        return modelo;
    }

    public int obtenerCapacidad() {
        return capacidad;
    }

    public List<Asiento> obtenerListaAsientos() {
        return listaAsientos;
    }

    public Asiento obtenerAsiento(int numero) {
        for (Asiento asiento : listaAsientos) {
            if (asiento.obtenerNumero() == numero) {
                return asiento;
            }
        }
        return null;
    }
}
