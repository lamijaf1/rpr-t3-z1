package ba.unsa.etf.rpr.tutorijal03;

import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.*;

public class Program {

        public static void main(String[] args) {
            FiksniBroj fB=new FiksniBroj(SARAJEVO, "123-456");
            MobilniBroj mB=new MobilniBroj(62, "442-598");
            System.out.println(fB.ispisi());
            System.out.println(mB.ispisi());
            Imenik imenik = new Imenik();
            imenik.dodaj("Pero Peric", new MobilniBroj(64, "987-654"));

        }
    }


