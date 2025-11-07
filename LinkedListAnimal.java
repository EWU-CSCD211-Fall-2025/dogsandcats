

public class LinkedListAnimal {

    private static class Node {

        public Animal data;
        public Node next;

        public Node(Animal data, Node next) {
            this.data = data;
            this.next = next;
        }
        public Node(Animal data) {
            this(data, null);
        }
        public Node() {
            this(null, null);
        }

    }

    private int size;
    private Node head;
    private Node tail;

    public LinkedListAnimal() {

        head = new Node();
        tail = head;
        size = 0;

    }


    public int size() {
        return size;
    }

    public void addLast(Animal data) {

        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
        size++;
    }


    public void addFirst(Animal data) {
        
        if (size == 0) {
            addLast(data);
        } else {
            Node nn = new Node(data);
            Node temp = head.next;
            head.next = nn;
            nn.next = temp;
            size++;
        }

    }

    public void addAtIndex(int index, Animal data) {
        if (index == 0) {
            addFirst(data);
        } else if (index == size - 1) {
            addLast(data);
        } else if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index out of bounds");
        } else {

            // now we do the hard part

        }
    }


    @Override
    public String toString() {

        // return String representation of LL
        String s = "[";
        if (size > 0) {
            // traverse the list
            Node cur = head.next;
            for (int i = 0; i < size; i++) {
                s += cur.data + " ";
                cur = cur.next;
            }
        }
        s += "]";
        return s;
    }

    
}

