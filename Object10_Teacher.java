package aulasjavapoo;

public class Object10_Teacher extends Object10_Person {
    // Attributes
    private float wage;


    // Methods
    public void receiveIncrease() {
        System.out.print("What is your wage now ? ");
        wage = sc.nextFloat();

        if (wage <= 1000f) {
            wage += 500f;
            System.out.printf("You receive a increase. Now, your wage is %s\n", wage);
        }
        else if (wage >= 2500f) {
            System.out.println("Your wage is okay, you will don't receive an increase.");
        }
        else {
            System.out.println("We need to think about this yet.");
        }
    }


    // Special Methods
    public float getWage() {
        return wage;
    }
    public void setWage(float wage) {
        this.wage = wage;
    }
}
