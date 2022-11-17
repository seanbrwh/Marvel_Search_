package Comic;

import java.util.ArrayList;
import java.util.List;

public class Characters {
    private Integer available;
    private String collectionURI;
    private List<Item__1> items = new ArrayList<Item__1>();
    private Integer returned;

    public Integer getAvailable() {
        return available;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public List<Item__1> getItems() {
        return items;
    }

    public Integer getReturned() {
        return returned;
    }
}
