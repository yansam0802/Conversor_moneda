CURRENCY CONVERTER

Este proyecto es una aplicación de conversión de monedas que permite convertir entre diferentes divisas utilizando datos de tipo de cambio en tiempo real a través de una API. 
El proyecto está desarrollado en Java y hace uso de la biblioteca HttpClient para realizar solicitudes HTTP a la API exchangeRate y manejar la respuesta en formato JSON.

Funcionalidades:

  * Conversión de Monedas: Convierte entre múltiples divisas usando tasas de cambio actualizadas.
  * Historial de Conversiones: Guarda todas las conversiones realizadas con marca de tiempo en un archivo JSON.
  * Interfaz de Usuario: Consola interactiva para ingresar el valor y seleccionar las monedas de origen y destino.
  * Formato de Archivo JSON: El historial de conversiones se guarda en un solo archivo JSON cuando el usuario lo solicita, presionando la opción 9.

Tecnologías Utilizadas:
  * Java 22: Lenguaje de programación principal.
  * HttpClient: Para gestionar las solicitudes HTTP a la API de tasas de cambio.
  * API exchangeRate: Fuente de datos para los tipos de cambio en tiempo real.
  * JSON: Formato utilizado para almacenar el historial de conversiones.
  * java.time: Biblioteca utilizada para agregar marcas de tiempo al historial de conversiones.

USO:

  * El usuario ingresa el valor a convertir.
  * Selecciona la moneda de origen y la moneda de destino.
  * Se muestra el resultado de la conversión en tiempo real utilizando la API.
  * El historial de conversiones se almacena automáticamente en formato JSON cuando se selecciona la opción 9 en el menú.

REQUISITOS
  * Java 22 o superior.
  * Conexión a internet para obtener las tasas de cambio actuales.
  * Instalación

Agramos la APIKEY
![PASO1](https://github.com/user-attachments/assets/254d006b-c7ca-436c-80f0-9d2b683c77cb)

Escribimos la opción:
![PASO2](https://github.com/user-attachments/assets/9a7d53ab-c0fb-4765-89dd-cc1ca7700003)

Escribimos el valor a convertir:
![PASO3](https://github.com/user-attachments/assets/a0c97cae-52d0-43a5-9009-b4eacb03b539)

Aquí observamos los resultados:
![RESULTADOPASOS](https://github.com/user-attachments/assets/75c7455a-b0fc-4cd5-8fe1-64cf1b704ac0)


Aquí podemos validar todos los paso:
![TODOSLOSPASOS](https://github.com/user-attachments/assets/a6a00a54-71bf-40e5-8107-1318cbbe31fd)

Aquí podemos observar la finalización del programa con éxito:
![FINDELPROGRAMA](https://github.com/user-attachments/assets/29e8c95b-1672-4e7b-8a38-6dc23904eec5)

Aquí podemos visualizar el archivo convertido a JSON:
![ARCHIVO_CONVERTIDO_JSON](https://github.com/user-attachments/assets/8434b16f-0ca4-4f75-9ec4-6a38044041f4)

