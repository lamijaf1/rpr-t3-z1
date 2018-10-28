package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;

import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.*;

public abstract class TelefonskiBroj implements Comparable{
    public abstract String ispisi();
    public abstract int hashCode();
    //public abstract FiksniBroj.Grad getGrad();
    @Override
    public  int compareTo(Object o){
            return 0;
        }


}





