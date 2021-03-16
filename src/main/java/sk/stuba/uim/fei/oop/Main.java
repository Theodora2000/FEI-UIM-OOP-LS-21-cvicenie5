package sk.stuba.uim.fei.oop;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<Animal> animals = new ArrayList<>(List.of(new Dog("Rex"), new Parrot("Kiki")));
    animals.sort(new AnimalComparator());
        System.out.println(animals.toString());
    }


}


