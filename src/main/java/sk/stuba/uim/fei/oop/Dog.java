package sk.stuba.uim.fei.oop;

public class Dog extends Animal {
/*
    public Dog(String meno) {
        super(meno);
    }*/

    @Override
    void makeSound() {
        System.out.println("Woof woof");
    }
}