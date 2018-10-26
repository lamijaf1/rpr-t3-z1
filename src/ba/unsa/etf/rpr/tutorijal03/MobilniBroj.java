package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj  {

    private int mobilnaMreza;
    private String broj;
    public MobilniBroj(int mobilnaMreza, String broj){
        this.setMobilnaMreza(mobilnaMreza);
        this.setBroj(broj);
    }
    //HashMap<String, Imenik> contactMap = new HashMap<String, Imenik>();
    @Override
    public  int hashCode() {
        return 0;
    }
    @Override
    public String ispisi() {
        return "0"+ getMobilnaMreza() +"/"+ getBroj();
    }
   /* @Override
    public int compareTo(MobilniBroj br){
        return getBroj().compareTo(br.getBroj());
    }*/

    public int getMobilnaMreza() {
        return mobilnaMreza;
    }

    public void setMobilnaMreza(int mobilnaMreza) {
        this.mobilnaMreza = mobilnaMreza;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }
}
