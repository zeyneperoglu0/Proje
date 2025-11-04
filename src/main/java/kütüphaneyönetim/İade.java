package kütüphaneyönetim;

import java.time.LocalDate;
import java.util.Scanner;

public class İade {

    Library library ;

    public İade(Library library) {
        this.library = library;
    }




public void iade (Scanner input ) {
    input.nextLine();
    System.out.println("İade edeceğiniz kitabın adını giriniz");
    String iadeBookName = input.nextLine();
    System.out.println("İade edeceğiniz kitabın yazarının adını giriniz");
    String iadeBookAuthor = input.nextLine();
    System.out.println("İade edeceğiniz kitabın sayfa sayısını giriniz");
    int iadeBookPages = input.nextInt();
    System.out.println("İade edeceğiniz kitabın yayınlanma tarihini giriniz");
    int iadeBookDate = input.nextInt();
    input.nextLine();

    Books bookKullanıcı = new Books(iadeBookName, iadeBookAuthor, iadeBookPages, iadeBookDate, false, LocalDate.now());
    library.booksSet.add(bookKullanıcı);


    System.out.println("Kitap: " + iadeBookName +
            " | Yazar: " + iadeBookAuthor +
            " | Sayfa: " + iadeBookPages +
            " | Yıl: " + iadeBookDate);
    System.out.println(" Kütüphaneye başarıyla iade edildi");

}}

