"""
If you are curious, here is an example of a few of the 
things we have been studying in Python instead of Java.

If you would like more examples of OOP in Python feel free to ask.

Otherwise, note that this is not material that will be in tests, hw, or quizzes.

It's just here if you are curious.

"""

from abc import ABC, abstractmethod

class Animal(ABC):
    
    def __init__(self, initialName, name):
        self.initialName = name
        self.name = name
        self.awake = True

    @abstractmethod
    def speak(self):
        pass

    def __eq__(self, other):
        if isinstance(other, self.__class__):
            print(f"{other} isinstance Animal")
            return self.name == other.name
        else:
            return False
    
    def __hash__(self):
        return hash(self.name)


class Dog(Animal):
    def __init__(self, name):
        super().__init__(name, name)
        print(f"initializing dog {name}")

    def speak(self):
        print("woof")


class Cat(Animal):
    def __init__(self, name):
        super().__init__(name, name)
        print(f"initializing cat {name}")

    def speak(self):
        print("meow")

    def __eq__(self, other):
        if isinstance(other, self.__class__):
            print(f"{other} isinstance Animal")
            return self.name == other.name
        else:
            return False

         

dog = Dog("Brodie")
dog.speak()

cat = Cat("Whiskers")
cat.speak()

print("List: ")
list = [dog, cat]
for a in list:
    a.speak()

dog2 = Dog("Brodie")


print(f" is dog == dog2?  {dog == dog2}")



