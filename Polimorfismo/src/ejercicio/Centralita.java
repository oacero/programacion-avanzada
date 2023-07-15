package ejercicio;

public class Centralita {

    private int numLlamadas = 0;
    private double totalPagar = 0;

    public int getTotalLlamadas(){
        return numLlamadas;
    }

    public double getTotalFactura(){
        return totalPagar;
    }

    public void registrarLlamada(Llamada llamada){
        System.out.println(llamada);
        numLlamadas++;
        totalPagar += llamada.calcularPrecio();
    }

}
