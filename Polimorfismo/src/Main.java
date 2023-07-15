// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import ejercicio.*;
public class Main {
    public static void main(String[] args) {

        Centralita callCenter = new Centralita();
        //Llamada llamadax = new Llamada();

        Llamada llamada1 = new LlamadaLocal("0987654321", "0912345678", 52);
        callCenter.registrarLlamada(llamada1);

        Llamada llamada2 = new LlamadaProvincia("123456789", "9638527411", 24, 2);
        callCenter.registrarLlamada(llamada2);
        Llamada llamada3 = new LlamadaProvincia("00123456789", "5939638527411", 31, 1);
        callCenter.registrarLlamada(llamada3);
        System.out.println();
        System.out.println("Total de llamadas: " + callCenter.getTotalLlamadas());
        System.out.println("Total de facturado: " + callCenter.getTotalFactura());

        //callCenter.getTotalFactura();
        //;



        // Instanciar Lobo
        /*Lobo lobito = new Lobo();

        Animal animal_lobo = lobito;

        Animal animal_canino = new Canino();

        System.out.println("**** Clase Lobo ****");

        lobito.comer();
        lobito.hacerRuido();
        lobito.dormir();

        System.out.println("**** Clase Animal Lobo ****");

        animal_lobo.comer();
        animal_lobo.hacerRuido();

        System.out.println("**** Clase Animal Canino ****");

        animal_canino.comer();
        animal_canino.hacerRuido();
        animal_canino.rugir();
       */

    }
}



