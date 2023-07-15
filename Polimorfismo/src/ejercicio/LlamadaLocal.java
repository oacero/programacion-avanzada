package ejercicio;

public class LlamadaLocal extends Llamada{

    private double precio = 15;

    public LlamadaLocal(String nOrigen, String nDestino, double tiempoLlamada){
        super(nOrigen, nDestino, tiempoLlamada);
    }

    @Override
    public double calcularPrecio() {
       return getDuracion() * precio;
    }

    public String toString(){
        String mensaje = " Llamada local desde: #" + getNumOrigen() + " hacia #" + getNumDestino() + " Duracion: " + getDuracion() + " segundos." ;
        return mensaje;
    }
}
