import java.sql.Timestamp;

import io.github.cdimascio.dotenv.Dotenv;

public class BuildURI {
    Dotenv dotenv = Dotenv.load();
    private final String PUBLIC_KEY = dotenv.get("PUBLIC-KEY");
    private final String PRIVATE_KEY = dotenv.get("PRIVATE-KEY");
    private final Timestamp TIME = new Timestamp(System.currentTimeMillis());
    private final long TIMESTAMP = TIME.getTime();
    private final String HASH = Md5.createHash(TIMESTAMP + (PRIVATE_KEY + PUBLIC_KEY));


    public  String build(String searchType, String searchTerm, String searchValue) {
        String BASE_URL = "https://gateway.marvel.com:443/v1/public/";
        return BASE_URL + searchType + "?ts=" + TIMESTAMP + "&apikey=" + PUBLIC_KEY + "&hash=" + HASH + "&" + searchTerm + "=" + searchValue;
    }
}
