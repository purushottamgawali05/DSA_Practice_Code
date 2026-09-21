
public class LinkedList {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {

        //Step 1 => Create a new Node
        Node newNode = new Node(data);
        size++;

        // if linked list is empty
        if (head == null) {
            head = tail = newNode;
        }

        //Step2 => newNode next = head
        newNode.next = head; //link

        //Step 3 => head = newNode;
        head = newNode;

    }

    public void addLast(int data) {
        //create a new node
        Node newNode = new Node(data);
        size++;
        if (tail == null) {
            tail = head = newNode;
        }

        //step 2 => tail.next = newNode;
        tail.next = newNode;

        //tail = newNode
        tail = newNode;
    }

    public void addMiddle(int idx, int data) {
        if (head == null) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;

        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("null");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();

        ll.addMiddle(2, 5);
        ll.print();
        System.out.println(size);
    }
}
