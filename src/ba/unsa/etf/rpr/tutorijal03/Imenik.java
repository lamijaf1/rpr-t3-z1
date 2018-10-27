package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Set;

public class Imenik  {
    TelefonskiBroj broj;
    String ime;
    HashMap<String, TelefonskiBroj> contactMap;
    public Imenik() {
        this.contactMap=new HashMap<String, TelefonskiBroj>();
    }
    public void dodaj(String ime, TelefonskiBroj broj){
        this.contactMap.put(ime, broj);
    }
    public String dajBroj(String ime) {
        TelefonskiBroj br=null;
        if (contactMap.containsKey(ime)) {
            br = this.contactMap.get(ime);
        }
        return br.ispisi();
    }
    public String dajIme(TelefonskiBroj broj) {
        String ime = null;
        if (contactMap.containsValue(broj)) ime = contactMap.get(broj).toString();
        return ime;
    }

    public String naSlovo(char s){

    }
   // public Set<String> izGrada(FiksniBroj.Grad g){}
    //Set<TelefonskiBroj> izGradaBrojevi(Grad g)


    /*public String ispisi(){
        return "";*/
    }



