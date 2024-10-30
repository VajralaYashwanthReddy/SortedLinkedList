class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SortedLinkedList {
    Node head;

    // Method to insert a new node in sorted order
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null || head.data >= newNode.data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.data < newNode.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortedLinkedList sortedList = new SortedLinkedList();

        // Inserting elements into the sorted linked list
        sortedList.insert(30);
        sortedList.insert(10);
        sortedList.insert(20);
        sortedList.insert(50);
        sortedList.insert(40);

        System.out.println("Sorted Linked List:");
        sortedList.display();
    }
}
