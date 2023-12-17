package HW7_1;

import java.util.List;

public class GenericObject<T> {
    private List<T> data;
    private Pagination pagination;

    public GenericObject(List<T> data, Pagination pagination) {
        this.data = data;
        this.pagination = pagination;
    }

    public List<T> getData() {
        return data;
    }

    public Pagination getPagination() {
        return pagination;
    }
}

class Pagination {
    private int limit;
    private int offset;
    private int total;

    public Pagination(int limit, int offset, int total) {
        this.limit = limit;
        this.offset = offset;
        this.total = total;
    }

    public int getLimit() {
        return limit;
    }

    public int getOffset() {
        return offset;
    }

    public int getTotal() {
        return total;
    }
}

