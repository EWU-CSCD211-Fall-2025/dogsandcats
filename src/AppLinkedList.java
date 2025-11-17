import pets.*;

public class AppLinkedList {

    public static void main(String[] args) {

        LinkedListAnimal list = new LinkedListAnimal();
        list.addLast(new Cat("whiskers"));
        list.addLast(new Dog("tank"));

        list.addFirst(new Dog("Brodie"));

        list.addLast(new Dog("Beulah"));
        System.out.println(list);

        list.addAtIndex(0, new Cat("Cosmo"));

        System.out.println(list);

    }
}
