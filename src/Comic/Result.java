package Comic;

import java.util.ArrayList;
import java.util.List;

public class Result {
    private Integer id;
    private Integer digitalId;
    private String title;
    private Integer issueNumber;
    private String variantDescription;
    private String description;
    private String modified;
    private String isbn;
    private String upc;
    private String diamondCode;
    private String ean;
    private String issn;
    private String format;
    private Integer pageCount;
    private List<TextObject> textObjects = new ArrayList<TextObject>();
    private String resourceURI;
    private List<Url> urls = new ArrayList<Url>();
    private Series series;
    private List<Variant> variants = new ArrayList<Variant>();
    private List<Object> collections = new ArrayList<Object>();
    private List<CollectedIssue> collectedIssues = new ArrayList<CollectedIssue>();
    private List<Date> dates = new ArrayList<Date>();
    private List<Price> prices = new ArrayList<Price>();
    private Thumbnail thumbnail;
    private List<Image> images = new ArrayList<Image>();
    private Creators creators;
    private Characters characters;
    private Stories stories;
    private Events events;

    public Integer getId() {
        return id;
    }

    public Integer getDigitalId() {
        return digitalId;
    }

    public String getTitle() {
        return title;
    }

    public Integer getIssueNumber() {
        return issueNumber;
    }

    public String getVariantDescription() {
        return variantDescription;
    }

    public String getDescription() {
        return description;
    }

    public String getModified() {
        return modified;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getUpc() {
        return upc;
    }

    public String getDiamondCode() {
        return diamondCode;
    }

    public String getEan() {
        return ean;
    }

    public String getIssn() {
        return issn;
    }

    public String getFormat() {
        return format;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public List<TextObject> getTextObjects() {
        return textObjects;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public List<Url> getUrls() {
        return urls;
    }

    public Series getSeries() {
        return series;
    }

    public List<Variant> getVariants() {
        return variants;
    }

    public List<Object> getCollections() {
        return collections;
    }

    public List<CollectedIssue> getCollectedIssues() {
        return collectedIssues;
    }

    public List<Date> getDates() {
        return dates;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public List<Image> getImages() {
        return images;
    }

    public Creators getCreators() {
        return creators;
    }

    public Characters getCharacters() {
        return characters;
    }

    public Stories getStories() {
        return stories;
    }

    public Events getEvents() {
        return events;
    }
}
