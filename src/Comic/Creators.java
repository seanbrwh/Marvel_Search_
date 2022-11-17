package Comic;

import java.util.ArrayList;
import java.util.List;

public class Creators {
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
