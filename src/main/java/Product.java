public class Product {
    private int id;
    private String title;
    private int cost;

    public Product() {

    }

    public Product(String title) {
        this.title = title;
    }

    public Product(String title, int cost) {
        this.title = title;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
