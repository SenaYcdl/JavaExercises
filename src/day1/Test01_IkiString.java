package day1;

public class Test01_IkiString {
    public static void main(String[] args) {

        /*
         1. İki String ifadeyi parametre olarak alan bir metot tanımlayınız.
        2. Metodumuz bir cümle ve bu cümleden çıkarmak istediğimiz kelimeyi  parametre olarak alsın.
        3. Sonuç olarak metodumuz cümle içinden istediğimiz kelimeyi çıkararak bize döndürsün.
        Örneğin;
        ("bugün hava çok güzel", "çok") ➞ "Bugün hava güzel"
        ("merhaba dünya", "dünya") ➞ "merhaba"
         */

        String str = "bugün hava çok güzel ama çok sicak";
        String cikar = "çok";

        System.out.println(kelimeCikar(str, cikar));


    }



    public static String kelimeCikar(String str, String cikar) {


        String[] arr = str.split(" ");


        String yeniCumle = "";

        for (String each : arr) {
            if (!each.equals(cikar)) {
                yeniCumle += each + " ";

            }
        }

        return yeniCumle;
    }
}