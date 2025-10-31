
public class Animal implements Comparable<Animal> {
	private String name;
	public Animal(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
	
	public int compareTo(Animal other) {
		return name.compareTo(other.name);
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (!(o instanceof Animal)) {
			return false;
		} else {
			Animal otherAnimal = (Animal) o;
			return otherAnimal.name.equals(this.name);
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
