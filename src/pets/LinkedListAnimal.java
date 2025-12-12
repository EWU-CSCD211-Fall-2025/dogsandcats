package pets;

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
        System.out.println("Adding " +  data + " at index " + index);
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index out of bounds");
        } else {

            // now we do the hard part

            Node cur = head.next;
            for (int i = 0; i < index - 1; i++) {
               cur = cur.next;
            }

            Node temp = cur.next;
            cur.next = new Node(data);
            cur.next.next = temp;
            size++;

        }
    }

    public void removeFirst() {
        if (size > 1) {
            head.next = head.next.next;
            size--;
        } else if (size == 1) {
            head.next = null;
            tail = head;
            size = 0;
        }
    }

    public void removeLast() {
        if (size == 0) {
            // do nothing
        } else {

            Node cur = head;
            while (cur.next != tail) {
                cur = cur.next;
            }
            cur.next = null;
            tail = cur;
            size--;

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
        s += "] size = " + size + ", head.data -> " + head.data + ", tail.data -> " + tail.data;
        return s;
    }

    public String middleNodeData() {
        return middleNode(head.next).data.toString();
    }

    private Node middleNode(Node node) {

        Node slow = node;
        Node fast = slow;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }

    public LinkedListAnimal[] splitInTwo() {
        
        Node middle = middleNode(head.next);

        LinkedListAnimal l1 = new LinkedListAnimal();
        LinkedListAnimal l2 = new LinkedListAnimal();

        l1.head.next = head.next;
        l1.tail = middle;

        l2.head.next = middle.next;
        l2.tail = tail;

        middle.next = null;

        l1.size = size / 2 + size % 2;
        l2.size = size / 2;

        head.next = null;
        size = 0;
        tail = head;

        return new LinkedListAnimal[] {l1, l2};
    
    }


    public void sort() {

        head.next = mergeSort(head.next);

        Node cur = head;
        while (cur != null) {
            tail = cur;
            cur = cur.next;
        }

    }

        
    private Node mergeSort(Node node) {
        if (node == null || node.next == null) return node;

        Node middle = middleNode(node);
        Node rightStart = middle.next;
        middle.next = null;

        Node left = mergeSort(node);
        Node right = mergeSort(rightStart);

        return merge(left, right);
    }


    private Node merge(Node a, Node b) {
        Node dummy = new Node(null);
        Node tailMerge = dummy; // local merge tail

        while (a != null && b != null) {
            if (a.data.compareTo(b.data) <= 0) {
                tailMerge.next = a;
                a = a.next;
            } else {
                tailMerge.next = b;
                b = b.next;
            }
            tailMerge = tailMerge.next;
        }

        if (a != null) tailMerge.next = a;
        else tailMerge.next = b;

        return dummy.next;
    }


}

