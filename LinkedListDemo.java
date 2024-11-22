class Node {
    int data;
    Node next;

    // Constructor to initialize the node's data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (head == null) {
            head = newNode; // If list is empty, make the new node the head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the last node
            }
            current.next = newNode; // Add the new node at the end
        }
    }

    // Method to display the linked list
    public void show() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next; // Move to the next node
        }
        System.out.println("null");
    }
}

public class LinkedListDemo {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(33);
        list.insert(44);

        System.out.print("Linked List: ");
        list.show();
    }
}
