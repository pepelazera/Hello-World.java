package Entities;

/*
The New Scenario: Inventory Control Instead of complex employees, let's manage Products. The goal is to increase the price of a specific item in the inventory. Challenge requirements:
    1. Product Class: Must have id (Integer), name (String), and price (Double). (okay)
    2. Encapsulation: The price field must be private. Create a method increasePrice(double percentage) to change it. (okay)
    3. The List: Create an ArrayList to store N products. (okay)
    4. The Operation: Ask the user for an ID. If the ID exists in the list, apply a 10% increase. If it does not exist, warn: "ID not found". (okay)
*/

public class Product {

    private Integer id;
    private String name;
    private Double price;

    public Product() {
    }

    public Product(Integer id, String name, Double price) {
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

    public void increasePrice(Double percentage) {
        price += (price * percentage) / 100.0;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                "\nName: " + name +
                "\nPrice: U$ " + String.format("%.2f", price);
    }
}
