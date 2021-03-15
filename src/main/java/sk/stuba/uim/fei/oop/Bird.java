package sk.stuba.uim.fei.oop;


public class Bird extends Animal {

    @Override
    void makeSound() {
        System.out.println("Chirp chirp");
    }

    void fly() {
        System.out.println("*flaps wings*");
    }
}