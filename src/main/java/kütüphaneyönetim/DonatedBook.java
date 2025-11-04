package kütüphaneyönetim;

import java.awt.print.Book;
import java.time.LocalDate;
import java.util.Scanner;


public class DonatedBook {
    String donatedBookName ;
    String donatedBookAuthor;
    int donatedBookPages;
    int donatedBookDate;
    Library library;

    public DonatedBook(Library library) {
        this.library = library;
    }

    public  void donatedBooks(Scanner input){
input.nextLine();
        System.out.println("Bağışlayacağınız kitabın adını giriniz");
 String donatedBookName = input.nextLine();
    System.out.println("Bağışlayacağınız kitabın yazarının adını giriniz");
 String   donatedBookAuthor = input.nextLine();
    System.out.println("Bağışlayacağınız kitabın sayfa sayısını giriniz");
    int  donatedBookPages = input.nextInt();
    System.out.println("Bağışlayacağınız kitabın yayınlanma tarihini giriniz");
   int   donatedBookDate  = input.nextInt();
     input.nextLine();

     Books bookKullanıcı =  new Books( donatedBookName ,donatedBookAuthor , donatedBookPages , donatedBookDate , false, LocalDate.now());
        library.booksSet.add(bookKullanıcı);

            System.out.println(donatedBookName + " , " +   donatedBookAuthor+ " , " +   donatedBookPages + " , " +   donatedBookDate + " ==> " + "Kütüphaneye başarıyla eklendi ");
        }



  }










