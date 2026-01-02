package Aplications;

public class Information {

    private int Id;
    private String name;
    private double salary;

    public Information() {

    }

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Information: \n" +
                "\nId: " + Id +
                "\nname: " + name +
                "\nsalary: " + salary;
    }
}
