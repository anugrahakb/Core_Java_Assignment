package Question4;

abstract class animal {
	  abstract void makeSound();

	  public void eat() {
	    System.out.println("I can eat.");
	  }
	}

	class Dog extends animal {

	  // provide implementation of abstract method
	  public void makeSound() {
	    System.out.println("Bark bark");
	  }
	}

	