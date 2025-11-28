package eticaret;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ProductsService {


    //service katmani (business) mantıksal işlemler, kontroller
    //service classları’da repository classları ile görüşür

    // AMAÇ: İş mantığını (business logic) uygular.
    // Repository katmanını kullanarak veritabanı işlemlerini yapar ve kullanıcıdan alınan
    // veriler üzerinde kontroller gerçekleştirir.
    // Örneğin, öğrenci bilgilerini alma ve kaydetme gibi mantıksal adımları içerir.

    //Kullanicidan girdi almak icin kullanilacak
private Scanner input = ProductController.inp;

    //Veritabani islemlerini yapmak icin kullanacagiz
private Repository repository = new ProductRepository();


    //1-------------
    // Metot: Veritabanında product tablosunu oluşturmak için Repository katmanını çağırır.


public  void  createTable(){
//Kulanicinin table olusturmaya yetkisi var mi diye kontrol edildi....
 repository.createTable();
}

 //2----------------
//Metot:Kullanıcıdan öğrenci bilgilerini (name,price,category) alarak yeni bir Student objesi oluşturur.

  public Products getProductInfo(){

      System.out.println("Product name : ");
      String name = input.nextLine();

      System.out.println("Product price : ");
      double price = input.nextDouble();
input.nextLine();

      System.out.println("Product category : " );
    String categoryStr = input.nextLine();


      Products products = new Products(name,price,categoryStr);
      //Student class'taki parametreli constructor'a verilerimizi gonderelim
     return products;
  }

    //3----------------
    // Metot: Yeni oluşturulan products objesini veritabanına kaydetmek için Repository katmanına gönderir.

public  void saveProducts (Products products1){

repository.save(products1);

}


    //4----------------
    // Metot: Bu metodun temel amacı, veritabanındaki tüm product kayıtlarını alıp
    // konsolda kullanıcıya göstermektir. ProductService sınıfı, veriyi "nasıl" çekeceği (SQL sorgusu)
    // ile ilgilenmez, sadece ProductRepository'deki findAll() metodunu çağırarak veriyi talep eder.
    //Bu, katmanlı mimarinin temel prensibidir: her katmanın kendine ait bir sorumluluğu vardır.
    // ProductService iş mantığını yönetirken, veri erişim detaylarını ProductRepository'ye devreder.


public  void  printAllProducts(){

    List<Products> productsList = repository.findAll();

    System.out.println("===================================");
    System.out.println("----------- TÜM ÜRÜNLER -----------");

for (Products pr : productsList){

    System.out.println("Ürün adı : " + pr.getName() +
            "\nÜrün fiyatı : " + pr.getPrice()+
            "\nÜrün kategorisi : " + pr.getCategory().name());



}




}

//5----------------
    // Metot: Belirli bir ID'ye sahip productları Repository katmanından bulur.
    // Eğer product bulunamazsa konsola uyarı mesajı yazdırır.



public Products getProductById(int id ){

Products products = (Products) repository.findById(id);

if (products == null){
    System.out.println("İD 'si verilen ürün bulunamadı");
}

return products;
}


//6----------------
// Metot: Belirli bir ID'ye sahip productı bulur ve bilgilerini konsolda yazdırır.
// Bu metot, öncelikle getProductById(id) metodunu çağırarak ürünün var olup olmadığını kontrol eder.


public  void  printProductById(int id ){

 Products foundProduct =getProductById(id);

if (foundProduct != null){
    System.out.println(foundProduct);

}




}


    //7----------------
    // Metot: Belirli bir ID'ye sahip öğrencinin bilgilerini günceller.
    // Önce öğrencinin varlığını kontrol eder, ardından yeni bilgileri alıp Repository katmanını
    // kullanarak güncellemeyi yapar.


    public  void  updateStudent(int id ){

    Products products = getProductById(id);//Girilen id'li product var mi diye kontrol ettik

if (products!=null){

    Products newProduct = getProductInfo();
    repository.update(newProduct,id);

}

    }

    //8----------------
    // Metot: Belirli bir ID'ye sahip öğrenciyi siler.
    // Tıpkı güncelleme gibi, bu metot da silme işleminden önce bir kontrol mekanizması içerir.

public void deleteProductById (int id){

 getProductById(id);
 repository.deleteById(id);

}


//9----------------
    // Metot: Tüm öğrencilerin ad-soyad bilgilerini alıp bir metin dosyasına ("student_report.txt") yazar.
    //Bu işlem, uygulamanın ana akışını engellememesi için asenkron olarak
    // (başka bir iş parçacığında) çalıştırılmıştır.
    // Asenkron bir işlem gibi görünmesi için 10 saniye bekletme (`Thread.sleep`) içerir.


public void generateReport (){

   List<Products> allProduct = repository.findAll();
    System.err.println("Rapor oluşturuluyor");

    try {
        Thread .sleep( 10000);
        FileWriter writer = new FileWriter("products_report.txt");
        writer.write("**** Product Report ****");
        for (Products products : allProduct){

        writer.write("Ürün adı : " + products.getName()+"\n Fiyat : " + products.getPrice());

        }

    }catch (InterruptedException | IOException e) {
        e.printStackTrace();
    }
    System.err.println("Rapor oluşturuldu ve products_report.txt dosyasına yazıldı...");

}

















}
