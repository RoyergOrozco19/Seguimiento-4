package Ej5;

import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Persona {
    private List<Reserva> historialReservas;

    public Pasajero(String nombre, String identificacion, String contacto) {
        super(nombre, identificacion, contacto);
        this.historialReservas = new ArrayList<>();
    }

    public List<Reserva> obtenerHistorialReservas() {
        return historialReservas;
    }

    public void agregarReserva(Reserva reserva) {
        historialReservas.add(reserva);
    }
}
