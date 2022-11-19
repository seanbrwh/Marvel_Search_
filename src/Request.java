import Character.Character;
import Comic.Comic;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.function.Supplier;

public class Request {

    public static HttpResponse<Supplier<Character>> getCharacter(String Uri) throws IOException, URISyntaxException{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(new URI(Uri)).build();

        try{
            HttpResponse<Supplier<Character>> response = client.send(request, new JsonBodyHandler<>(Character.class));
            return response;
        } catch (IOException | InterruptedException exception){
            throw new IOException(exception);
        }
    }

    public static HttpResponse<Supplier<Comic>> getComic(String Uri) throws IOException, URISyntaxException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(new URI(Uri)).build();

        try{
            HttpResponse<Supplier<Comic>> response = client.send(request, new JsonBodyHandler<>(Comic.class));
            return response;
        }catch (IOException | InterruptedException exception){
            throw new IOException(exception);
        }
    }
}
