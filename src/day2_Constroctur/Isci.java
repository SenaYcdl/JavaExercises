package day2_Constroctur;

public class Isci {

    public String isim="Isim belirtilmedi";
    public String soyIsim="soyIsim belirtilmedi";
    public String mail="Mail belirtilmedi";
    public String unvan="unvan belirtilmedi";
    public int yas;
    public int maas;

    @Override
    public String toString() {
        return
                "\nisim=" + isim +
                "\nsoyIsim=" + soyIsim +
                "\nmail=" + mail +
                "\nunvan=" + unvan +
                "\nyas=" + yas +
                "\nmaas=" + maas;
    }

    public Isci(String isim, String soyIsim, String mail, String unvan, int yas, int maas) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.mail = mail;
        this.unvan = unvan;
        this.yas = yas;
        this.maas = maas;
    }
}
