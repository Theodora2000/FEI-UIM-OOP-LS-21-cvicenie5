package sk.stuba.uim.fei.oop;

public class Parrot extends Bird {
   public Parrot(String meno) {
        super(meno);
    }

    void repeat(String sentence) {
        System.out.println("Parrot says: "+ sentence);
    }
}