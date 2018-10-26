package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj   {
    private String drzava;
    private String broj;
    public  MedunarodniBroj(String drzava, String broj){
        this.drzava=drzava;
        this.setBroj(broj);
    }
@Override
    public String ispisi(){
        return drzava + "/" + getBroj();
    }
@Override
    public int hashCode() {
        return 0;
    }
/*@Override
    public int compareTo(FiksniBroj br){
        return getBroj().compareTo(br.getBroj());
    }*/

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }
}
