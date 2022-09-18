package day8_abstractClass;

public class Personel {

    static final String sirketIsmi="Yildiz Celik"; //static oldugun icin herkes buraya ulasabilecek ama final oldugu icin kimse degistiremeyecek
    static final String sirketAdresi="Istanbul/Turkey";

    protected String isim="Deger Girilmemis";
    protected String soyisim="Deger Girilmemis";
    protected String tcNo="Deger Girilmemis";
    protected String iseBaslamaTarihi="Deger Girilmemis";
    protected String sigortaNo="Deger Girilmemis";
    static int personelSayac=1000;

    protected String personelNo;

    protected String personelNo(){
        personelSayac++;
        String no=personelSayac+"";
        return no;
    }
}


