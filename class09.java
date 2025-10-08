package aulasjavapoo;

public class class09 {
    public static void main(String[] args) {
        ObjectClass09V1Person o1 = new ObjectClass09V1Person();
        ObjectClass09V2Book o2 = new ObjectClass09V2Book();

        o1.bookReader();
        o1.details2();
        o1.doBirthday();

        System.out.println("\n");

        o2.details();
        o2.status();

        o2.leafThroughPage();
        o2.nextPage();
        o2.goBackPage();

        o2.status();
    }
}
