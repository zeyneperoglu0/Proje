package kütüphaneyönetim;


import java.time.LocalDate;
import java.util.Scanner;


public class Runner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    
MainMenu mainMenu = new MainMenu();
mainMenu.menu(input);

Library library = new Library();
İadeEdilmesiGereken iadeSüresi = new İadeEdilmesiGereken(library);
library.addBooks();
Hangiİşlem hangiİşlem = new Hangiİşlem();
hangiİşlem.whichProccess(input);
DonatedBook donatedBook = new DonatedBook(library);
BookBorrowInfo bookBorrowInfo = new BookBorrowInfo(library);
BorrowOnayıDate borrowOnayıDate = new BorrowOnayıDate(library);

        if (hangiİşlem.num ==  1 ){//HANGİ KİTABI ÖDÜNÇ ALMAK İSTİYOR ONU SORDUK KİTAPLAR YAZDIRDIK

            bookBorrowInfo.borrowWhichBook(input);

        } else if (hangiİşlem.num ==2 ) {

            System.out.println("İadesini yapacağınız kitabın bilgilerini giriniz");
İade i̇ade = new İade(library);
i̇ade.iade(input);


        } else if (hangiİşlem.num==3) {
           donatedBook.donatedBooks(input);}

            System.out.println("İade süreleri " );
            iadeSüresi.iadeEdilmesiGerekenKitaplar();




































//YENİ KİTAP OLUŞTURCAM MESELA KULLANICIDAN ALIP







































}}
