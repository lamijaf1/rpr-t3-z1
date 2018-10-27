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
    public Set<String> izGrada(FiksniBroj.Grad g){
        Set<String> skup=null;
        for(String ime1 :contactMap.keySet()){
            TelefonskiBroj  br = this.contactMap.get(ime1);
            //if(g==) skup.add(ime1);
        }
        return skup;
    }
    //Set<TelefonskiBroj> izGradaBrojevi(Grad g)


    /*public String ispisi(){
        return "";*/
    }



