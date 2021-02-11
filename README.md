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


4. A partir de las clases de equivalencia identificadas en el punto 2, identifique las condiciones límite o
de frontera de las mismas.  


5. Para cada una de las condiciones de frontera anteriores, defina casos de prueba específicos.  
