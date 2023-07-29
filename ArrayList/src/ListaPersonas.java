import java.util.*;
public class ListaPersonas {
    public static void main(String[] arga){
        Scanner entrada = new Scanner(System.in);

        // Definimos lista de objetos tipo persona
        List<Persona> personas = new ArrayList<>();

        // Muestra menu
        boolean salir = false;
        while(!salir){
            generaMenu();
            salir = ejecutaOpciones(entrada, personas);
        }

    }

    public static void generaMenu(){
        System.out.println("***** Listado de Personas *****");
        System.out.println("1. Agregar Persona");
        System.out.println("2. Mostrar listado de Personas");
        System.out.println("3. Salir");
        System.out.println("Ingrese la opción: ");
    }

    public static boolean ejecutaOpciones(Scanner entrada, List<Persona> personas){
        int opcion = Integer.parseInt(entrada.nextLine());
        boolean salir = false;

        // Validar opciones ingresadas
        switch (opcion){
            case 1: {// Agregar persona al listado
                System.out.println("Ingrese cedula: ");
                String cedula = entrada.nextLine();
                System.out.println("Ingrese Nombre y Apellido: ");
                String nombres = entrada.nextLine();
                System.out.println("Ingrese telefono1: ");
                String telefono = entrada.nextLine();
                System.out.println("Ingrese Email: ");
                String email = entrada.nextLine();

                // Crear objeto de tipo persona
                var persona = new Persona(cedula, nombres, telefono, email);
                // Agregar al listado
                personas.add(persona);
                System.out.println("Actualmente la lista contiene: " + personas.size() + " personas.");
                break;
            }
            case 2: {// Mostrar lista de personas
                System.out.println("Lista de personas ingresadas: ");
                personas.forEach(System.out::println);
                break;
            }
            case 3: {// Salir del menu (finalizar)
                System.out.println("Gracias por utilizar el listado, adios!!!");
                salir = true;
                break;
            }
            default: {
                System.out.println("Opcion ingresada no existe, vuelva a intentarlo");
                break;
            }
        }

        return salir;
    }

}
