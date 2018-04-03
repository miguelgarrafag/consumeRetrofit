package prestaya.retrofit;

/**
 * Created by 8470P on 01/04/2018.
 */

public class Product {
    private int totalPages;
    private int totalElements;


    public Product() {
    }

    public Product(int totalPages, int totalElements) {
        this.totalPages = totalPages;
        this.totalElements = totalElements;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    @Override
    public String toString() {
        return "Product{" +
                "totalPages=" + totalPages +
                ", totalElements=" + totalElements +
                '}';
    }
}
