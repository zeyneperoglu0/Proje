package kütüphaneyönetim;

import java.util.HashMap;
import java.util.Scanner;

public class MainMenu extends UserInfos{


 public void menu(Scanner input  ){
while (true) {
    System.out.println("BooksL sistemine Hoşgeldiniz" +
            "\nHesabınız varsa giriş yapınız yoksa bir hesap oluşturunuz ");
    System.out.println("Hesabınıza giriş yapmak için v tuşuna yeni hesap oluşturmak için y tuşuna basınız");
    String varYok = input.nextLine();

    if (varYok.equalsIgnoreCase("v")) {
        userInfosMethod(input);
        break;

    } else if (varYok.equalsIgnoreCase("y")) {
        setUserNames(input);
        newAccountMethod(input);
        break;
    } else {

    }
}
 }





}
