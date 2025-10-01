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

            closeBook();
        }


        else if (reply.equals("no") || reply.equals("n") || reply.equals("nn")) {
            this.setOpen(false);
            System.out.println("The book is close.");

            openBook();
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
        System.out.print("\nDo you want to open the book ? ");
        String r = sc.next().toLowerCase();

        if (r.equals("yes") || r.equals("ys")
                || r.equals("yy") || r.equals("y")) {
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
        System.out.print("\nDo you want to close the book ? ");
        String r = sc.next().toLowerCase();

        if (r.equals("yes") || r.equals("ys")
                || r.equals("yy") || r.equals("y")) {
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

        while (true) {
            System.out.print("\nDo you want to leaf through one page ? ");
            String r = sc.next().toLowerCase();


            if (r.equals("yes") || r.equals("ys")
                    || r.equals("y") || r.equals("yy")) {

                System.out.print("\nWhich page do you want to leaf through ? ");
                int p = sc.nextInt();

                System.out.printf("Opening on page %s ", p);
                System.out.println();
                System.out.println("Page that you leafed through: " + p);
            }

            else if (r.equals("no") || r.equals("nn") || r.equals("n")) {
                System.out.println("You didn't leaf through any page.");
                break;
            }

            else {
                System.out.print("\nERROR: Please, put a valid option: ");
                sc.nextLine();
            }
        }

    }


    @Override
    public void nextPage() {

        while (true) {
            System.out.print("\nDo you want to advance the page ? ");
            String r = sc.next().toLowerCase();


            if (r.equals("yes") || r.equals("ys")
                    || r.equals("y") || r.equals("yy")) {

                System.out.print("\nHow many pages do you want to advance ? ");
                int p = sc.nextInt();

                if ((this.getCurrentPages() + p) > this.getTotPages()) {
                    System.out.println("ERROR: You can't advance more than "+this.getTotPages()+" pages.");
                }

                else {
                    this.setCurrentPages(getCurrentPages() + p);
                    System.out.println("Now, you is on page "+this.getCurrentPages());
                }

                System.out.println("Pages that you advanced: " + p);

                while (true) {
                    System.out.print("\nDo you want to advance more pages ? ");
                    String r2 = sc.next().toLowerCase();

                    if (r2.equals("yes") || r2.equals("yy")
                            || r2.equals("y") || r2.equals("ys")) {
                        System.out.print("\nHow many pages do you want to advance now ? ");
                        int p2 = sc.nextInt();
                        this.setCurrentPages(getCurrentPages() + p2);

                        System.out.println("Pages that you advanced: "+p2);
                        System.out.println("Now, you is on page "+this.getCurrentPages());
                    }

                    else if (r2.equals("no") || r2.equals("nn") || r2.equals("n")) {
                        System.out.println("You didn't advanced more pages.");
                        break;
                    }

                    else {
                        System.out.print("ERROR: Please, write 'yes' or 'no' to continue: ");
                    }
                }

                break;
            }


            else if (r.equals("no") || r.equals("nn") || r.equals("n")) {
                System.out.println("You didn't advanced any page.");
                System.out.printf("\nNumbers of page: %s", this.getCurrentPages());
                break;
            }


            else {
                System.out.print("\nERROR: Please, put a valid option: ");
            }
        }

        System.out.println("Page you is: "+this.getCurrentPages());

    }


    @Override
    public void goBackPage() {

        while (true) {
            System.out.print("\nDo you want to go back the page ? ");
            String r = sc.next().toLowerCase();

            if (r.equals("yes") || r.equals("ys")
                    || r.equals("y") || r.equals("yy")) {
                System.out.print("\nHow many pages do you want to go back ? ");
                int p = sc.nextInt();
                this.setCurrentPages(getCurrentPages() - p);

                System.out.println("Pages that you go back: "+p);
                System.out.println("Now, you is on page "+this.getCurrentPages());

                while (true) {
                    System.out.print("\nDo you want to go back more pages ? ");
                    String r2 = sc.next().toLowerCase();

                    if (r2.equals("yes") || r2.equals("ys")
                          || r2.equals("yy") || r2.equals("y")) {

                        System.out.print("\nHow many pages do you want to go back now ? ");
                        int p2 = sc.nextInt();
                        this.setCurrentPages(getCurrentPages() - p2);

                        System.out.println("Pages that you go back: "+p2);
                        System.out.println("Now, you is on page "+this.getCurrentPages());
                    }
                    else if (r2.equals("no") || r2.equals("nn") || r2.equals("n")) {
                        System.out.println("You didn't go back more pages.");
                        break;
                    }
                }

                break;
            }


            else if (r.equals("no") || r.equals("nn") || r.equals("n")) {
                System.out.println("You didn't go back any page.");
                System.out.printf("\nNumbers of page: %s", this.getCurrentPages());
                break;
            }


            else {
                System.out.print("\nERROR: Please, put a valid option: ");
                sc.nextLine();
            }
        }

        System.out.println("Page you is: "+this.getCurrentPages());

    }

}
