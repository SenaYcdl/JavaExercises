package KarmaSorular;

public class Test01_EbobEkok {

    public static void main(String[] args) {

        int a=30;
        int b=40;

        int Ebob = Ebob(a,b);

        int Ekok = Ekok(a, b, Ebob);

        System.out.println("Girdiğiniz Sayıların \n"
                + "En Büyük Ortak Böleni (EBOB):  "+Ebob
                + "\nEn Küçük Ortak Katı (EKOK): "+Ekok+"'dir");


    }

    public static int Ebob(int a, int b) {
        int ebob=1;

        for(int i = 2; i<=a && i<=b; i++){
            if(a%i==0 && b%i==0){
                ebob=i;
            }
        }
        return ebob;
    }

    public static int Ekok(int a, int b, int ebob) {
        int ekok=(a*b)/ebob;


        return ekok;
    }
}

