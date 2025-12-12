
public interface IAnimalQueue {

    void enqueue(Animal animal);
    Animal dequeue();
    Animal peek();
    boolean isEmpty();
    boolean isFull();
}
