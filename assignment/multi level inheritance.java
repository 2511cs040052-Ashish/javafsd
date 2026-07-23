// Grandparent class
class Animal {
    public void eat() {
        System.out.println("Animal eats food");
    }
}

// Parent class inheriting Animal
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

// Child class inheriting Dog
class Puppy extends Dog {
    public void weep() {
        System.out.println("Puppy weeps");
    }
}

// Main class
public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        // Calling methods from all three classes
        p.eat();   // From Animal
        p.bark();  // From Dog
        p.weep();  // From Puppy
    }
}