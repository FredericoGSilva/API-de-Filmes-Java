import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        
        var url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
        var addres = URI.create(url);
        var clientHttp = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(addres).GET().build();

        HttpResponse<String> response = clientHttp.send(request, BodyHandlers.ofString());

        String body = response.body();

        List<Map<String, String>> listaDeFilmes = JsonParser.parse(body);


    }
}