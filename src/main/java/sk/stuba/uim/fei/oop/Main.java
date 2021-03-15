package sk.stuba.uim.fei.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        checkSever(SvetoveStrany.fromString("SEVER"));
        checkSever(SvetoveStrany.fromString("JUH"));



    }

    static void checkSever(SvetoveStrany s){
        if(s == SvetoveStrany.SEVER){
            System.out.println("rovne");
        }else{
            System.out.println("nerovne");
        }
    }
}