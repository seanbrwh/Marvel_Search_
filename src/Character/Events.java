package Character;

import java.util.ArrayList;
import java.util.List;

public class Events {
    private Integer available;
    private String collectionURI;
    private List<Item__3> items = new ArrayList<Item__3>();
    private Integer returned;

    public Integer getAvailable() {
        return available;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public List<Item__3> getItems() {
        return items;
    }

    public Integer getReturned() {
        return returned;
    }
}
