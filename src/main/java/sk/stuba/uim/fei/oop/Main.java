package sk.stuba.uim.fei.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SvetoveStrany strana = SvetoveStrany.SEVER;

        for(SvetoveStrany s : SvetoveStrany.values()){
            if(s == SvetoveStrany.SEVER){
                System.out.println("rovne");
            }else{
                System.out.println("nerovne");
            }
        }

        checkSever(SvetoveStrany.valueOf("SEVER"));
        checkSever(SvetoveStrany.valueOf("JUH"));



    }

    static void checkSever(SvetoveStrany s){
        if(s == SvetoveStrany.SEVER){
            System.out.println("rovne");
        }else{
            System.out.println("nerovne");
        }
    }
}