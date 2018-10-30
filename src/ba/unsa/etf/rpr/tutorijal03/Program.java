package ba.unsa.etf.rpr.tutorijal03;

import javax.print.attribute.SetOfIntegerSyntax;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.*;

public class Program {
    public static Scanner ulaz = new Scanner(System.in);
    public static PrintStream izlaz= System.out;
    private static Imenik imenik=new Imenik();
        public  static void DodajKontakta(PrintStream izlaz, Scanner ulaz){
            izlaz.println("Unesite ime kontakta: " );
            String ime=ulaz.nextLine();
            izlaz.println("Pristisnite 1 za unos fiksnog broja, 2 za unos mobilnog ili 3 za medjunarodni broj");
            int odabir=ulaz.nextInt();
            ulaz.nextLine();
            FiksniBroj fikbr;
            MobilniBroj mobbr;
            MedunarodniBroj medbr;
            if(odabir==1) {
                izlaz.println("Unesite grad i broj: ");
                String grad= ulaz.nextLine();
                String broj= ulaz.nextLine();
                FiksniBroj.Grad value = FiksniBroj.Grad.valueOf(ulaz.next().toUpperCase());
                fikbr=new FiksniBroj(value, broj);
                imenik.dodaj(ime,fikbr);
            }
            else if(odabir==2){
                izlaz.println("Unesite mobilnu mrezu i broj: ");
                int mob_mreza=ulaz.nextInt();
                ulaz.nextLine();
                String broj=ulaz.nextLine();
                mobbr=new MobilniBroj(mob_mreza, broj);
                imenik.dodaj(ime, mobbr);
            }
            else if(odabir==3){
                izlaz.println("Unesite drzavu i broj: ");
                String mreza=ulaz.nextLine();
                String broj=ulaz.nextLine();
                medbr=new MedunarodniBroj(mreza, broj);
                imenik.dodaj(ime,medbr);
            }
            else izlaz.println("Pogresan unos!");

        }
        public static void DajKontakta(){
            izlaz.println("Unesite ime kontakta kojeg zelite: ");
            String ime=ulaz.nextLine();
            String broj=imenik.dajBroj(ime);
            izlaz.println(broj);
        }
        public static void KontakteNaSlovo(){
            izlaz.println("Unesite slovo: ");
            char slovo=ulaz.next().charAt(0);
            String naSlovo=imenik.naSlovo(slovo);
            izlaz.print(naSlovo);
        }
        public static void izGrada(){
            Set<String>skup= new TreeSet<String>();
            String imeGrada=ulaz.nextLine();
            FiksniBroj.Grad grad = FiksniBroj.Grad.valueOf(ulaz.next().toUpperCase());
            skup=imenik.izGrada(grad);
            String result = "";
            for (String ime: skup) {
                result += ime + ",";
            }
        }


        public static void main(String[] args) {
            DodajKontakta(izlaz,ulaz);
            boolean x=true;
            while(x==true){
                System.out.println("Odaberite jednu od iducih opcija:");
                System.out.println("0: Izlaz iz programa\n 1: Dodaj kontakte u mapu \n 2: Daj broj kontakta \n 3: Daj ime kontakta ");
                System.out.println("4: Sve kontakte na unseno slovo\n 6: Skup kontakata iz grada \n 7: Skup osoba iz grada");
                int opcija=ulaz.nextInt();
                ulaz.nextLine();
                switch(opcija){
                    case 0:
                        x=false;
                        break;
                    case 1:
                        DodajKontakta(izlaz,ulaz);
                        break;
                    case 2:
                        DajKontakta();
                        break;
                    case 3:
                        break;
                    case 4:
                        KontakteNaSlovo();
                        break;
                    case 5:






                }


            }
    }


}