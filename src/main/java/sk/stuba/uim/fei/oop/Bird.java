package sk.stuba.uim.fei.oop;


public class Bird extends Animal {
/*
    public Bird(String meno) {
        super(meno);
    }*/

    @Override
    void makeSound() {
        System.out.println("Chirp chirp");
    }

    void fly() {
        System.out.println("*flaps wings*");
    }

    void repeat(String sentence) {
        System.out.println("Parrot says: "+ sentence);
    }}