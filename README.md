# CVDS2-LAB03
## Integrantes:

+ cristian camilo piñeros
+ Juan sebastian garcia 

##  Compilar y Ejecutar
El comando para ejecutar las pruebas unitarias de un proyecto en Maven es `mvn test`.

# AeroDescuentos
1. De acuerdo con lo indicado, y teniendo en cuenta que NO hay precondiciones, en qué casos se debería
arrojar una excepción de tipo ExcepcionParametrosInvalidos?. Agregue esto a la especificación.

*si los parametros son negativos o 0*

2. En la siguiente tabla enumere un conjunto de clases de equivalencia que -según usted- creen una
buena división del conjunto de datos de entrada de la función anterior:
Número Clase de equivalencia (en lenguaje natural o matemático). Resultado
correcto / incorrecto.

+ edad < 0 
+ valor <= 0
+ dias habiles < 0
+ descuento menor de edad 
+ descuento mayor 65 
+ descuento 20 dias anticipados 
+ sin descuentos 
+ descuento mayor 65 y 20 dias anticipados
+ descuento menor 18 y 20 dias anticipados 


3. Para cada clase de equivalencia, defina un caso de prueba específico, definiendo: parámetros de
entrada y resultados esperados.    


edad < 0  
       /**calculo.calculoTarifa(10000,5,-24); throws Exception**/
valor <= 0  
       /**calculo.calculoTarifa(-10000,5,24); throws Exception**/
dias habiles < 0  
       /**calculo.calculoTarifa(10000,-5,24); throws Exception**/
descuento menor de edad      
       /**calculo.calculoTarifa(10000,12,16) -> 9500**/
descuento mayor 65   
       /**calculo.calculoTarifa(10000,12,68) -> 9200**/
descuento 20 dias anticipados 
       /**calculo.calculoTarifa(10000,21,20) -> 7500**/
sin descuentos   
       /**calculo.calculoTarifa(10000,5,24) -> 10000**/
descuento mayor 65 y 20 dias anticipados  
       /**calculo.calculoTarifa(10000,21,68) -> 7700**/
descuento menor 18 y 20 dias anticipados   
       /**calculo.calculoTarifa(10000,21,68) -> 8000**/

