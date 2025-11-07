

public class AppLinkedList {

    public static void main(String[] args) {

        LinkedListAnimal list = new LinkedListAnimal();
        list.addLast(new Cat("whiskers"));
        list.addLast(new Dog("tank"));

        list.addFirst(new Dog("Brodie"));

        System.out.println(list);

    }
}
