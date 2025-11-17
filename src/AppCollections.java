import pets.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Java Collections Framework example
 */
public class AppCollections {

	/**
	 * main method
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		// Java Collections Framework example
		// Create lists of cats and dogs
		
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
		
		// Sort using Java Collections.sort() method
		// How do I find the documentation for this method?
		Collections.sort(pets);
		
		System.out.println("Sorted pets: " + pets);

		// Distinct pets
		List<Animal> uniquePets = new ArrayList<>();

		for (int i = 0; i < pets.size(); i++) {
			if (!(uniquePets.contains(pets.get(i)))) { // this uses Animal.equals()! Override it for contains to work correctly!
				uniquePets.add(pets.get(i));
			}
		}
		
		System.out.println("Sorted distinct pets: " + uniquePets);
	}
}
