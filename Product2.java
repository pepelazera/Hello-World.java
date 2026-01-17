package Entities;

public class Product2 {

    private Integer id;
    private String name;
    private Double price;

    public Product2() {
    }

    public Product2(Integer id, String name, Double price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public void increasePrice(double percent) {
        price += (price*percent) / 100.0;
    }

    @Override
    public String toString() {
        return "Id :" + id
                + "\nName: " + name
                + "\nPrice: U$ " + String.format("%.2f", price);
    }
}
