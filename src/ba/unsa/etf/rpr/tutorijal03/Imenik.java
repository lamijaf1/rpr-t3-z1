package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Set;

public class Imenik  {
    TelefonskiBroj broj;
    String ime;
    HashMap<String, TelefonskiBroj> contactMap = new HashMap<String, TelefonskiBroj>();
    public void dodaj(String ime, TelefonskiBroj broj){
        contactMap.put(ime, broj);
    }
    public String dajBroj(String ime) {
        TelefonskiBroj br;
        if (contactMap.containsKey(ime)) {
            br = contactMap.get(ime);
        }
        return broj.ispisi();
    }

    /*public static TelefonskiBroj getKeyFromValue(HashMap hm, TelefonskiBroj value) {
        for (TelefonskiBroj o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }
   public String dajIme(TelefonskiBroj broj) {
       int ime = 0;
       if (contactMap.containsValue(broj)) ime = broj.values();
       return ""+ime;
   }*/

}

   // public String naSlovo(char s){}
   // public Set<String> izGrada(FiksniBroj.Grad g){}
    //Set<TelefonskiBroj> izGradaBrojevi(Grad g)


    /*public String ispisi(){
        return "";
    }*/



