# Tarea #1: Sistema de Búsqueda de Rutas - Documentación

## Descripción

En esta tarea, hemos desarrollado un sistema de búsqueda de rutas para llegar a ubicaciones dentro de un mapa, utilizando Java 17 y Prolog con la biblioteca JPL para la conexión entre ambos lenguajes. El objetivo es proporcionar a los usuarios la capacidad de encontrar rutas entre veinticinco tipos de establecimientos, como centros de estudios, centros de salud, gasolineras, parques, eco parques, y centros comerciales.

## Prerequisitos

Asegúrese de cumplir con los siguientes requisitos antes de ejecutar la aplicación:

1. **Instalar Java JDK 17**:
   - Descargue e instale Java JDK 17 desde el siguiente enlace: [Descargar Java JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

2. **Instalar Prolog**:
   - Descargue e instale Prolog desde el siguiente enlace: [Descargar Prolog](https://www.swi-prolog.org/download/stable)

3. **Configurar Variables de Entorno**:
   - Añada las siguientes rutas al Path del sistema en Windows:
     - C:\Program Files\swipl\bin
     - C:\Program Files\swipl\lib\jpl.jar
     - C:\Program Files\Java\jdk-17\bin

## Funcionalidades

Nuestra aplicación ofrece las siguientes funcionalidades:

1. **Rotulación de Establecimientos**:
   - Los establecimientos de interés se muestran en el mapa con etiquetas para facilitar la ubicación.

2. **Búsqueda de Rutas**:
   - Permite a los usuarios visualizar la forma de llegar de un punto A a un punto B en el mapa.
   - Realiza trazos en forma de línea continua para trazar la ruta.

3. **Respeto por los Sentidos de las Calles**:
   - La aplicación considera los sentidos de las calles, ya sean de una vía o de dos vías al calcular las rutas.

4. **Búsqueda de Rutas mediante Prolog**:
   - La búsqueda de rutas se realiza con la ayuda de una base de conocimiento de Prolog, que permite una planificación eficiente.

5. **Interfaz en Java**:
   - La visualización y manipulación de la aplicación se realiza en lenguaje Java.
   - La interfaz diseñada en Java se conecta a la base de conocimiento en Prolog para solicitar búsquedas y recibir retroalimentación.

## Instrucciones de Uso

1. Asegúrese de haber instalado Java JDK 17 y Prolog según los prerequisitos mencionados anteriormente.

2. Descargue el proyecto de la aplicación.

3. Compile y ejecute el proyecto en su entorno de desarrollo.

4. La interfaz de la aplicación le permitirá seleccionar un punto de inicio y un punto de destino en el mapa.

5. Haga clic en "Calculate" para que la aplicación utilice Prolog para calcular la ruta y la presente en el mapa.

## Recursos Adicionales

- Documentación de Java JDK 17: [Oracle JDK 17 Documentation](https://docs.oracle.com/en/java/javase/17/)
- Documentación de Prolog: [SWI-Prolog Documentation](https://www.swi-prolog.org/Documentation.html)

## Colaboradores

Este proyecto fue desarrollado por:
- Calderón Rendón Christopher Gerardo **00069920**
- Escobar Vásquez Kevin Jefferson **00116120**
- Paz Quinteros Erika Andrea **00117420**
 

