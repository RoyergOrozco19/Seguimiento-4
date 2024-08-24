package Ej1;

    public class Cliente extends Persona{

        private static int historialCrediticio;
        private static int ingresos;

        public Cliente(String nombre, int Id, String direccion, int historialCrediticio, int ingresos) {
            super(nombre, Id, direccion);
            this.historialCrediticio = historialCrediticio;
            this.ingresos = ingresos;
        }

        public static int obtenerHistorialCredito(){
            return historialCrediticio;

        }

        public static int obtenerIngresos(){
            return  ingresos;

        }

    }

