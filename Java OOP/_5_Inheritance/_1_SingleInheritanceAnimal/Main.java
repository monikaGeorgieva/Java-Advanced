package _1_SingleInheritanceAnimal;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        System.out.println();

        Puppy puppy = new Puppy();
        puppy.weep();
        puppy.eat();
        puppy.bark();

        System.out.println();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();


    }
}
