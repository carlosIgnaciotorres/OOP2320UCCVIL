# Ejercicio de encapsulación de datos

## Enunciado:
Diseñar una clase que represente un carro. La clase debería tener ocho atributos segun la siguiente tabla: 
|Atributo| Tipo |Restriccion de Acceso|
|---|---|---|
|modelo| Cadena | Solo accesible desde la clase | 
|color| Cadena |Solo accesible desde la clase | 
|velocidadMaxima |Numerico con decimal|Solo accesible desde la clase, no modificable | 
|velocidad |Numerico con decimal|Solo accesible desde la clase | 
|combustibleMaximo| Numerico |Solo accesible desde la clase, no modificable|
|combustible| Numerico |Solo accesible desde la clase |
|estado| verdadero o falso|Solo accesible desde la clase | 
|consumo| Numerico con decimal |Solo accesible desde la clase, no modificable | 

La clase también debe tener métodos:
| Metodo | Tipo |Atributos | Resultados| Comprobaciones|
|-----|-----|-----|-----|-----|
| CONSTRUCTOR |???|Todos| |inicializar en los valores de los atributos |
| CONSTRUCTOR |???|Ninguno||Inicializar cadenas en "", numeros en 0 y booleano en falso| 
| arrancar| público|Ninguno|Cambia estado del carro|Si ya esta andando|
| parar| público|Ninguno|Cambia estado del carro|Si esta parado|
| acelerar| público|Velocidad|Aumenta la velocidad, si es posible| comprueba la velocidad respecto a la máxima|
| desacelerar| público|Velocidad|Disminuye la velocidad| comprueba la velocidad respecto a la minima|
| repostar| público|Combustible|Aumenta el combustible|comprueba la cantidad respecto a la capacidad máxima|
| viaje| público|Tiempo y Velocidad| disminuye la cantidad de combustible segun el consumo si puede completar el viaje|comprueba el estado y cantidad de combustible|
| mostrar la información del carro| público|Ninguno|||
 
 Si la salida de alguno de los metodos no cumple con la comprobación se debe generar un ERROR en el Metodo, así si el carro esta apagado y se acelera debe devolver **ERROR ACELERAR**

### Notas importantes:
* Se debe *documentar* el código
* Se recomienda el uso de Java
* Para la **Encapsulación** se deben crear los metodos gets y sets utilizando nomenclatura *camelCase*, segun lo indicado, si no es necesario un metodo no lo cree.
