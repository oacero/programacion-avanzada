// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static int numeroEntero2 = 20;
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        //for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
        //    System.out.println("i = " + i);
        //}

        String nombre = "Oscar Acero";
        String nombre_usuario;
        String nombreUsuario;
        String nombreUsuarioFinal;

        /* nombre.toLowerCase();
        nombre.toUpperCase();*/

        int numero = 28;
        int numero2 = 33;
        int Numero2 = 33;

        int numeroEntero = 0;
        float costo = 15.99F;
        double costoTotal = 15.01E30;

        int suma = sumar(numero, numero2);

        boolean esDato = !true;
        char letra = 'a';


        System.out.println("Hola mundo... " + nombre.toUpperCase() + " " + suma);

        System.out.println("Primitivo Booleano: " + esDato);
        System.out.println("Primitivo caracter: " + letra);
        System.out.println("Primitivo entero: " + numeroEntero);
        System.out.println("Primitivo float: " + costo);
        System.out.println("Primitivo double: " + costoTotal);
        System.out.println("Numero entero 2: " + numeroEntero2);

        /*for(int i = 0; i < 10; i++) {
            System.out.println("contador = " + i);
        }*/


    }

    /**
     * Suma de 2 numero enteros
     * @param num1
     * @param num2
     * @return
     */
    public static int sumar(int num1, int num2){
        //int a = numeroEntero;
        int b = numeroEntero2;
        return num1 + num2;
    }

    //Variables
    /*
    Una variable tiene:
    - Tipo de dato
    - Identificador
    - Valor y/o dato

    para declarar una variable

    Tipo de dato + identificador + valor y/o dato

    Ejemplo

    String nombre = "Oscar Acero";
    int numero = 28;

    Tipos de Datos
    - Primitivos
    - Complejos (clases)

    Existen 8 tipos de datos primitivos
    Logico: boolean
    Caracter: char
    Numeros enteros: byte, short, int, long
    Nuumoeros reales/ flotantes: float, double


    Tipos de datos enteros
    byte (8 bits, 1 byte): -128 a 127
    short (16 bits, 2 bytes): -32768 a 32767
    int (32 bits, 4 bytes): -2147483468 a 2147483468
    long (64 bits, 8 bytes): infinito

    Tipos de datos reales
    float (32 bits, 4 bytes)
    double (64 bits, 8 bytes)



    * */




}