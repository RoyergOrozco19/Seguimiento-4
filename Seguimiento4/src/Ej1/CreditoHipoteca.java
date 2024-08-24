package Ej1;

public class CreditoHipoteca extends Credito{

    private Propiedad propiedad;

    public CreditoHipoteca(Solicitud solicitudCredito, Propiedad propiedad) {
        super(solicitudCredito);
        this.propiedad = propiedad;
    }

    public Propiedad obtenerPropiedad(){

        return propiedad;
    }

}
