# ESTRUCTURAS DE DATOS
<p>Una estructua de datos es una manera particular de organizar los datos y/o informacion, 
de tal manera que luego se pueda realizar algunas operaciones eficientes con dichas 
estructuras. </p>

## Arreglos (Arrays)
<p>El arreglo es una estructura de datos que nos permite almacenar varios elementos 
del mismo tipo de dato.

La longitus de un arreglo se establece cuando creamos el arreglo.

Cuando se define el tamanio de un arreglo ya no lo podemos modificar.

El elemento de un arreglo es el valor que se encuentra almacenado en una de sus posiciones,
y a estas posiciones se les denomina indices.

La declaracion del arreglo se realiza definiendo el tipo de dato que se va a calmacenar y los 
corchetes.</p>

### Declaracion
<p>modificador_acceso tipo[] nombre;</p>

```
public char[] alfabeto;

private String[] nombresMascotas;

protected int[] numeros;

public Animal[] granja;

```
<p>Los arreglos pueden almacenar tipos de atos primitivos y tipos de datos complejos.

Si no e inicializa el arreglo por defecto se asigna el valor de null.

La creacion del arreglo se lo realiza usando la palabra reservada **new**</p>

```
protected int[] numeros = new int[10];

private String[] nombresMascotas = new String[5];

public Animal[] granja = new Animal[4]; 

```
### Inicializacion
<p>Podemos crear un arreglo incializando cada una de sus posiciones con un valor determinado,
esto se lo realiza igualando el arreglo a una lista de valores entre llaves{} y separado
por comas (,) </p>

```
protected int[] numeros = {1, 2, 3, 4, 5, 6 ,7 ,8 ,9 ,0};

private String[] nombresMascotas = {"Toby", "Oso", "Boby"};

```

<p>La primera posicion de un arreglo, es la posicion 0, para acceder usamos el nombre del arreglo
seguido de corchetes [] y la posicion a la que se desea acceder.</p>

```
numero[9] 11;

```

## Arreglos Multidimensionales


