import java.util.Scanner;

public class LinkedList {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // ---------- ADD ----------

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // ---------- REMOVE ----------

    // remove the first node
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty, nothing to remove.");
            return;
        }
        head = head.next;   // just move head to the next node; old head gets garbage collected
    }

    // remove the last node
    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty, nothing to remove.");
            return;
        }
        if (head.next == null) {   // only one node
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {   // stop at second-to-last node
            temp = temp.next;
        }
        temp.next = null;   // cut off the last node
    }

    // remove the first node that matches the given value
    public void remove(String data) {
        if (head == null) {
            System.out.println("List is empty, nothing to remove.");
            return;
        }

        if (head.data.equals(data)) {   // if it's the head itself
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data.equals(data)) {
                temp.next = temp.next.next;   // skip over the matching node
                return;
            }
            temp = temp.next;
        }

        System.out.println(data + " not found in the list.");
    }

    // ---------- SORT ----------

    // bubble sort - swaps DATA between nodes (simplest approach, treats values as numbers here)
    public void sort() {
        if (head == null || head.next == null) return;

        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current.next != null) {
                int a = Integer.parseInt(current.data);
                int b = Integer.parseInt(current.next.data);
                if (a > b) {
                    // swap the data values, not the nodes themselves
                    String temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    // ---------- PRINT ----------

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ---------- MAIN ----------

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);

        // predefined list: 4, 5, 6, 9, 2, 7
        int[] values = {4, 5, 6, 9, 2, 7};
        for (int v : values) {
            list.addLast(String.valueOf(v));
        }

        System.out.println("Original Linked List:");
        list.printList();

        // ask user what to add at first/last
        System.out.print("\nEnter data to add at the FIRST position: ");
        list.addFirst(sc.nextLine());

        System.out.print("Enter data to add at the LAST position: ");
        list.addLast(sc.nextLine());

        System.out.println("\nList after additions:");
        list.printList();

        // ask user what value to remove
        System.out.print("\nEnter a value to remove from the list: ");
        String toRemove = sc.nextLine();
        list.remove(toRemove);

        System.out.println("\nList after removal:");
        list.printList();

        // sort the list
        list.sort();
        System.out.println("\nList after sorting:");
        list.printList();

        sc.close();
    }
}