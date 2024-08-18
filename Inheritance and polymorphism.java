// Parent class
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.makeSound();  // Output: The animal makes a sound
        dog.makeSound();     // Output: The dog barks
        cat.makeSound();     // Output: The cat meows
    }
}
