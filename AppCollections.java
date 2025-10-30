
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class AppCollections {

	public static void main(String[] args) {

		List<Cat> cats = new ArrayList<>();
		cats.add(new Cat("Cosmo"));
		cats.add(new Cat("Remmy"));

		List<Dog> dogs = new ArrayList<>();

		dogs.add(new Dog("Spot"));
		dogs.add(new Dog("Courage"));
		dogs.add(new Dog("Courage"));
		dogs.add(new Dog("Clifford"));
		
		List<Animal> pets = new ArrayList<>();

		for (int i = 0; i < cats.size(); i++) {
			pets.add(cats.get(i));
		}
		for (int i = 0; i < dogs.size(); i++) {
			pets.add(dogs.get(i));
		}
		System.out.println("Pets: " + pets);
		
		Collections.sort(pets);
		
		System.out.println("Sorted pets: " + pets);
	}
}
