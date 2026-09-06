public class ReverseLinkedLists{

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
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

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ITERATIVE REVERSE
    // Time: O(n), Space: O(1) - no extra memory, just re-pointing links
    public void reverseIterative() {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node nextTemp = current.next; // save next node before overwrite it
            current.next = prev;          // reverse the pointer
            prev = current;               // move prev forward
            current = nextTemp;           // move current forward
        }

        head = prev; // prev ends up being the new head
    }

    //RECURSIVE REVERSE
    // Time: O(n), Space: O(n) - due to recursion call stack
    public void reverseRecursive() {
        head = reverseRecursiveHelper(head);
    }

    private Node reverseRecursiveHelper(Node current) {
        // base case: empty list or reached the last node
        if (current == null || current.next == null) {
            return current; // this becomes the new head
        }

        // recurse first - keep going until we hit the last node
        Node newHead = reverseRecursiveHelper(current.next);

        // now unwind: reverse the link
        current.next.next = current; // make the next node point back to current
        current.next = null;         // break the old forward link

        return newHead; // always bubble up the same new head
    }

    public static void main(String[] args) {
        // ---- Test iterative reverse ----
        ReverseLinkedLists list1 = new ReverseLinkedLists();
        int[] values = {4, 5, 6, 9, 2, 7};
        for (int v : values) list1.addLast(String.valueOf(v));

        System.out.println("Original list:");
        list1.printList();

        list1.reverseIterative();
        System.out.println("After ITERATIVE reverse:");
        list1.printList();

        // ---- Test recursive reverse ----
        ReverseLinkedLists list2 = new ReverseLinkedLists();
        for (int v : values) list2.addLast(String.valueOf(v));

        list2.reverseRecursive();
        System.out.println("\nAfter RECURSIVE reverse:");
        list2.printList();
    }
}
