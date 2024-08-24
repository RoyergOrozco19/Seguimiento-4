package Ej1;

public class Solicitud{
    private Cliente cliente;
    private String tipoCredito;
    private int monto;
    private String plazo;
    private double tasaInteres;

    public Solicitud(String tipoCredito, int monto, String plazo, double tasaInteres) {

    this.cliente = cliente;
    this.tipoCredito = tipoCredito;
    this.monto = monto;
    this.plazo = plazo;
    this.tasaInteres = tasaInteres;

    }
    class Credito {
        private Solicitud solicitudCredito;
        private String estado;

        public Credito(Solicitud solicitudCredito) {
            this.solicitudCredito = solicitudCredito;
            this.estado = "pendiente";
        }

        public Solicitud obtenerSolicitudCredito() {
            return solicitudCredito;
        }

        public String obtenerEstado() {
            return estado;
        }

        public void aprobar() {
            this.estado = "aprobado";
        }

        public void rechazar() {
            this.estado = "rechazado";
        }
    }


}
