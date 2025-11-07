import java.util.Arrays;

/**
 * 
 * Polymorphism Example using an array of Animals
 * that can hold Dog and Cat objects.
 * 
 */
public class App {
	
	public static void main(String[] args) {
		Animal a = new Animal("an animal");
		System.out.println("Animal: " + a);
		
		Dog[] dogs = new Dog[3];
		dogs[0] = new Dog("Fido");
		dogs[1] = new Dog("Brodie");
		dogs[2] = new Dog("Beulah");
		
		Cat[] cats = new Cat[2];
		cats[0] = new Cat("Siggy");
		cats[1] = new Cat("Anubus");

		// combine dogs and cats into one array of animals
		// Polymorphism!
		Animal[] pets = new Animal[dogs.length + cats.length];

		for (int i = 0; i < dogs.length; i++) {
			pets[i] = dogs[i];
		}
		for (int i = 0; i < cats.length; i++) {
			pets[dogs.length + i] = cats[i]; // offset by dogs.length
		}

		for (int i = 0; i < pets.length; i++) {
			System.out.println("Pet: " + pets[i]);
		}
		
		// sort the pets array using Java's built-in sort method
		// from the Arrays class
		// How do I find the documentation for this method?
		// Google > Search for "javadoc 25" > first result > Search for "Arrays"
		// https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Arrays.html
		// CTRL+F > search for "sort("
		// Note that Animal must implement Comparable<Animal> interface!
		Arrays.sort(pets);
		
		for (int i = 0; i < pets.length; i++) {
			System.out.println("(sorted) Pet: " + pets[i]);
		}
		
		System.out.println("sdf");
	}
}
