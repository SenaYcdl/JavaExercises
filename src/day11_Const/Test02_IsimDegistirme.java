package day11_Const;

public class Test02_IsimDegistirme {
    public static void main(String[] args) {

        // class da body icinde sag click->
        // Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)

    /*
     * - Main method icerisinde bir ogrenciye ait variable’lar olusturun ve bu
     * variable’lara atama yapin
     * - isimDegistir adinda bir method olusturun, parametre olarak ogrenci
     * bilgilerini alsin ve methodun icinde tum bilgileri degistirip, yeni
     *  bilgileri
     * yazdirsin
     * - Main method icinde isimDegistir methodunu cagirdigimiz satirin hemen
     * sonrasinda yeniden ogrenci bilgilerini yazdirin
     * -Soyisimdegistir isminde bir method olusturun, bu method parametre olarak
     *  "soyisim"
      variable'ini alsin. method'un icinde kullaniciya yeni soyisim girmesini
      istesin ve
      eski soyismi degistirsin.
     * Not :Instance variable'lar object'lere aittir ve diger adi object
     * variable'dir
     */

        String isim="Beyza";
        String soyIsim="Kilic";
        String ogrenciTel="12345";

        System.out.println("Ogrenci isim " + isim + " Soyisim " + soyIsim + " Telno " + ogrenciTel);
        isimDegistir(isim,soyIsim,ogrenciTel);

        soyIsimDegistir(soyIsim);

        soyIsim=soyIsimDegistir(soyIsim);
        System.out.println("isim :"+ isim + " yeniSoyisim :" + soyIsim + " tel: " +ogrenciTel);


    }

    public static String soyIsimDegistir(String soyIsim) {


        String yeniSoyIsim="Yilmaz";

        return yeniSoyIsim;
    }

    public static void isimDegistir(String isim, String soyIsim, String ogrenciTel) {

        isim="Nida";
        soyIsim="Yucedal";
        ogrenciTel="3456";
        System.out.println("Ogrenci isim " + isim + " Soyisim " + soyIsim + " Telno " + ogrenciTel);


    }
}

