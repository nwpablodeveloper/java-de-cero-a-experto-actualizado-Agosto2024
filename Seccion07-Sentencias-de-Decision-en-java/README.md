# Seccion07: Sentencias de Decision en java

[V74 Sentencias de Control en Java - PDF](V74_Sentencias_de_Control_en_Java/06-01-00-SentenciasDecision-UJ.pdf)

[V75 Diagrama de flujo](https://www.udemy.com/course/universidad-java-especialista-en-java-desde-cero-a-master/learn/lecture/44838409#overview)

[V76 Sentencia IF en Java](V76_Sentencia_IF_en_Java/src/SentenciaIf.java)

[V77 Sentencia IF ELSE en java](V77_Sentencia_IF_ELSE_en_Java/src/SentenciaIfElse.java)


[V78 Sentencia IF ELSEIF ELSE en Java](V78_Sentencia_IF_ELSEIF_ELSE_en_Java/src/SentenciaElseIf.java)

[V79 Ejecución Paso a Paso (Modo Debug)](https://www.udemy.com/course/universidad-java-especialista-en-java-desde-cero-a-master/learn/lecture/44838447#overview)
- Crear punto de rotura
 1. Agregar un punto en la numeración izquierda de Intellij IDEA
 2. Click derecho y ejecutar modo Debug ( Mayus + F9 )
 3. F8 para continuar paso a paso 


[V80 Ejemplo Valor Positivo](V80_Ejemplo_Valor_Positivo/src/ValorPositivo.java)
- Ingresar un número entero e imprimir si el mismo es Positivo, Negativo 
    o es igual a Cero

[V81 Reto - Tienda en línea con descuento](V81_Reto_Tienda_en_Linea_con_Descuento/src/TiendaEnLinea.java)
- Crear un sistema que ofrezca descuentos dependiendo del monto de la compra,
    o si es miembro de la tienda. 

- Si ha comprado más de $ 1.000 y es miembro de la tienda:
    10% de descuento

- Si solo es miebro de la tienda
    5% de descuento

- Si compro menos de $ 1.000 y NO es miembro
    0% de descuento


[V82 Solución - Tiende en Línea con Descuento](V82_Solucion_Tienda_en_Linea_con_Descuento/src/TiendaEnLinea.java)

[V83 Ejemplo Sistema Bancario](V83_Ejemplo_Sistema_Bancario/src/SistemaBancario.java)
- Considerando que estamos dentro de un sistema bancario, se
    solicita preguntar al usuario si desea continuar
    dentro del sistema
- Utilizando el operador not (!) para aplicar una lógica inversa
    se debe programar las siguientes condiciones: 
1. Si no deseamos salir del sistema, imprimir:
    Continuamos dentro del sistema...
2. De lo contrario, imprimir: 
    Saliendo del sistema


[V84 Ejemplo - Casa de los Espejos](V84_Ejemplo_Casa_de_los_Espejos/src/CasaDeLosEspejos.java)
- Supón que estas en un parque de diversiones y quieres entrar a la
    casa de los espejos.
    Sin  embargo debes de cumplir con algunas condiciones.
    1. Debes de tener más de 10 años. 
    2. No debe darte miedo la oscuridad
   
- Si se cumplen las condiciones anteriores puedes entrar.

- Para realizar este ejemplo vamos a utilizar el oprador NOT
    para aplicar la lógica inversa


[V85 Operador Ternario en Java - PDF](V85_Operadro_Ternario_en_Java/Docs/06-12-00-OperadorTernario-UJ.pdf)
 * [OperadorTernario.java](V85_Operadro_Ternario_en_Java/src/OperadorTernario.java)

[V86 Aplicación Salud y Firness](V86_Aplicacion_Salud_y_Fitness/src/SaludYFitness.java)
- Se solicita crear una aplicación de salud y fitness que solicite
    lo siguiente:
    1. Nombre del usuario
    2. Pasos caminados en el día

- Ademas definiremos las siguientes constantes:
    1. META_PASOS_DIARIOS = 10000
    2. CALORIAS_POR_PASO = 0.04

- Con los valores anteriores debemos calcular las calorias 
    quemadas según los pasos caminados.
```
    calorias_quemadas = pasos_diarios * CALORIAS_POR_PASO;
```
- Y verificamos si se cumplió la meta de pasos diarios
```
    meta_alcanzada = pasos_diarios >= META_PASOS_DIARIOS
```


[V87 Reto - Sistema de Reserva de Hotel](V87_Reto_Sistema_de_Reserva_de_Hotel/src/SistemaReservaHotel.java)
- Se solicita  crear un sistema de reservación de un hotel.
    1. Nombre del cliente
    2. Días de estadia en el hotel
    3. Cuarto con vista al mar?

- El hotel tiene las siguientes tarifas:
    1. Cuarto sin vista al mar: $ 150.50 por día
    2. Cuarto con vista al mar: $ 190.50 por día

- El sistema de calcular el costo total de la estadía
    dependiendo si escogío un cuarto con vista al mar o no
    Además de indicar si escogió un cuarto con vista al mar o no

[V88 Solución - Sistema de Reserva de Hotal](V88_Solucion_Sistema_de_Reserva_de_Hotel/src/SistemaReservaHotel.java)

[V89 Reto - Mayor de dos Números](V89_Mayor_de_dos_Numeros/src/NumeroMayor.java)
- Crear un program para indicar cual es el mayor
    de los dos números.

- El programa debe pedir al usuario dos números enteros.

- Posteriormete se deben comparar y mandar a imprimir el nro. mayor:


[V90 Solución - El Mayor de dos números](V90_Solucion_Mayor_de_dos_Numeros/src/MayorDeDosNumeros.java)

[V91 Reto- Estación del año](V91_Reto_Estacion_del_Anio/src/EstacionDelAnio.java)
- Identificar la estación del año.

- Se solicita porporcionar el valor de un mes ( entre 1 y 12 )
    e indicar la estación del año según lo siguiente:
    1. Meses 1, 2, 12 => Invierno
    2. Meses 3, 4, 5 => Primavera
    3. Meses 6, 7, 8 => Verano
    4. Meses 9, 10, 11 => Otoño

- Cualquier otro valor => Estación desconocida


[V92 Solución - Estación del año](V92_Solucion_Estacion_del_Anio/src/EstacionAnio.java)

[V93 Sentencia Switch en Java - PDF](V93_Sentencia_Switch_en_Java/06-20-00-SentenciasSwitch-UJ.pdf)

[V94 Ejemplo día de la semana con Switch](V94_Ejemplo_dia_de_la_Semana_con_Switch/src/DiaSeamana.java)
- Día e la Semana con numero

| Número | día |
|---|---|
|1|Lunes|
|2|Martes|
|3|Miercoles|
|4|Jueves|
|5|Viernes|
|6|Sabado|
|7|Domingo|
|7|Domingo|

[Volver](../)