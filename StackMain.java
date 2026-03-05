package Aplications;

import java.util.*;

public class StackMain {
    public static void main(String[] args) {

        // Array
        // They are statics and have space memory
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";

        // Lists
        // They are dynamic, and size up and down according to need
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        System.out.println("List: " + ninjasList + "\n");

        // Stack
        // The last element that entered is the first to go out
        Stack<String> ninjaStack = new Stack<>(); // Use the LIFO metho. Last int, first out
        ninjaStack.add("Naruto Uzumaki");
        System.out.println("My current stack: " + ninjaStack);

        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Sakura Harun");
        System.out.println("\nMy current stack now: " + ninjaStack);
        ninjaStack.pop();
        System.out.println("My updated stack with pop: " + ninjaStack);
        System.out.println("\nMy stack with the next element of the top: " + ninjaStack.peek());
        System.out.println("Stack size: " + ninjaStack.size() + " elements\n");

        // Queue
        Queue<String> ninjaQueue = new LinkedList<>(); // Use the FIFO method. First int, first out
        ninjaQueue.add("Naruto");
        ninjaQueue.add("Sasuke");
        ninjaQueue.add("Sakura");
        ninjaQueue.add("Kakashi");
        ninjaQueue.add("Shikamaru");

        // Show the queue
        System.out.println("Queue of ninjas: " + ninjaQueue);

        // To remove a ninja
        ninjaQueue.poll(); // Remove the first Element
        System.out.println("Queue of ninjas after command poll: " + ninjaQueue + "\n");

        // How can see the first
        System.out.println("Ninja in the HEAD: " + ninjaQueue.peek());

        // Add new ninja
        ninjaQueue.add("Hashirama");
        ninjaQueue.add("Tobirama"); // You only can remove this element after remove the others elements before than

        System.out.println("Queue of the ninjas after add new ninjas: " + ninjaQueue + "\n");

        // It's not possible to delete tail

        Queue<String> akatsukiQueue = new LinkedList<>();

        akatsukiQueue.add("Itachi");
        akatsukiQueue.add("Kisame");
        akatsukiQueue.add("Pain");
        akatsukiQueue.add("Sasori");
        akatsukiQueue.add("Konan");

        // Verify if the queue is void
        if (akatsukiQueue.isEmpty()) {
            System.out.println("The queue is void");
        }
        
        // Clear the queue
        akatsukiQueue.poll();
        akatsukiQueue.poll();
        akatsukiQueue.poll();
        akatsukiQueue.poll();
        akatsukiQueue.poll();
        System.out.println(akatsukiQueue);
    }
}
