package sk.stuba.uim.fei.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(List.of(new Bird(), new Parrot(), new Dog(), new Bird(), new Dog()));

        for (Animal animal : animals) {
            animal.makeSound();
            if (animal instanceof Bird) {
                ((Bird) animal).fly();
            }
            if (animal instanceof Parrot) {
                ((Parrot) animal).repeat("Hello");
            }

            System.out.println("----");
        }
    }
}