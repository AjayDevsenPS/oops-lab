abstract class Animal {
	    abstract void makeSound();
	}

class Dog extends Animal {
	    @Override
	    void makeSound() {
		System.out.println("Dog barks: bow! bow!");
	    }
	}

class Cat extends Animal {
	    @Override
	    void makeSound() {
		System.out.println("Cat meows: Meow! Meow!");
	    }
	}

public class exp17 {
	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();

		System.out.println("Calling makeSound() for Dog:");
		dog.makeSound();

		System.out.println("\nCalling makeSound() for Cat:");
		cat.makeSound();
	    }
	}
