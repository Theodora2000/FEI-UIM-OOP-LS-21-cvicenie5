package sk.stuba.uim.fei.oop;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = List.of(new Bird(),new Parrot(), new Bird(), new Dog());//nemodifikovatelny list
        var animalsEditable = new ArrayList<>(animals);//tuto ho uz mozem modifikovat

        for (Animal animal : animals) {
            animal.makeSound();
            if (animal instanceof Bird) {
                ((Bird) animal).fly();
            }
            if(animal instanceof Parrot){
                ((Parrot) animal).repeat("Hello world");
            }
        }
    }
}


