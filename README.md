# Actividad 1

Java básico

Dentro de un mismo repositorio se debe de generar un paquete para cada numeral, es decir, para
el numeral uno y todos sus puntos deben estar en un paquete, y así cada numeral.
Cada paquete debe tener un main, es decir, un archivo de ejecución y este debe poder correr de
manera independiente.
Es necesario que cada ejercicio se solucione siguiendo el paradigma de POO, y todo lo visto
durante la sección.
1. Un usuario desea tener un sistema donde pueda llenar un historial de clientes, que van a
su tienda. Para este ejemplo, por favor haga uso de arreglos, la primera instancia del
arreglo debe ser de tamaño 4.
Para esto desea que se realice un menú, en el cual se tengan 5 opciones.
a. Añadir nuevo cliente
b. Borrar un cliente
c. Buscar un cliente
d. Mostrar los clientes
e. Salir.

Se debe de mostrar algo así:

Cuando se seleccione la opción “a”: Se debe permitir añadir el nuevo cliente, para lo cual
se debe de pedir el nombre y cedula. Se debe comprobar que el nombre no tenga ningún
número y que la cedula solo tenga números, en caso contrario debe salir un mensaje que
me diga que no es posible usar el valor y volver al menú inicial.
Si los datos ingresados son correctos se debe ingresar el cliente, este siempre se inserta al
final del array, tenga en cuenta que el sistema solo debe permitir un número de máximo
10 clientes en el arreglo, en caso de que no haya espacio se le debe mostrar un mensaje
que diga: “Debe borrar un cliente antes de poder ingresar uno nuevo” y mostrar el menú
principal.
Cuando se seleccione la opción “b”: Se debe mostrar un mensaje pidiendo el número de la
posición del cliente a borrar, y se debe de borrar el cliente en esa posición.

En caso de que al borrar el cliente en la siguiente posición exista otro cliente, el siguiente
cliente debe pasar a ocupar la nueva posición liberada, ejemplo:
Se tiene el siguiente arreglo, y se elimina a Mateo

Entonces el array debe quedar así, con un tamaño de 4:

El tamaño mínimo del arreglo en todo momento debe ser de 4, es decir, si se elimina otro
cliente, por ejemplo, Jorge entonces el array quedará así:

En caso tal de que se ingrese una posición que no exista en el arreglo, se debe de controlar
la excepción.
Cuando se seleccione la opción “c”: Se debe de mostrar un mensaje donde se indique el
cliente a buscar, ese se debe de buscar por el número de cedula, y se debe de mostrar el
cliente y su posición, Ejemplo: “El cliente que se busca está en la posición 0, El cliente se
llama JUAN y su cédula es 1”
Cuando se seleccione la opción “d”: Se debe de mostrar todos los clientes de la siguiente
manera:
Cliente número 1: El cliente se llama Juan y su cédula es 1.
Cliente número 2: El cliente se llama Roma y su cédula es 12.
….
Cuando se seleccione la opción “e”: Se debe terminar la ejecución del programa.

2. Siguiendo con el mismo ejercicio, ahora se debe de tiene la condición de que no puede
haber dos clientes con la misma cédula, realice el mismo ejercicio, pero con esta variación,
ya no es necesario el uso de arreglos, y no se tiene un máximo y un mínimo de tamaño.

Cuando se seleccione la opción “a”: Se debe permitir añadir el nuevo cliente, para lo cual
se debe de pedir el nombre y cedula. Se debe comprobar que el nombre no tenga ningún
número y que la cedula solo tenga números, en caso contrario debe salir un mensaje que
me diga que no es posible usar el valor y volver al menú inicial.
Si los datos ingresados son correctos se debe ingresar el cliente, en caso de que el cliente
ya exista, se le debe indicar al usuario que el cliente ya existe con esa cedula. Y volver al
menú anterior.
Cuando se seleccione la opción “b”: Se debe mostrar un mensaje pidiendo el número de la
cedula a borrar, se debe contralar la posible excepción de que la cedula no exista o
mostrar un mensaje de borrado con éxito dado el caso que se pueda eliminar.
Cuando se seleccione la opción “c”: Se debe de mostrar un mensaje donde se indique el
cliente a buscar, ese se debe de buscar por el número de cedula, y se debe de mostrar el
cliente y su posición, Ejemplo: “El cliente que se busca está en la posición 0, El cliente se
llama JUAN y su cédula es 1”
Cuando se seleccione la opción “d”: Se debe de mostrar todos los clientes y estos deben
estar ordenados de manera alfabética de la siguiente manera:
Cliente número 1: El cliente se llama Juan y su cédula es 1.
Cliente número 2: El cliente se llama Roma y su cédula es 12.
….
Cuando se seleccione la opción “e”: Se debe terminar la ejecución del programa
3. Para esta solución se debe tener un menú con las siguientes opciones:
a. Menú de clientes
b. Menú de productos
c. Salir
Cuando se seleccione la opción “a”: Me debe de mostrar el menú igual al del punto uno,
pero en este caso se deben usar las listas para la implementación, no hay restricción de
tamaños, tampoco hay restricción de número de cédulas, en este caso el cliente tendrá un
campo adicional que será una lista de productos.
Por favor para este punto haga el mayor uso posible de streams.

 Cuando seleccione añadir un cliente: Se debe de poder añadir un cliente,
solo con número de cedula y nombre, no debe pedir ningún producto.
 Cuando seleccione borrar cliente: Se debe de borrar un cliente por
número de cedula, validar excepciones
 Cuando se seleccione buscar un cliente: Se podrá buscar un cliente por
número de cedula, cuando realice esta búsqueda se debe mostrar:
El cliente NOMBRE identificado con cédula NUMERO tiene los siguientes
productos:
1 – Producto Nombre con una cantidad de X
Valor unitario: X

Valor Antes de Iva: x
Valor Iva: X
Valor total: X
Esto para cada producto que se tenga asociado.
 Cuando seleccione mostrar clientes: Se debe de mostrar todos los
clientes registrados, mostrando nombre, cedula, y los productos por
cada cliente, pero solo el nombre, cantidad y valor total.
Adicional se deben tener estas opciones:
 Cuando seleccione modificar cliente: Se debe buscar un cliente a
modificar, y solo se le puede cambiar nombre
 Cuando se seleccione agregar un producto: Se debe permitir que el
cliente añada un producto a la lista de productos, para esto primero
debe de haber por lo menos un producto, de lo contrario se debe de
pedir al usuario que lo añada. Para agregarlo, el usuario solo debe de
copiar el nombre del producto y la cantidad de productos a comprar.
Con esto ya puede añadir un producto a su lista de productos. Si intento
añadir un producto que ya tenga en la lista, me debe de sumar las
nuevas cantidades. Tenga en cuenta que se debe de pedir la cédula del
cliente que se va a modificar, si no existe se debe informar.
 Aplicar descuento por: Cuando se seleccione esta debe de filtrar si un
cliente tiene más de 6 artículos iguales y el total de la compra supera los
200.000 se le aplica un descuento del 10% sobre el total de la compra.
Me debe de mostrar los clientes que se les aplico descuento
 Regresar al menú anterior: Se debe volver al menú anterior.
Cuando se seleccione la opción “b”: Se mostrar un menú con:
 Añadir: Debe pedir el nombre del producto y su valor unitario
 Borrar: Debe borrar el producto por el nombre
Use la estructura de datos que vea más adecuada para esto.

En la parte aritmética tenga en cuenta y capture las posibles excepciones, puede usar try catch
