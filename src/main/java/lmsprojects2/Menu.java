package lmsprojects2;

import java.util.Scanner;

public class Menu extends Pojo{


//    Menü: Kullanıcıya işlem seçimi için menü gösterilir.
//            (switch + do while)

public void menu(Scanner input ) {
    Register register = new Register();
    Login login = new Login();

    while (true){
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz" +
            "\n1-Üye ol" +
            "\n2-Giriş yap" +
            "\n3-Şifre değiştir" +
            "\n4-Çıkış");
    String sec = input.nextLine();

    switch (sec) {
        case "1" -> {
            register.emailControl(input);
            register.passwordControl(input);
            register.addAccount();
        }
        case "2" -> login.loginWithRegisteredAccount(input);
        case "3" -> login.changePassword(input);
        case"4"->{
            System.out.println("çıkış yapılıyor...");
            return;
        }
        default -> System.out.println("geçersiz");
    }
    ;

}




















}



















}
