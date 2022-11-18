import java.sql.Timestamp;
import io.github.cdimascio.dotenv.Dotenv;
public class BuildURI {
    Dotenv dotenv = Dotenv.load();
    private final String BASE_URL = "https://gateway.marvel.com:443/v1/public/";
    private final String PUBLIC_KEY = dotenv.get("PUBLIC_KEY");
    private final String PRIVATE_KEY = dotenv.get("PRIVATE_KEY");

}
