package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;

public class Imenik  {
   // TelefonskiBroj broj;
    //String ime;
    HashMap<String, TelefonskiBroj> contactMap=new HashMap<>();

    public Imenik() {
        this.contactMap=new HashMap<>();
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
        String ime = "";
        return  this.contactMap.get(broj).toString();
    }

    public String naSlovo(char s){
        String p = "" + s;
        String ispisi="";
        int brojac=0;
        for(String ime1 :contactMap.keySet()){
            if ( ime1.startsWith(p) ){
                brojac+=1;
                ispisi+=(brojac+". "+ime1+" - "+dajBroj(ime1)+"\n");
            }
        }
        return ispisi;
    }
    public Set<String> izGrada(FiksniBroj.Grad g) {
        Set<String> skup = new TreeSet<String>();
        for (String ime : this.contactMap.keySet()) {
            TelefonskiBroj br1 = this.contactMap.get(ime);
            if(br1 instanceof  FiksniBroj) {
                FiksniBroj br2 = (FiksniBroj) br1;
                if (br2.getGrad() == g) skup.add(ime);
            }
        }
        return skup;
    }
    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g) {
        Set<TelefonskiBroj> skup =new TreeSet<TelefonskiBroj>();
        for (String ime : this.contactMap.keySet()) {
            TelefonskiBroj br1 = this.contactMap.get(ime);
            if (br1 instanceof FiksniBroj) skup.add(br1);
        }
        return skup;
    }

}



