import java.util.Arrays;
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

		Animal[] pets = new Animal[dogs.length + cats.length];

		for (int i = 0; i < dogs.length; i++) {
			pets[i] = dogs[i];
		}
		for (int i = 0; i < cats.length; i++) {
			pets[dogs.length + i] = cats[i];
		}

		for (int i = 0; i < pets.length; i++) {
			System.out.println("Pet: " + pets[i]);
		}
		
		Arrays.sort(pets);
		
		for (int i = 0; i < pets.length; i++) {
			System.out.println("(sorted) Pet: " + pets[i]);
		}
	}
}
