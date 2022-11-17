package Character;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private Integer offset;
    private Integer limit;
    private Integer total;
    private Integer count;
    private List<Result> results = new ArrayList<Result>();

    public Integer getOffset() {
        return offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getCount() {
        return count;
    }

    public List<Result> getResults() {
        return results;
    }
}
