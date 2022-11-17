package Character;

import java.util.ArrayList;
import java.util.List;

public class Stories {
    private Integer available;
    private String collectionURI;
    private List<Item__2> items = new ArrayList<Item__2>();
    private Integer returned;

    public Integer getAvailable() {
        return available;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public List<Item__2> getItems() {
        return items;
    }

    public Integer getReturned() {
        return returned;
    }
}
