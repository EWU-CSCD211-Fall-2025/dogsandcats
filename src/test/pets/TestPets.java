
package test.pets;

import pets.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestPets {

    @Test
    void testCatSpeak() {

        // Arrange
        Cat c = new Cat("Whiskers");

        // Act
        String s = c.speak();

        // Assert
        assertEquals("Meow!", s);

   }

   @Test
   void testAddLast() {

       // Arrange
       LinkedListAnimal list = new LinkedListAnimal();

       // Act
       list.addLast(new Dog("d1"));
       list.addLast(new Cat("c1"));

       // Assert
       assertEquals("[d1 c1 ] size = 2, head -> null, tail -> c1", list.toString());
       
   }

   @Test
   void testRemoveFirst() {

       // Arrange
       LinkedListAnimal list = new LinkedListAnimal();
       list.addLast(new Dog("d1"));
       list.addLast(new Cat("c1"));

       // Act
       list.removeFirst();

       // Assert
       assertEquals("[c1 ] size = 1, head -> null, tail -> c1", list.toString());

    }

}
