package sk.stuba.uim.fei.oop;

import java.util.Locale;

public enum SvetoveStrany {
    SEVER(true),
    JUH(false),
    VUCHOD(false),
    ZAPAD(false);

    SvetoveStrany (boolean jeSever){
        this.jeSever = jeSever;
    }

    boolean jeSever;

    static SvetoveStrany fromString(String s){
        return SvetoveStrany.valueOf(s.toUpperCase(Locale.ROOT));
    }
}
