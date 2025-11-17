import pets.*;
import java.util.Set;
import java.util.HashSet;

public class AppSetPets {

    public static void main(String[] args) {

        Set<Animal> pets = new HashSet<>();

        Animal d1 = new Dog("Brodie");
        Animal c1 = new Cat("Tank");

        pets.add(d1);
        pets.add(c1);

        System.out.println("Pets: " + pets + ", is d1 in pets? " + pets.contains(d1));

        d1.mutateName("BRODIE THE DOG");

        System.out.println("Pets: " + pets + ", is d1 in pets? " + pets.contains(d1));

    }
}
