// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        double saldo = 0;

        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta(50.25);

        saldo = cuenta1.getSaldo();
        System.out.println("El saldo de la cuenta1 es: " + saldo);

        saldo = cuenta2.getSaldo();
        System.out.println("El saldo de la cuenta2 es: " + saldo);

        cuenta2.retiro(15.80);
        cuenta1.deposito(15.80);

        System.out.println("El nuevo saldo de la cuenta1 es: " + cuenta1.getSaldo());
        System.out.println("El nuevo saldo de la cuenta2 es: " + cuenta2.getSaldo());

    }
}


/*
Una clase es la representacion de un objeto en la vida real, por medio de atributos y metodos

El nombre de la clase debe empezar con Mayuscula

El nombre del archivo debe ser el mismo nombre de la clase, con la extension .java

AutosModernos

modificado_acceso class NombreClase{

}

Ejemplo:

public class Componentes{

}

Dentro de la clase se distinguen 2 partes
- Los atributos (propiedads y/o caracteristicas )
- Los métodos y/o funciones (acciones que realiza el objeto)


Atributos

modificador_acceso tipo nombreAtributo = valor;

Ej:

private int codigo = 001;
public String nombre = 'Oscar';
public boolean esLibre;


Métodos

modificador_acceso tipo_retorno nombreMetodo(tipo nomParametro, tipo nomParametro2....){

}

Ejemplo:
public int sumar(int num1, int num2) {
    return num1 + mum2;
}

Constructores
Es un tipo de metodo especial que permite la construccion de objetos (instancia)
La finalidad es inicializar los atributos

El constructor tiene las siguientes caracteristicas
- No tiene tipo de retorno
- Su nombre tiene que ser igual al de la Clase

modificador_acceso Nombre(tipo nomParametro, tipo nomParametro2, ....){
}

Ejemplo
public Main(){

}

public Main(int nombre){
}

Sobrecarga de metodos
Decimos que un metodo esta sobrecargado cuando existen 2 o mas metodos con el mismo nombre y tipo de retorno
pero con un numero distinto de parametros.

El ejemplo anterior muestra la caracteristica de sobrecarga de metodos

Convenciones de Java

- Nombre de clases siempre empiezan con mayuscula
 Ej: MiCarro, String, Animal, Electrodomesticos

- Nombre de atributos empiezan con minuscula
  Ej: nombrePersona, numero, contador, estado, esCadena

- Nombre de metodos empieza con minuscula, excepto los constructores que empiezan con mayuscula
Ej: sumar, ascelerar, escribirCuenta

OBJETOS
Los objetos son variables de un tipo complejo de dato (clase)

tipo identificador;
Cuenta cuenta1;

Por defecto un objeto se inicializa con nulo (null)
Para inic4ializar un objeto es distinto a inicializar una variable de tipo primitivo
se utilizala el operador new
Se llama al constructor de la clase que queremos instancia

Cuenta cuenta1 = new Cuenta();
Cuenta cuenta2 = new Cuenta(20);

manejo de Objetos
Consiste en acceder:
- a sus atributos
- a sus metodos

Para el efecto se utiliza el operador punto (.)

Acceso a atributos

nombreObjeto.atributo

cuenta1.saldo = 15;

Acceso a metodos
nombreObjeto.nombreMetodo();

cuenta1.deposito(10);

Nota: La posibilidad de acceder a un metodo o atributo depende del modificador de acceso de los mismos





































 */