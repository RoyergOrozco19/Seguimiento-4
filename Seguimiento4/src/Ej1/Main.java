package Ej1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la identificación del cliente:"));
        String direccion = JOptionPane.showInputDialog("Ingrese la dirección del cliente:");
        int historialCrediticio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el historial crediticio del cliente: "));
        int ingresos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los ingresos del cliente: "));

        Cliente cliente1 = new Cliente(nombre, id, direccion, historialCrediticio, ingresos);


        String tipoCredito = JOptionPane.showInputDialog("Ingrese el tipo de crédito que desea solicitar");
        int monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto"));
        String plazo = JOptionPane.showInputDialog("Ingrese el plazo del cédito");
        double tasaInteres = 0.35;

        Solicitud solicitud = new Solicitud(tipoCredito, monto, plazo, tasaInteres);

        if (tipoCredito.equalsIgnoreCase("Hipoteca")) {
            String direccionPropiedad = JOptionPane.showInputDialog("Ingrese la dirección de la propiedad:");
            double valorPropiedad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la propiedad:"));

            Propiedad propiedad = new Propiedad(direccionPropiedad, (int) valorPropiedad);


            CreditoHipoteca creditoHipotecario = new CreditoHipoteca(solicitud, propiedad);


            if (Cliente.obtenerHistorialCredito() > 700 && Cliente.obtenerIngresos() > 25000) {
                creditoHipotecario.aprobar();

            } else {
                creditoHipotecario.rechazar();

            }

            JOptionPane.showMessageDialog(null, "El estado del crédito hipotecario es: " + creditoHipotecario.obtenerEstado());

            Credito credito = new Credito();
            if (Cliente.obtenerHistorialCredito() > 700 && Cliente.obtenerIngresos() > 25000) {
                credito.aprobar();
            } else {
                credito.rechazar();
            }

            JOptionPane.showMessageDialog(null, "El estado del crédito personal es: " + Credito.obtenerEstado());
        }
    }

}