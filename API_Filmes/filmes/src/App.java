import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class App {
    public static void main(String[] args) {
        
        var url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";

        var addres = URI.create(url);
        var clientHttp = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(addres).GET().build();

        
    }
}