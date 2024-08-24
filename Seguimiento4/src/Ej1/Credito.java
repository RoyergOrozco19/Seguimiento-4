package Ej1;

public class Credito {

  private Solicitud solicitudCredito;
  private static String estado;

  public Credito(Solicitud solicitudCredito){
   this.solicitudCredito = solicitudCredito;
   this.estado = "Pendiente";
  }
public Credito(){

}
 public Solicitud solicitudCredito(){
   return solicitudCredito;
  }

  public static String obtenerEstado(){
   return estado;
  }

 public void aprobar(){
   this.estado = "Aprobado";
 }
 public void rechazar(){
   this.estado = "Rechazado";
 }

}
