package sk.stuba.uim.fei.oop;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        checkServer(SvetoveStrany.fromString("SEVER"));
        checkServer(SvetoveStrany.fromString("sever"));
    }

    static void checkServer(SvetoveStrany s){

            if(s.jeSever){
                System.out.println("rovne");
            }
            else{
                System.out.println("nerovne");
            }

    }
}


