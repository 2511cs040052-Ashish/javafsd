// Parent class
class Animal {
    public void eat() {
        System.out.println("Animal eats food");
    }
}

// Child class 1
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    public void meow() {
        System.out.println("Cat meows");
    }
}

// Main class
public class HierarchicalInheritance {
    public static void main(String[] args) {

        Dog d = new Dog();
        System.out.println("Dog Object:");
        d.eat();   // Inherited from Animal
        d.bark();  // Dog's own method

        System.out.println();

        Cat c = new Cat();
        System.out.println("Cat Object:");
        c.eat();   // Inherited from Animal
        c.meow();  // Cat's own method
    }
}