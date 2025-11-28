package eticaret;

import java.util.Scanner;

public class ProductController {

    public static Scanner inp= new Scanner(System.in);



//1--------------------
    // Metot: Uygulamanın ana giriş noktasıdır ve programı başlatır.

    public static void main(String[] args) {
        start();
    }




private static void start() {

    // Service katmanına erişim için bir nesne oluşturulur.

    ProductsService service = new ProductsService();
    // Uygulama başladığında veritabanı tablosunun oluşturulmasını sağlar.
    // ProductsService classtaki createTable() metodu cagirilir
    service.createTable();

    int select;
    int id;

    // Kullanıcı '0' girip, çıkış yapana kadar menüyü tekrar tekrar gösteren döngü.

    do {
        System.out.println("=============================================");
        System.out.println("Ürün Yonetim Paneli");
        System.out.println("1-Ürün Kaydetme");
        System.out.println("2-Tum Ürünleri Goruntuleme");
        System.out.println("3-Ürünü Guncelleme");
        System.out.println("4-Ürünü Silme");
        System.out.println("5-Tek Bir Ürünü Goruntuleme");
        System.out.println("6-Tum Ürünlerin ÜRÜN ADI - FİYATI  bilgilerini Rapora Yazdirma");
        System.out.println("0-CIKIS");
        System.out.println("Islem Seciniz : ");
        select = inp.nextInt(); //Kullanicinin secimini okuduk
        inp.nextLine(); //Yeni satir karakterini temizledik


        // Kullanıcının seçimine göre ilgili işlemi yapan kontrol yapısı.

        switch (select) {

            case 1:
                Products products = service.getProductInfo();
                new Thread(() -> service.saveProducts(products)).start();
                break;
            case 2:
                service.printAllProducts();
                break;
            case 3:
                System.out.println("id giriniz");
                id = inp.nextInt();
                inp.nextLine();
                service.getProductById(id);
                service.updateStudent(id);
                break;
            case 4:
                System.out.println("id giriniz");
                id = inp.nextInt();
                inp.nextLine();
                service.getProductById(id);
                service.deleteProductById(id);
                break;
            case 5:
                System.out.println("id giriniz");
                id = inp.nextInt();
                inp.nextLine();
                service.printProductById(id);
                break;
            case 6:
                service.generateReport();
        }


    } while (select != 0);


}}
