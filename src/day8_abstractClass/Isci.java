package day8_abstractClass;

public class Isci extends Muhasebe{


    @Override
    protected int saatUcreti() {
        return 10;
    }

    @Override
    protected int aylikCalismaSuresi() {
        return 200;
    }

    @Override
    public String toString() {
        return "Isci" +
                "\nsirket ismi=" + sirketIsmi+
                "\nsaatUcreti=" + saatUcreti +
                "\naylikCalismaSuresi=" + aylikCalismaSuresi +
                "\nmaas=" + maas +
                "\nisim='" + isim +
                "\nsoyisim='" + soyisim +
                "\ntcNo='" + tcNo +
                "\niseBaslamaTarihi='" + iseBaslamaTarihi +
                "\nsigortaNo='" + sigortaNo +
                "\npersonelNo='" + personelNo;
    }

    public static void main(String[] args) {

        Isci isci1=new Isci();
        isci1.saatUcreti= isci1.saatUcreti();
        isci1.aylikCalismaSuresi= isci1.aylikCalismaSuresi();
        isci1.maas=isci1.maas(isci1.saatUcreti,isci1.aylikCalismaSuresi);
        isci1.isim="Hasan";
        isci1.soyisim="Can";
        System.out.println(isci1);


    }
}
