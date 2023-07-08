// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Medico medicoGeneral = new Medico();
        MedicoDeCabecera medicoDomicilio = new MedicoDeCabecera();
        Cirujano medicoCirujano = new Cirujano();

        //System.out.println("Tratar pacientes");
        System.out.println("Medico General:");
        medicoGeneral.tratarPaciente();
        System.out.println("Medico a Domicilio:");
        medicoDomicilio.tratarPaciente();
        medicoDomicilio.aconsejaPacientes();
        System.out.println("Medico a Cirujano:");
        medicoCirujano.tratarPaciente();
        medicoCirujano.hacerIncision();


    }
}

/*
HERENCIA

La herencia es una relacion de generalizacion/ especializacion entre clases

Las clases se disponen por jerarquia, donde una clase hereda los atributos y metodos de las clases superiores en jerarquia

Una clase puede tener sus propios atributos y metodos a mas de los heredados

Una clase puede modificar los metodos y atributos que se han heredado

Relaciones de Herencia

Las clases por encima de la jerarquia se denominan superclases
Las clases por debajo de la jerarquia se denominan subclases
Una clase puede ser subclase y superclase a la vez

Tipos de herencia
- Simple
- Multiple (no soporta java)

Implementacion de la herencia
Se utiliza la palabra reservada "extends"

Declaracion

modificador_acceso class NombreClase extends SuperClase{

}

Ejemplo
public class ProgramacionJava extends LenguajesProgramacion{

}

Ejemplo

Medico
  |- MedicoDe

Ejercicio

- Cuántos atributos tiene la clase Cirujano?  R: 1
- Cuántos atributos tiene la clase MedicoDeCabecera?  R: 2
- Cuántos metodos tiene la clase Medico?  R: 1
- Cuántos metodos tiene la clase Cirujano?  R: 2
- Cuántos metodos tiene la clase MedicoDeCabecera?  R: 2
- Puede un MedicoDeCabecera tratar pacientes?  R: SI
- Puede un MedicoDeCabecera hacer incisiones?  R: NO














 */