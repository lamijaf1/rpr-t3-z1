package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj  {
    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    public enum Grad {
        SARAJEVO(33), TUZLA(35), ZENICA(32), POSUSJE(39), BIHAC(37), GORAZDE(38), BUGOJNO(30), ODZAK(31),LIVNO(34),MOSTAR(36);
        private final int id;
        Grad(int id) { this.id = id; }
        public  int getValue() { return id; }

    }
    private String broj;
    private Grad grad;
    public FiksniBroj(Grad grad, String broj){
        this.setGrad(grad);
        this.setBroj(broj);
    }
    @Override
    public int hashCode(){
        return getGrad().getValue();
    }
    @Override
    public String ispisi(){
        int br= this.getGrad().getValue();
        return "0"+br+"/"+ this.getBroj();
    }
  /*  @Override
    public int compareTo(FiksniBroj br){
        return getBroj().compareTo(br.getBroj());
    }*/
}
