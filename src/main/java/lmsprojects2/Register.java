package lmsprojects2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Register extends Pojo {



    boolean isPassProper = false;
    boolean isEmailProper = false;

//String[] parts = email.split("@");
//            if (parts.length != 2) {  // birden fazla @ var mı?
//        System.out.println("Geçersiz e-mail formatı (birden fazla '@' içeriyor)");
//        continue;




        public boolean emailControl(Scanner input){
        isEmailProper = false;

        while (true) {
            System.out.println("Lütfen email adresinizi giriniz");
            String email = input.nextLine().trim();

            if (email.startsWith("@")){
                System.out.println("e-mail @ işareti ile başlayamaz");


           } else if (!email.contains("@")) {

                System.out.println("Girdiğiniz e-mailde \"@\" işareti eksik");
            } else if (email.replaceAll("[^@]", "").length()>1) {
                System.out.println("E-mail birden fazla '@' içeremez");

        }else {

               String first = email.split("@")[0];
               String second = email.split("@")[1];

          boolean a =    first.replaceAll("[^a-zA-Z-0-9._-]","").length()==0;
boolean b = second.equals("gmail.com")||second.equals("hotmail.com")||second.equals("yahoo.com");

if (!a){
    System.out.println("Email harf,rakam ve -._ dışında karakter içeremez");
} else if (!b) {
    System.out.println("Lütfen geçerli bir email giriniz ");
}else {

                setEmail(email);
                isEmailProper=true;
                break;
            }

        }}
        return isEmailProper;}




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
