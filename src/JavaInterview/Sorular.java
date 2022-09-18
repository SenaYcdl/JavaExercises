package JavaInterview;

public class Sorular {
    /*
    JAVA INTERVIEW SORULARI

S1: Java platformu neden bağımsızdır?
C1: Herhangi bir sistemde çalışabilen bayt kodlarından dolayı.

S2: Java neden %100 nesne yönelimli değil?
C2: Çünkü nesne olmayan 8 primitive data türünü kullanır.

S3: public static void main (String [] args) Java’da yer alan   bu yapıyı açıklayınız.
C3: Bu, herhangi bir Java programı için giriş noktasıdır
public: bu yönteme kimin erişebileceğini belirtmek için kullanılan bir erişim değiştiricidir ve bu yöntemin herhangi bir sınıf tarafından erişilebilir olacağı anlamına gelir.
static: Java'da sınıf tabanlı olduğunu tanımlayan bir anahtar kelimedir. main (), bir sınıfın oluşumunu oluşturmadan erişilebilmesi için Java’da static yapılır.
void: methodun return type dır.
main (): JVM tarafından aranan methodun adıdır. JVM: Java sanal makinesi
String args ise main methoda iletilen parametredir.

S4: Wrapper Class’lar nelerdir?
C4: Wrapper Class’lar Java primitive datalarını o sınıfın başvuru türlerine veya o
Class’ın nesnelerine dönüştürürler.


S5: Java da Constructor nedir?
C5: Bir nesneyi başlatmak için kullanılan bir kod bloğunu ifade eder. Sınıfın adıyla
aynı ada sahip olmalıdır.

S6: Kaç çeşit Constructor vardır? C6: 2 çeşit Constructor vardır.
1) Default Constructor: herhangi bir girdi ya da değer almaz.
2) Parmeterized Constructor: durum değişkenlerini sağlanan değerlerle başlatabilir.


S7: Bir Class i nasıl singleton yapabiliriz?
C7: O Class’ta ki Constructor i private yaparak.

S8: Java da ArrayList ve Vector arasındaki fark nedir?
C8: ArrayList hızlı olması için senkronize edilmemiştir ancak Vector, iş parçacığı açısından güvenli olduğundan yavaş olması için senkronize edilmiştir.


S9: Java da equals () ve = = işareti arasındaki fark nedir?
C9: equals () operatörü primitive dataları ve Objectleri karşılaştırmak için kullanılır. == ise iki tane Object i karşılaştırmak için kullanılır.


s10: Java’da Heap ve Stack Memory arasındaki farklar nelerdir?
C10: Heap hafızası bir Application in tüm parçaları tarafından kullanılır. Objectler Heap içinde depolanır ve herkesçe genel kullanıma müsaittir. Stack hafıza ise sadece bir yürütme dizisi tarafından kullanılır ve diğerleri tarafından asla kullanılamaz.


S11: Java da package nedir?
C11: İlgili Class’ların toplandığı yerdir.

S12: Package’ların avantajları nelerdir?
C12:

1. İsim çatışmasını önler.
2. Kodlara kolay ulaşım sağlar.
3. Gizli Class’ları barındırır ki Class dışından görülemesin.

S13: Neden pointer lar Java da kullanılmazlar?
C13: Çünkü güvenli değillerdir ve program içindeki karmaşıklığı artırırlar.

S14: Java da JIT derleyici (compiler) nedir?
C14: JIT derleyici yani tam zamanlı derleyici, Java bayt kodlarını talimatlara
dönüştürmeye yardımcı olan bir programdır.

S15: Java da access modifier lar nelerdir?
C15: Default, Private, Public ve Protected.

S16: Java’da ki access modifier lari açıklayınız?
C16: Default: ayni package ve class tan ulaşılabilir.
Public: tüm package lar ve class tan ulaşılabilir.
Private: sadece ayni class tan ulaşılabilir.
Protected: sadece farklı pakette ama alt olmayan class tan ulaşılamaz. Diğer şekillerde ulaşılabilir.

(Uyarı: Protected a dikkat edin lütfen yani ayni package ya da farklı package olması önemli değil sadece farklı package in alt class in da olmayan dosyadan erişim sağlanamıyor.)
*Tablo burada daha net anlaşılabilir.
same => ayni;
different => farklı;
subclass - alt class => alt kumesi gibi; non-subclass => alt class i olmayan demek.

S17: Java da class i tarif ediniz?
C17: Class, datalarımızı barındıran içinde field variable’ları ve method’ların olduğu bizim çalışma alanımızdır.



S18: Java da obje (Object) nedir ve nasıl oluşturulur?
C18: Obje, örnek değişkenlere sahip sınıfın bir örneğidir. Java'da new anahtar sözcüğü kullanılarak bir Obje oluşturulur.



S19: OOP nesne yönelimli programlama nedir?
C19: Bu bir programlama modeli veya yaklaşımı, büyük ve karmaşık kodlu programlar için idealdir ve aktif olarak güncellenmesi ve sürdürülmesi gerekir. Programlar, mantık ve işlevler yerine objeler etrafında düzenlenmiştir.




S20: Java da OOPs nin ana konsepti nelerdir?
C20: İnheritance, Encapsulation, Abstraction, Polymorphism.


S21: Bunları (OOPs nin ana konseptleri) açıklayınız?
C21:
Inheritance kalıtım-miras: Bir sınıfın başka bir sınıfın özelliklerini elde ettiği miras aldığı bir süreçtir.
Encapsulation-kapsülleme: Verileri sarmalama mekanizmasıdır. Abstraction-soyutlama: Kullanıcıdan var olan detayları gizleme metodolojisidir.
Polymorphism: Bir değişkenin birden çok form alma yeteneğidir.

S22: Local variables ile instance variables arasındaki fark nedir?
C22: Local variables: tipik olarak bir method, constructor veya block içinde kullanılır ve yalnızca yerel kapsamı vardır. Instance variables: objesinin kendisine bağlı bir değişkendir. Bir class içinde ancak method dışında bildirilirler.

S23: Java da Constructors ve Methods arasındaki farklar nelerdir?
C23:
1. Constructors: Bir objenin durumunu başlatmak için kullanılır.
Methods: Bir objenin davranışını temsil etmek için kullanılır.
2. Constructors: Herhangi bir dönüş türü (return type) yoktur.
Methods: Bir (return type) dönüş türüne sahip olmalıdır.
3. Constructors: (Örtülü) İmplicitly olarak çağrılır
Methods: (Açıkça) Explicitly çağrılması gerekiyor
4. Constructors: Class adıyla aynı isimde olmak zorundadır.
Methods: Olabilir veya olmayabilir de.


S24: Java’da final keyword unu açıklayınız?
C24: Final Java özel bir keyword dur ve non-access modifier (erişim olmayan
değiştirici) olarak kullanılır.

S25: Final keyword un kullanımını açıklayınız?
C25: Final keywordunu bir variable ile kullandığımızda onun value yani değeri bir kez atandığı için değiştirilemez.
Final Methodlar override edilemez. Final Class’lar extends edilemez.


S26: Break ve Continue yapıları arasındaki farklar nelerdir? C26:
1. Break Switch ve Loop’larda kullanılır.
Continue sadece Loop’larda kullanılır.
2. Break sistem çalışırken bulunduğu işlemi sonlandırır.
Continue işlemi sonlandırmaz sadece sıradaki diğer seçeneğe atlar.



S27: Java’da sonsuz döngü (Loop) nedir?
C27: Java’da bir işlevsellik karşılanmadığında, bir talimat dizisi tarafından sonsuz döngüye girilir.


S28: Java'da this() ve super() anahtar kelimeler arasındaki fark nedir?
C28: This() aynı class in varsayılan Constructor’larını çağırmak için kullanılır, ancak super() onları ebeveyn / temel class tan çağırmak için kullanılır.

Not: this () ve super () (anahtar sözcükleri) keywords bir bloğun ilk satırında yer almalıdırlar.

S29: Java da String Pool nedir?
C29: Heap hafıza içinde String’lerin toplandığı havuz yani yerdir. Bir Object oluşturulduğu zaman onun bu havuzda önceden olup olmadığını kontrol eder.

S30: Static method ve non-static methodlar arasındaki farklar nelerdir?
C30:
1. Static method: Static anahtar sözcüğü method adından önce kullanılmalıdır. Ancak non-static method anahtar kelimesini statik kullanmaya gerek yoktur.
2. Static method: Class kullanılarak çağrılır
Ancak non-static methodlar genel methodlar gibi çağrılabilir.
3. Static method: Statik olmayan değişkenlere (variables) erişilemez Ancak non-static method bunlara erişebilir.

S31. String’ler ve StringBuilder’lar arasındaki farklar?
Q31: 1. saklama alanı; String’ler StringPool'da
StringBuilder Heap hafızada 2. İş parçacığı güvenliği; String’ler evet
3. form;
4. Performans;
StringBuilder no
String’ler Değişmez
StringBuilder değiştirilebilir
String’ler Hızlı
StringBuilder daha verimli, özellikle setter ve getter methodlarinda.


S32: Constructor’lar inherited edilebilir mi?
C32: Hayır edilemez.

S33: ClassLoader nedir?
C33: JVM in altkümesi ve class dosyalarının yüklenmesinden sorumlu yapı.

S34: Kaç tane ClassLoader vardır ve nelerdir?
C34: Java 3 tane ClassLoader destekler
1. Bootstrap
2. Extension
3. System / Application



S35: Java’da String’ler neden doğası gereği değişmezdir?
C35: Basitçe, String objesi oluşturulduktan sonra durumunun değiştirilemeyeceği anlamına gelir. Uygulamanın güvenlik önbelleğini, senkronizasyonunu ve performansını artırır.


S36: Array ve ArrayList arasındaki farklar nelerdir?
C36:
1. Array, farklı veri türlerinin değerlerini içeremez.
ArrayList bunları içerebilir.
2. Array size’ı tanımlanmalıdır.
ArrayList size’ı dinamik olarak değiştirilebilir.
3. Veri eklemek için Array’in indeksi belirtmesi gerekir.
ArrayList buna ihtiyacı yok.
4. Array’ler primitive data ve nesneler (Objects) içerebilir.
ArrayList yalnızca objeleri içerebilir.

S37: Java da Map nedir?
C37: Map, benzersiz anahtarları (keys) değerlerle (values) eşleştiren bir Util Paketi ara yüzüdür.
Yinelenen anahtarlar (key) içermez
Her anahtar (key) en fazla bir değerle(value) eşlenebilir


S38: Java da Collection Class nedir?
C38: Collection bir mimar gibi bir grup nesne objeyi depolamak ve işlemek için hareket eden bir çerçeveden framework tan oluşur.

S39: Collection Class’lar neler içerirler açıklayınız?
C39: Interface, class ve methodlar içerirler. List, queue ve set en önemli parçalarıdır Collection Class’ların.

S40: Polymorphism nedir?
C40: Bu soruya en iyi örnek; kamera, hesap makinesi, mp3 çalar yada uzaktan kumanda gibi kullanılan bir cep telefonudur.


Q41: Kaç çeşit Polymorphism vardır?
C41: 2 çeşittir;
1- Compile time Polymorphism method overloading dir.
2- Run Time Polymorphism dir inheritance and interface tarafından yapılır.



S42: Java’da Abstraction (soyutlama) nedir?
C42: Temelde ayrıntıları gizlemek ve önemli olanları kullanıcıya göstermekle
ilgilenir. İki yol olabilir soyutlama sınıfları (Abstraction class) ve ara yüzleri (Interface)


S43: Java da Interface ne anlam ifade eder?
C43: Abstraction method ve statik sabitlerin birleşimidir. Herhangi bir Constructor’a sahip değildir. Boş gövdeli birbiriyle alakalı methodlar dan oluşan bir gruptur.



S44: Abstract Class ile Interface arasındaki farklar nelerdir? (Bu soru olmazsa olmazlardan)
A44: 1.
Abstract Class: Overridden yapılmasını sağlayabilir.
Interface: sadece imzada yer alır, herhangi bir kod sağlayamaz.
2. Abstract Class: bir class yalnızca bir soyut Abstraction class i genişletebilir (extend edebilir)
Interface: bir class birkaç Interface uygulayabilir
3. Abstract Class: soyut olmayan method sahip olabilir
Interface: Tüm (ara yüz) Interface methodlar (abstract tir) soyuttur
4. Abstract Class: örnek değişkeni (instance variable) olabilir
Interface: örnek değişkenlere (instance variables) sahip olamaz
5. Abstract Class: herkes tarafından ulaşılan görünürlüğe sahip olabilir public protected
private
Interface: sadece public olmalı ya da olmamalı
6. Abstract Class: Constructor içerebilir
Interface: Constructor içeremez
7. Abstract Class: hızlı
Interface: yavaş , gerçek class a uygun methodu bulmak için ekstra zamana ihtiyaci var.



S45: Java da Inheritance (kalıtım-miras) nedir?
A45: Bu bir kavramdır ve kodun yeniden kullanılmasına yardımcı olur. Farklı class lar arasında bir ilişki kurar.
İsimleri ebeveyn class ı ve alt class ıdır.

S46: Java da alt class (child) nedir?
A46: Özellikleri miras alan bir class, alt class olarak tanınır.

S47: Inheritance çeşitleri nelerdir?
C47: tek (single), çok düzeyli(multilevel), hiyerarşik (hierarchical) ve karma (hybrid)

S48: Açıklayınız?
C48: Single: Multilevel:
Hierarchical:
Hybrid:
Bir ebeveyn bir çocuk
Daha fazla ebeveyn bir çocuk Bir ebeveyn daha fazla alt sınıf
İki veya daha fazla kalıtım türünün bir kombinasyonudur.


S49: Java da method Overloading nedir?
C49: Methodun davranışına daha fazlasını eklemek veya genişletmektir.
Bu bir derleme zamanı (compile time) polimorfizmidir.
Methodların farklı imzaları olmalıdır.
Aynı Class’ta ki methodlar aynı adı paylaşır ancak her methodun farklı sayıda parametresi olmalıdır. Veya farklı tür ve sıraya sahip parametreler.
Class’ta mirasa inheritance ihtiyaç duyabilir veya gerekmeyebilir.


S50: Java da method Overridden nedir?
A50: Methodun mevcut davranışını "değiştirmektir".
Bu bir çalışma zamanı polimorfizmidir.
Methods aynı imzaya sahip olmalıdır.
Alt class, aynı ada sahip aynı methoda sahiptir.
Tam olarak aynı sayıda ve türde parametreler ve süper class olarak aynı return type olmalıdır.
     */
}
