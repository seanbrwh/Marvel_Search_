package Comic;

import java.util.ArrayList;
import java.util.List;

public class Events {
    private Integer available;
    private String collectionURI;
    private List<Object> items = new ArrayList<Object>();
    private Integer returned;

    public Integer getAvailable() {
        return available;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public List<Object> getItems() {
        return items;
    }

    public Integer getReturned() {
        return returned;
    }
}
