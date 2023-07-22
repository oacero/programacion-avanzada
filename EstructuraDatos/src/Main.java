// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] numeros = new int[10];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 6;
        numeros[6] = 7;
        numeros[7] = 8;
        numeros[8] = 9;
        numeros[9] = 0;


        System.out.println("******Tamanio de numeros: " + numeros.length + " ********");

        //System.out.println("Elemento 3: " + numeros[2] );
        //System.out.println("Elemento 9: " + numeros[8] );

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Elemento " + i + " :" + numeros[i]);
        }

        int[] numeros2 = {11, 22, 33, 44, 55, 66 ,77 ,88 ,89 ,90};
        System.out.println("Elementosss : " + numeros2[7] );

        String[] nombresMascotas = new String[5];

        nombresMascotas[0] = "Toby";
        nombresMascotas[1] = "Bobby";
        nombresMascotas[2] = "Bruno";
        nombresMascotas[3] = "Samuel";
        nombresMascotas[4] = "Tomas";

        System.out.println("******Tamanio de mascotas: " + nombresMascotas.length + " ********");

        for(int i = 0; i < nombresMascotas.length; i++){
            System.out.println("Mascotas " + i + " :" + nombresMascotas[i]);
        }


        //System.out.println("Mascotas : " + nombresMascotas[2] );




    }
}