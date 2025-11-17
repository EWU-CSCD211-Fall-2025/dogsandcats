package pets;
/**
 * Represents a cat, which is a type of animal.
 */
public class Cat extends Animal {
	
	/**
	 * Constructs a Cat with the given name.
	 * 
	 * @param name the name of the cat
	 */
	public Cat(String name) {
		super(name);
	}

    @Override
    public String speak() {
        return "Meow!";
    }
}
