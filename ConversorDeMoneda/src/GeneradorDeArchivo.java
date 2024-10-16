import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeneradorDeArchivo {

    public void guardarJson(List<Convertidor> conversiones) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        // Crear un nombre de archivo único basado en la fecha y hora actual
        String nombreArchivo = "historial_conversiones_" + ".json";

        // Escribir los datos en el archivo JSON
        try (FileWriter escritura = new FileWriter(nombreArchivo)) {
            escritura.write(gson.toJson(conversiones)); // Convertir la lista de conversiones a JSON
            System.out.println("Historial de conversiones guardado en: " + nombreArchivo);
        }
    }
}
