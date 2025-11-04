package kütüphaneyönetim;

import java.util.Scanner;

public class BookBorrowInfo  {

Library library ;

    public BookBorrowInfo(Library library) {
        this.library = library;
    }



    public void borrowWhichBook(Scanner input) {
        Books selectedBook = null;
        input.nextLine();
        while (true) {
            System.out.println("Ödünç almak istediğiniz kitap hangisi ");

            for (Books w : library.booksSet) {
                System.out.println("Kitap: " + w.name +
                        " | Yazar: " + w.author +
                        " | Sayfa: " + w.pages +
                        " | Yıl: " + w.date);

            }

            String a = input.nextLine();
            boolean found = false;

            for (Books w : library.booksSet) {
                if (w.name.equalsIgnoreCase(a)) {
                    selectedBook = w;
                    found = true;
                    break; // bulunca for’dan çık
                }
            }

            if (!found) { // 👈 kitap bulunmadıysa sadece 1 kez uyarı ver
                System.out.println("Böyle bir kitap yok, başka bir kitap ismi giriniz.");

            }
            if (selectedBook != null) {
                if (selectedBook.isBorrowed) {
                    System.out.println("Bu kitap ödünç alınmış ");

                }else {
                    System.out.println("Bu kitabı ödünç alabilirsiniz");
                  selectedBook.isBorrowed = true;
                    new BorrowOnayıDate(library, selectedBook).onay(input);

                }

                    System.out.println("Başka bir kitap ödünç almak ister misiniz? (evet = e hayır = h) ");
                    String başkaKitap = input.nextLine();

                    if (başkaKitap.equalsIgnoreCase("e")) {

                        continue;

                    }else {
                        System.out.println("Teşekkürler, iyi okumalar!");
                        break; // döngüden çık

                }
                }

            }


        }


    }




