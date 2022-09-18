package MiracHoca_Practice.Polymorphism;

public class Runner {
    public static void main(String[] args) {

        Civciv civciv1 = new Civciv();
        Ordek ordek1 = new Ordek();
        hayvanSesCikar(civciv1);
        hayvanSesCikar(ordek1);
    }


    public static void hayvanSesCikar(Animal animal) {
        animal.sesiCikar();
    }


}
