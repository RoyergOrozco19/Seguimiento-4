package Ej5;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Avion avion1 = new Avion("Boeing 737", 20);
        Avion avion2 = new Avion("Airbus A320", 12);

        Avion[] aviones = {avion1, avion2};

        Vuelo vuelo1 = new Vuelo(1, "Madrid - Barcelona", "2023-03-15", "10:00", "11:30", avion1);
        Vuelo vuelo2 = new Vuelo(2, "Barcelona - Madrid", "2023-03-15", "12:00", "13:30", avion2);
        Vuelo vuelo3 = new Vuelo(3, "Madrid - Valencia", "2023-03-16", "14:00", "15:30", avion1);

        Vuelo[] vuelos = {vuelo1, vuelo2, vuelo3};

        Pasajero pasajero = new Pasajero("Juan Pérez", "12345678A", "juan.perez@example.com");

        // Menú principal
        while (true) {
            int opcion = JOptionPane.showOptionDialog(null, "¿Qué deseas hacer?", "Menú principal", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buscar vuelos", "Reservar vuelo", "Comprar ticket", "Salir"}, null);
            switch (opcion) {
                case 0:
                    mostrarVuelos(vuelos);
                    break;
                case 1:
                    reservarVuelo(vuelos, pasajero);
                    break;
                case 2:
                    comprarTicket(vuelos, pasajero);
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void mostrarVuelos(Vuelo[] vuelos) {
        StringBuilder vuelosDisponibles = new StringBuilder("Vuelos disponibles:\n");
        for (Vuelo vuelo : vuelos) {
            vuelosDisponibles.append("Número: ").append(vuelo.obtenerNumero()).append("\n")
                    .append("Ruta: ").append(vuelo.obtenerRuta()).append("\n")
                    .append("Fecha: ").append(vuelo.obtenerFecha()).append("\n")
                    .append("Hora de salida: ").append(vuelo.obtenerHoraSalida()).append("\n")
                    .append("Hora de llegada: ").append(vuelo.obtenerHoraLlegada()).append("\n")
                    .append("Avión: ").append(vuelo.obtenerAvion().obtenerModelo()).append("\n")
                    .append("Capacidad: ").append(vuelo.obtenerAvion().obtenerCapacidad()).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, vuelosDisponibles.toString(), "Vuelos disponibles", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void reservarVuelo(Vuelo[] vuelos, Pasajero pasajero) {
        int numeroVuelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número del vuelo que deseas reservar"));
        Vuelo vuelo = null;
        for (Vuelo v : vuelos) {
            if (v.obtenerNumero() == numeroVuelo) {
                vuelo = v;
                break;
            }
        }

        if (vuelo != null) {
            StringBuilder asientosDisponibles = new StringBuilder("Asientos disponibles:\n");
            for (Asiento asiento : vuelo.obtenerAvion().obtenerListaAsientos()) {
                asientosDisponibles.append("Asiento ").append(asiento.obtenerNumero()).append(" - ").append(asiento.obtenerEstado()).append("\n");
            }
            JOptionPane.showMessageDialog(null, asientosDisponibles.toString(), "Asientos", JOptionPane.INFORMATION_MESSAGE);

            int numeroAsiento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número del asiento que deseas reservar"));
            Asiento asiento = vuelo.obtenerAvion().obtenerAsiento(numeroAsiento);
            if (asiento != null && asiento.obtenerEstado().equals("disponible")) {
                asiento.reservar();
                Reserva reserva = new Reserva(pasajero, vuelo, asiento);
                pasajero.agregarReserva(reserva);
                JOptionPane.showMessageDialog(null, "Reserva realizada con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Asiento no disponible");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vuelo no encontrado");
        }
    }

    public static void comprarTicket(Vuelo[] vuelos, Pasajero pasajero) {
        int numeroVuelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número del vuelo que deseas comprar"));
        Vuelo vuelo = null;
        for (Vuelo v : vuelos) {
            if (v.obtenerNumero() == numeroVuelo) {
                vuelo = v;
                break;
            }
        }

        if (vuelo != null) {
            StringBuilder asientosDisponibles = new StringBuilder("Asientos disponibles:\n");
            for (Asiento asiento : vuelo.obtenerAvion().obtenerListaAsientos()) {
                asientosDisponibles.append("Asiento ").append(asiento.obtenerNumero()).append(" - ").append(asiento.obtenerEstado()).append("\n");
            }
            JOptionPane.showMessageDialog(null, asientosDisponibles.toString(), "Asientos", JOptionPane.INFORMATION_MESSAGE);

            int numeroAsiento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número del asiento que deseas comprar"));
            Asiento asiento = vuelo.obtenerAvion().obtenerAsiento(numeroAsiento);
            if (asiento != null && asiento.obtenerEstado().equals("reservado")) {
                asiento.ocupar();
                Reserva reserva = new Reserva(pasajero, vuelo, asiento);
                pasajero.agregarReserva(reserva);
                JOptionPane.showMessageDialog(null, "Ticket comprado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Asiento no disponible o no reservado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vuelo no encontrado");
        }
    }
}
