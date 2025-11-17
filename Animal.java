
/**
 * Animal class that implements Comparable based on the animal's name.
 * 
 */
public abstract class Animal implements Comparable<Animal> {
	
	final private String initialName; // immutable
    private String name; // mutable
    private boolean isAwake; // mutable
	
	/**
	 * Constructs an Animal with the given name.
	 * 
	 * @param name the name of the animal
	 */
	public Animal(String name) {
		this.initialName = name;
        this.name = name;
        this.isAwake = true;
	}

    public void mutateName(String name) {
        this.name = name;
    }

    public void wakeUp() {
        this.isAwake = true;
    }

    public void goToSleep() {
        this.isAwake = false;
    }

    public abstract String speak();


	/**
	 * Returns the name of this animal.
	 * 
	 * @return the animal's name
	 */
	@Override
	public String toString() {
		return name;
	}
	
	/**
	 * Compares this animal to another animal based on their names.
	 * 
	 * @param other the other animal to compare to
	 * @return a negative integer, zero, or a positive integer as this animal's name
	 *         is less than, equal to, or greater than the specified animal's name
	 */
	@Override
	public int compareTo(Animal other) {
		return name.compareTo(other.name);
	}
	
	/**
	 * Compares this animal with another object for equality.
	 * Two animals are equal if they have the same name.
	 * 
	 * @param o the object to compare with
	 * @return true if the animals are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (!(o instanceof Animal)) {
			return false;
		} else {
			Animal otherAnimal = (Animal) o;
			return otherAnimal.initialName.equals(this.initialName);
		}
	}
	
	/**
	 * Returns the hash code for this animal based on its name.
	 * Only use immutable (final) fields!
     *
	 * @return the hash code of the animal's name
	 */
	@Override
	public int hashCode() {
		return initialName.hashCode();
	}
}
