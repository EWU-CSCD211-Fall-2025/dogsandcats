
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
       assertEquals("[d1 c1 ] size = 2, head.data -> null, tail.data -> c1", list.toString());
       
   }

   @Test
   void testRemoveFirst() {

       // Arrange
       LinkedListAnimal list = new LinkedListAnimal();
       list.addLast(new Dog("d1"));
       //list.addLast(new Cat("c1"));

       // Act
       list.removeFirst();

       // Assert
       assertEquals("[] size = 0, head.data -> null, tail.data -> null", list.toString());

    }

    @Test
    void testRemoveLast() {
        // Arrange
        LinkedListAnimal list1 = new LinkedListAnimal();
        LinkedListAnimal list2 = new LinkedListAnimal();

        list1.addLast(new Cat("c1"));
        list2.addLast(new Dog("d1"));
        list2.addLast(new Dog("d2"));

        // Act
        list1.removeLast();
        list2.removeLast();

        // Assert
        assertEquals("[] size = 0, head.data -> null, tail.data -> null", list1.toString());

        assertEquals("[d1 ] size = 1, head.data -> null, tail.data -> d1", list2.toString());
    }

   @Test
   void testFindMiddle() {
       // Arrange

       LinkedListAnimal list = new LinkedListAnimal();
       list.addLast(new Cat("A"));
       list.addLast(new Cat("B"));
       list.addLast(new Cat("C"));
       list.addLast(new Cat("D"));
       //list.addLast(new Cat("E"));

       // Act
       String middleData = list.middleNodeData();

       // Assert
       assertEquals("B", middleData);

   }

   @Test
   void TestSplitListInTwo() {
       // Arrange
       LinkedListAnimal list = new LinkedListAnimal();
       

       list.addLast(new Cat("A"));
       list.addLast(new Cat("B"));
       list.addLast(new Cat("C"));
       list.addLast(new Cat("D"));
       list.addLast(new Cat("E"));

       // Act
       LinkedListAnimal[] lists = list.splitInTwo();

       // Assert
       LinkedListAnimal list1 = lists[0];
       LinkedListAnimal list2 = lists[1];

       assertEquals("[A B C ] size = 3, head.data -> null, tail.data -> C", list1.toString());
       
       assertEquals("[D E ] size = 2, head.data -> null, tail.data -> E", list2.toString());
   }

}
