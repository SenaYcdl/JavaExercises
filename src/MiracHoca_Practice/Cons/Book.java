package MiracHoca_Practice.Cons;

public class Book {

    public String name;
    public int page;
    public String author;
    public String publisher;
    public double price;

    public Book(String name, int page, String author, String publisher, double price) {
        this.name = name;
        this.page = page;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public Book() {
    }

    public static void main(String[] args) {
        Book book1=new Book();
        book1.name="Seker Portakali";
        book1.author="Jose Mauro de Vasconcelos";
        book1.page=80;
        book1.price=25;
        book1.publisher="Can Yayinlari";

        Book book2=new Book("Kiraz Mevsimi",145,"Mirac","abc Yayinlari",21);

    }

}
