package aulasjavapoo;
import java.util.Scanner;

public class ObjectClass09V2Book implements Publication {
    Scanner sc = new Scanner(System.in);
    ObjectClass09V1Person o1 = new ObjectClass09V1Person();

    // Atributs
    private String title;
    private String author;
    private int totPages;
    private int currentPages;
    private boolean open = true;
    private String reader;


    // Special Methods
    public void details(){
        System.out.print("Put the title: ");
        this.setTitle(sc.nextLine());


        System.out.print("Put the author: ");
        this.setAuthor(sc.nextLine());


        System.out.print("Reader's name: ");
        this.setReader(sc.nextLine());


        System.out.print("Total pages: ");
        this.setTotPages(sc.nextInt());


        System.out.print("Current Pages: ");
        this.setCurrentPages(sc.nextInt());


        System.out.print("The book is open ? ");
        String reply = sc.next().toLowerCase();
        if (reply.equals("yes") || reply.equals("y")) {
            this.setOpen(true);
            System.out.println("The book is open.");
        }


        else if (reply.equals("no") || reply.equals("n") || reply.equals("nn")) {
            this.setOpen(false);
            System.out.println("The book is close.");
        }

        System.out.println();
    }

    public void status() {
        System.out.println("=== YOUR READINGS ===");
        System.out.println("- Title: "+this.getTitle()+" -");
        System.out.println("- Author: "+this.getAuthor()+" -");
        System.out.println("- Total pages: "+this.getTotPages()+" -");
        System.out.println("- Current pages: "+this.getCurrentPages()+" -");
        System.out.println("- Reader: "+this.getReader()+" -");
    }


    // Methods
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }


    public int getTotPages() {
        return totPages;
    }
    public void setTotPages(int totPages) {
        this.totPages = totPages;
    }


    public int getCurrentPages() {
        return currentPages;
    }
    public void setCurrentPages(int currentPages) {
        this.currentPages = currentPages;
    }


    public boolean getOpen() {
        return open;
    }
    public void setOpen(boolean open) {
        this.open = open;
    }


    public String getReader() {
        return reader;
    }
    public void setReader(String reader) {
        this.reader = reader;
    }


    // Interface Methods
    @Override
    public void openBook() {
        System.out.print("Do you want to open the book ? ");
        String r = sc.nextLine().toLowerCase();

        if (r.equals("yes") || r.equals("ys") || r.equals("y")) {
            this.setOpen(true);
            System.out.println("The book is open now.");
        }

        else if (r.equals("no") || r.equals("nn") || r.equals("n")) {
            this.setOpen(false);
            System.out.println("We didn't change anything.");
        }
    }


    @Override
    public void closeBook() {
        System.out.println("Do you want to close the book ? ");
        String r = sc.nextLine().toLowerCase();

        if (r.equals("yes") || r.equals("ys") || r.equals("y")) {
            this.setOpen(false);
            System.out.println("The book is close now.");
        }

        else if (r.equals("no") || r.equals("nn") || r.equals("n")) {
            this.setOpen(true);
            System.out.println("We didn't change anything.");
        }
    }


    @Override
    public void leafThroughPage() {
        System.out.print("Do you want to turn the page ? ");
        String r = sc.next().toLowerCase();

        System.out.print("How many pages do you want to turn ? ");
        int p = sc.nextInt();

        if (!this.getOpen()) {
            System.out.println("I can't turn the page because the book is closed.");
        }
        else if (r.equals("yes") || r.equals("ys") || r.equals("y")) {
            this.setCurrentPages(getCurrentPages() + p);
            System.out.println("Now, the current pages are: "+this.getCurrentPages());
        }

        else if (r.equals("no") || r.equals("nn") || r.equals("n")) {
            System.out.println("THe current pages don't change: "+this.getCurrentPages());
        }
    }


    @Override
    public void advancePage() {

    }


    @Override
    public void goBackPage() {


    }
}
