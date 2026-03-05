package Aplications;

import Entities.Kunai;
import Entities.NinjaBag;
import Entities.Parchment;
import Entities.Shuriken;

public class MainGenerics {
    public static void main(String[] args) {

        NinjaBag<Object> ninjaBag = new NinjaBag<>();
        ninjaBag.addTools(new Kunai("Explosive kunai"));
        ninjaBag.addTools(new Shuriken(3));
        ninjaBag.addTools(new Parchment("Frog invocation"));

        System.out.println("Items in my ninja bag:");
        ninjaBag.showTool();

    }
}
