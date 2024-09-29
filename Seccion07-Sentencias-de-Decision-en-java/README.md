# Seccion07: Sentencias de Decision en java
* [V74 Sentencias de Control en Java - PDF](V74_Sentencias_de_Control_en_Java/06-01-00-SentenciasDecision-UJ.pdf)
* [V75 Diagrama de flujo - Video Udemy](https://www.udemy.com/course/universidad-java-especialista-en-java-desde-cero-a-master/learn/lecture/44838409#overview)
* [V76 Sentencia IF en Java - .java](V76_Sentencia_IF_en_Java/src/SentenciaIf.java)
* [V77 Sentencia IF ELSE en java - .java](V77_Sentencia_IF_ELSE_en_Java/src/SentenciaIfElse.java)
* [V78 Sentencia IF ELSEIF ELSE en Java - .java](V78_Sentencia_IF_ELSEIF_ELSE_en_Java/src/SentenciaElseIf.java)
* [V79 Ejecución Paso a Paso (Modo Debug) - Video Udemy](https://www.udemy.com/course/universidad-java-especialista-en-java-desde-cero-a-master/learn/lecture/44838447#overview)
    - Crear punto de rotura
        * Agregar un punto en la numeración izquierda de Intellij IDEA
        * Click derecho y ejecutar modo Debug ( Mayus + F9 )
        * F8 para continuar paso a paso 
* [V80 Ejemplo Valor Positivo - .java](V80_Ejemplo_Valor_Positivo/src/ValorPositivo.java)
    - Ingresar un número entero e imprimir si el mismo es Positivo, Negativo 
        o es igual a Cero
* [V81 Reto - Tienda en línea con descuento - .java](V81_Reto_Tienda_en_Linea_con_Descuento/src/TiendaEnLinea.java)
    - Crear un sistema que ofrezca descuentos dependiendo del monto de la compra,
        o si es miembro de la tienda. 
    - Si ha comprado más de $ 1.000 y es miembro de la tienda:
        10% de descuento
    - Si solo es miebro de la tienda
        5% de descuento
    - Si compro menos de $ 1.000 y NO es miembro
        0% de descuento
* [V82 Solución - Tiende en Línea con Descuento - .java](V82_Solucion_Tienda_en_Linea_con_Descuento/src/TiendaEnLinea.java)
* [V83 Ejemplo Sistema Bancario - .java](V83_Ejemplo_Sistema_Bancario/src/SistemaBancario.java)
    - Considerando que estamos dentro de un sistema bancario, se
        solicita preguntar al usuario si desea continuar
        dentro del sistema
    - Utilizando el operador not (!) para aplicar una lógica inversa
        se debe programar las siguientes condiciones: 
        * Si no deseamos salir del sistema, imprimir:
            Continuamos dentro del sistema...
        * De lo contrario, imprimir: 
            Saliendo del sistema
* [V84 Ejemplo - Casa de los Espejos - .java](V84_Ejemplo_Casa_de_los_Espejos/src/CasaDeLosEspejos.java)
    - Supón que estas en un parque de diversiones y quieres entrar a la
        casa de los espejos.
        Sin  embargo debes de cumplir con algunas condiciones.
        * Debes de tener más de 10 años. 
        * No debe darte miedo la oscuridad
    - Si se cumplen las condiciones anteriores puedes entrar.
    - Para realizar este ejemplo vamos a utilizar el oprador NOT
        para aplicar la lógica inversa
* [V85 Operador Ternario en Java - PDF](V85_Operadro_Ternario_en_Java/Docs/06-12-00-OperadorTernario-UJ.pdf)
    * [OperadorTernario.java](V85_Operadro_Ternario_en_Java/src/OperadorTernario.java)
* [V86 Aplicación Salud y Firness - .java](V86_Aplicacion_Salud_y_Fitness/src/SaludYFitness.java)
    - Se solicita crear una aplicación de salud y fitness que solicite
        lo siguiente:
        * Nombre del usuario
        * Pasos caminados en el día
    - Ademas definiremos las siguientes constantes:
        * META_PASOS_DIARIOS = 10000
        * CALORIAS_POR_PASO = 0.04
    - Con los valores anteriores debemos calcular las calorias 
        quemadas según los pasos caminados.
    ```
        calorias_quemadas = pasos_diarios * CALORIAS_POR_PASO;
    ```
    - Y verificamos si se cumplió la meta de pasos diarios
    ```
        meta_alcanzada = pasos_diarios >= META_PASOS_DIARIOS
    ```
* [V87 Reto - Sistema de Reserva de Hotel - .java](V87_Reto_Sistema_de_Reserva_de_Hotel/src/SistemaReservaHotel.java)
    - Se solicita  crear un sistema de reservación de un hotel.
        * Nombre del cliente
        * Días de estadia en el hotel
        * Cuarto con vista al mar?
    - El hotel tiene las siguientes tarifas:
        * Cuarto sin vista al mar: $ 150.50 por día
        * Cuarto con vista al mar: $ 190.50 por día
    - El sistema de calcular el costo total de la estadía
        dependiendo si escogío un cuarto con vista al mar o no
        Además de indicar si escogió un cuarto con vista al mar o no
* [V88 Solución - Sistema de Reserva de Hotal - .java](V88_Solucion_Sistema_de_Reserva_de_Hotel/src/SistemaReservaHotel.java)
* [V89 Reto - Mayor de dos Números - .java](V89_Mayor_de_dos_Numeros/src/NumeroMayor.java)
    - Crear un program para indicar cual es el mayor
        de los dos números.
    - El programa debe pedir al usuario dos números enteros.
    - Posteriormete se deben comparar y mandar a imprimir el nro. mayor:
* [V90 Solución - El Mayor de dos números - .java](V90_Solucion_Mayor_de_dos_Numeros/src/MayorDeDosNumeros.java)
* [V91 Reto - Estación del año - .java](V91_Reto_Estacion_del_Anio/src/EstacionDelAnio.java)
    - Identificar la estación del año.
    - Se solicita porporcionar el valor de un mes ( entre 1 y 12 )
        e indicar la estación del año según lo siguiente:
        * Meses 1, 2, 12 => Invierno
        * Meses 3, 4, 5 => Primavera
        * Meses 6, 7, 8 => Verano
        * Meses 9, 10, 11 => Otoño
    - Cualquier otro valor => Estación desconocida
* [V92 Solución - Estación del año - .java](V92_Solucion_Estacion_del_Anio/src/EstacionAnio.java)
* [V93 Sentencia Switch en Java - PDF](V93_Sentencia_Switch_en_Java/06-20-00-SentenciasSwitch-UJ.pdf)
* [V94 Ejemplo día de la semana con Switch - .java](V94_Ejemplo_dia_de_la_Semana_con_Switch/src/DiaSeamana.java)
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
* [V95 Día de la semana con Switch Mejorado - .java](V95_Dia_de_la_Semana_con_Switch_Mejorado/src/DiaSemana.java)
* [V96 Reto - Estación del año con Switch mejorado - .java](V96_Estacion_del_Anio_con_Switch_mejorado/src/EstacionDelAnioMejorado.java)
    - Usar el ejerciocio de estación del año (V91)
        y refactorizarlo con un Switch mejorado
* [V97 Reto - Sistema de Calificaciones - .java](V97_Reto_Sistema_de_Calificaciones/src/SistemaCalificaciones.java)
    - Crar un programa para convertir una calificación numérica ( 0 - 10 )
        a una letra ( de la F a la A )
        * Si es mayor o igual a 9 es una A
        * Si es mayor o igual a 8 y menor a 9 es una B
        * Si es mayor o igual a 7 y menor a 8 es una C
        * Si es mayor o igual a 6 y menor a 7 es una D
        * Si es mayor o igual a 0 y menor a 6 es una F
        * En cualquier otro caso imprimir "Valor Desconocido"
* [V98 Solución Sistema de Calificaciones - .java](V98_Solucion_Sistema_de_Calificaciones/src/SistemaCalificaciones.java)
* [V99 Reto - Sisema de Envios - .java](V99_Reto_Sistema_de_envios/src/SistemaEnvios.java)
    - Crear un programa para determinar el costo de envío de un paquete
        según su el destino ( Nacional o Internacion ) y el pseo
        del paquete.
    - Constatnes
        * Tarifa Nacional = 10 x kilo
        * Tarifa Internacional = 20 x kilo
    - El programa debe solicitar 2 valores: 
        * Destino ( Nacional o Internacional )
        * Peso ( Kilogramo )
    - Al final debe imprimir el costo de envío del paquete
* [V100 Solucion - Sistema de envio - .java](V100_Solucion_Sistema_de_Envios/src/SistemaEnvios.java)
* [V101 Reto - Sistema de Autenticación - .java](V101_Reto_Sistema_de_Autenticacion/src/SistemaAutenticacion.java)
    - Crear un sistema para validar los valores de usuario y
        password proporcionados.
    - Se deben definir 2 constantes con los valores válidos de usuario
        y password.
    - El sistema debe comparar los valores validos contra los
        valores proporcionados.
    - Se debe conciderar 4 casos:
        * Usuario y password válidos imprimir "Bienvendido al Sistema"
        * Usuario Invalido
        * Password Invalido
        * Usuario y Password Invalido
* [V102 Solución - Sistema de Autenticación - .java](V102_Solucion_Sistema_de_Autenticacion/src/SistemaAutenticacion.java)

[Volver](../)