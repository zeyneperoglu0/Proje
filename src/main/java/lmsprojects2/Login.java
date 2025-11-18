package lmsprojects2;

import java.util.Map;
import java.util.Scanner;

public class Login   {
    Register r = new Register();
    public void loginWithRegisteredAccount(Scanner input) {

        while (true) {
            boolean found =false;
            System.out.println("Kayıtlı hesabınıza ait e-mail adresini giriniz");
            String email = input.nextLine();
            System.out.println("Kayıtlı hesabınıza ait şifrenizi giriniz");
           String password =input.nextLine();
            for (Map.Entry<String, String> e : Pojo.regMap.entrySet()) {
                if (email.equals(e.getKey()) && password.equals(e.getValue())) {
                    System.out.println("Hesabınıza giriş yaptınız");
                   found = true;
                   break;//fordan çık
                    //elsesiz tanımladık ki tüm mapi gezsin ondan sonra tekrar if kontrolü

                  }

            }if (found){
                break;//whiledan çık
            }else if (!found){
                    System.out.println("Böyle bir hesap bulunamadı e-mail veya şifrenizden en az biri yanlış." +
                            "\nLütfen tekrar giriş yapmayı deneyiniz hesabınız yoksa oluşturunuz");

                    System.out.println("Şifrenizi unuttuysanız e'ye basınız");
                    String forgot = input.nextLine();
                    if (forgot.equalsIgnoreCase("e")) {
                        forgottenPassword(input);
                        break;
                    }else if (forgot.equalsIgnoreCase("h")){

                    }}





        }
    }

    public void forgottenPassword(Scanner input) {

        while (true){   System.out.println("Lütfen e-mail adresinizi giriniz");

       String email = input.nextLine();
        if (!Pojo.regMap.containsKey(email)){
            System.out.println("Bu emaile ait hesap bulunamadı. Tekrar deneyiniz");
            continue;
        }

            System.out.println("Yeni şifrenizi giriniz:");
            String newPass1 = r.passwordControl(input);//ana şifreyi alıyoruz ki kontrol olsun pass controle götürüyoruz ordan return ediliyor

            System.out.println("Yeni şifrenizi tekrar giriniz:");
            String newPass2 = input.nextLine();

if (!newPass1.equals(newPass2)){
    System.out.println("Şifreler eşleşmiyor tekrar deneyiniz");

}
else {
    Pojo.regMap.replace(email, newPass1);
    System.out.println("Şifreniz başarıyla değiştirildi");
    break;
}
        }}


    public void changePassword(Scanner input) {
        while (true) {


            System.out.println("Lütfen e-mail adresinizi giriniz");
          String  email= input.nextLine();
            System.out.println("Lütfen eski şifrenizi giriniz");
            String oldPassword = input.nextLine();



String newPassword = r.passwordControl(input);
            if (Pojo.regMap.replace(email, oldPassword,newPassword )) {

                System.out.println("Şifreniz başarıyla değiştirildi");
                break;

            } else {
                System.out.println("Şifre değiştirilemedi lütfen tekrar deneyiniz");
            }

        }


    }
}