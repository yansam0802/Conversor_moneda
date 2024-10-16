import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Moneda {



    Convertidor convierteMoneda(double cantidad, String tipoMoneda1, String tipoMoneda2, String apiKey){
    
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/"+
               tipoMoneda1 + "/" + tipoMoneda2 + "/" + cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Convertidor.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Hubo un error, intentalo nuevamente");
        }
    }
}
