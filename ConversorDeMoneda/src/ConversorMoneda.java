import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ConversorMoneda {

    private final GeneradorDeArchivo generadorDeArchivo = new GeneradorDeArchivo();
    private final List<Convertidor> historialConversiones = new ArrayList<>(); // Lista para almacenar conversiones
    String fechaYHoraActual;

    public void convertirMoneda(int opcion, double cantidad, String apiRest) {

        try {
            Moneda convertirMoneda = new Moneda();

            switch (opcion) {
                case 1 -> realizarConversion(convertirMoneda, cantidad, "USD", "ARS", apiRest);
                case 2 -> realizarConversion(convertirMoneda, cantidad, "ARS", "USD", apiRest);
                case 3 -> realizarConversion(convertirMoneda, cantidad, "USD", "COP", apiRest);
                case 4 -> realizarConversion(convertirMoneda, cantidad, "COP", "USD", apiRest);
                case 5 -> realizarConversion(convertirMoneda, cantidad, "USD", "MXN", apiRest);
                case 6 -> realizarConversion(convertirMoneda, cantidad, "MXN", "USD", apiRest);
                case 7 -> realizarConversion(convertirMoneda, cantidad, "USD", "EUR", apiRest);
                case 8 -> realizarConversion(convertirMoneda, cantidad, "EUR", "USD", apiRest);
                case 9 -> {
                    System.out.println("Saliendo del programa...");
                    generadorDeArchivo.guardarJson(historialConversiones); // Guardar todas las conversiones
                }
                default -> System.out.println("Opción inválida.");
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("Error en la conversión o al guardar el JSON: " + e.getMessage());
        }
    }

    private void realizarConversion(Moneda convertirMoneda, double cantidad, String baseMoneda, String targetMoneda, String apiRest) {

        fechaYHoraActual = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        Convertidor convertidor = convertirMoneda.convierteMoneda(cantidad, baseMoneda, targetMoneda, apiRest);
        System.out.printf("El valor ---> %.2f [%s] son %.2f [%s]\n\n",
                cantidad, baseMoneda, convertidor.conversion_result(), targetMoneda);
        historialConversiones.add(new Convertidor(baseMoneda, targetMoneda, convertidor.conversion_result(), cantidad, fechaYHoraActual));
    }
    }

