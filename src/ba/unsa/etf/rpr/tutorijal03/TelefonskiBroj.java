package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;

public abstract class TelefonskiBroj  {
    public abstract String  ispisi();
    public abstract int hashCode();
    HashMap<String, Imenik> contactMap = new HashMap<String, Imenik>();
    //public abstract int compareTo(TelefonskiBroj br);
}

