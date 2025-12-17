package Exercicios;
import java.util.Scanner;

public class Product {
    Scanner sc = new Scanner(System.in);
    Main m = new Main();

    private int code;
    private String name;
    private double price;
    private int amount;

    public void Constructor(int code, String name, double price, int amount) {
        this.setCode(code);
        this.setName(name);
        this.setPrice(price);
        this.setAmount(amount);
    }

    public double ValueOnStock() {
        return price * amount;
    }

    @Override
    public String toString() {
        return "Product: " +
                "\ncode: " + code +
                "\nname: " + name +
                "\nprice: U$ " + price +
                "\namount: " + amount;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
