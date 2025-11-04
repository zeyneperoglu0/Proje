package kütüphaneyönetim;

import java.time.LocalDate;
import java.util.Scanner;

public class BorrowOnayıDate extends BookBorrowInfo {

   Books books;

    public BorrowOnayıDate(Library library, Books books) {
        super(library);
        this.books = books;
    }

    public BorrowOnayıDate(Library library) {
        super(library);
    }

    public void onay(Scanner input){
        System.out.println(  " Kitabı ödünç almayı onaylıyor musunuz? onaylıyorsanız e tuşuna onaylamıyorsanız h tuşuna basınız ");
String onay = input.nextLine();

if(onay.equalsIgnoreCase("e")){

 books.isBorrowed = true;

    setRentDate();
} else if (onay.equalsIgnoreCase("h")) {

}else {
    System.out.println("Ana menüye döndürülüyor");
    Hangiİşlem hangiİşlem =new Hangiİşlem();
    hangiİşlem.whichProccess(input);
}

    }


    public void setRentDate(){
        LocalDate rntdate = LocalDate.now();
        LocalDate toDate = rntdate.plusWeeks(1);
        System.out.println("Kiralama tarihi : " +  rntdate +  " Kiralama bitiş tarihi : " + toDate);


    }




}
