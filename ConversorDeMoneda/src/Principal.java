import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese su apiKey: ");
        var apiRest = lectura.next();
        // d8acd221bf56708a93df4746

        var opcion = 0;

        ConversorMoneda conversor = new ConversorMoneda();

        while (opcion != 9) {
            System.out.println("""
                *******************************************
                *!Sea Bienvenido/a al Conversor de Moneda!*
                *******************************************

                Escribe el número de la opción para convertir la moneda:

                1 - Dolar ==> Peso Argentino
                2 - Peso Argentino ==> Dolar
                3 - Dolar ==> Peso Colombiano
                4 - Peso Colombiano ==> Dolar
                5 - Dolar ==> Peso Mexicano
                6 - Peso Mexicano ==> Dolar
                7 - Dolar ==> Euro
                8 - Euro ==> Dolar
                9 - Salir
                """);

            System.out.print("Seleccione una opción: ");
            opcion = lectura.nextInt();

            if (opcion >= 1 && opcion <= 8) {
                System.out.println("Digite el valor: ");
                var cantidad = lectura.nextDouble();
                conversor.convertirMoneda(opcion, cantidad, apiRest);  // Llamar a la clase ConversorMoneda
            } else if (opcion == 9) {
                conversor.convertirMoneda(opcion, 0, apiRest); // Caso para salir
            } else {
                System.out.println("OPCIÓN INVÁLIDA");
            }
        }

        lectura.close(); // Cerramos el scanner
    }
        }



