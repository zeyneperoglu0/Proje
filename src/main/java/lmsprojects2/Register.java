package lmsprojects2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Register extends Pojo {



    boolean isPassProper = false;
    boolean isEmailProper = false;







public String passwordControl(Scanner input){
    isPassProper = false;
    while (true) {
        System.out.println("Lütfen bir şifre oluşturunuz");
         String password = input.nextLine();

        if (password.length() < 8) {
            System.out.println("Şifre en az 8 karakter uzunluğunda olmalıdır ");
        } else if (password.replaceAll("[^a-zA-Z]", "").length() == 0) {
            System.out.println("Şifre en az 1 karakter harf içermelidir ");
        } else if (password.replaceAll("[^\\p{Punct}]", "").length() == 0) {
            System.out.println("Şifre en az 1 karakter sembol içermelidir ");
        } else {
            setPassword(password);
            isPassProper = true;

            return password;

        }
    }

  }



public boolean emailControl(Scanner input){
    isEmailProper = false;

    while (true) {
        System.out.println("Lütfen email adresinizi giriniz");
        String email = input.nextLine();

        if (email.startsWith("@")){
          System.out.println("e-mail @ işareti ile başlayamaz");

      } else if (!email.contains(".com")) {
          System.out.println("Girdiğiniz e-mailde \".com\" uzantısı eksik");

   }else if (!email.contains("@")){
          System.out.println("Girdiğiniz e-mailde \"@\" işareti eksik");
    }else {
            setEmail(email);
          isEmailProper=true;
          break;
      }

   }
    return isEmailProper;}





public void addAccount(){

     if (Pojo.regMap.containsKey(getEmail())) {
         System.out.println("Bu e-maile ait bir hesap zaten kullanılıyor lütfen giriş yapınız");
     } else if (isEmailProper&&isPassProper){
          regMap.put(getEmail(),getPassword());
          System.out.println("Hesabınız başarıyla kaydedildi");
      }
}



//    Static → ortak hafıza sağlar**
//    Şu şekilde ezbere bil:
//    Extends = her nesne kendi verisine sahip olur.
//    Static = tüm nesneler ortak veriye sahip olur.
//    Senin projen ortak kullanıcı listesi tutuyor → STATIC ZORUNLU.









}
