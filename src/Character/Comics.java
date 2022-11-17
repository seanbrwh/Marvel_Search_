package Character;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;

public class Comics {
    private Integer available;
    private String collectionURI;
    private List<Item> items = new ArrayList<Item>();
    private Integer returned;

    public Integer getAvailable() {
        return available;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public List<Item> getItems() {
        return items;
    }

    public Integer getReturned() {
        return returned;
    }
}
