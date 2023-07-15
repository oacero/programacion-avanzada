package ejercicio;

public abstract class Llamada {
    private String numOrigen = null;
    private String numDestino = null;
    private double duracion = 0;

    public Llamada(String nOrigen, String nDestino, double tiempoLlamada){
        numOrigen = nOrigen;
        numDestino = nDestino;
        duracion = tiempoLlamada;
    }

    public String getNumOrigen() {
        return numOrigen;
    }

    public String getNumDestino() {
        return numDestino;
    }

    public double getDuracion() {
        return duracion;
    }

    public abstract double calcularPrecio();
}
