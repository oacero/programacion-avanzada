package ejercicio;

public class LlamadaProvincia extends Llamada{
    private double precioF1 = 20;
    private double precioF2 = 25;
    private double precioF3 = 30;
    private int franja = 0;

    public LlamadaProvincia(String nOrigen, String nDestino, double tiempoLlamada, int franjaHoraria){
        super(nOrigen, nDestino, tiempoLlamada);
        franja = franjaHoraria;
    }
    @Override
    public double calcularPrecio() {
        double precioTotal = 0;
        if(franja == 1){
            precioTotal = getDuracion() * precioF1;
        } else if (franja == 2) {
            precioTotal = getDuracion() * precioF2;
        } else if (franja == 3) {
            precioTotal = getDuracion() * precioF3;
        }
        return precioTotal;
    }
    public String toString(){
        String mensaje = " Llamada Provincial desde: #" + getNumOrigen() + " hacia #" + getNumDestino() + " Duracion: " + getDuracion() + " segundos." +
                 " # de franja: " + franja;
        return mensaje;
    }
}
