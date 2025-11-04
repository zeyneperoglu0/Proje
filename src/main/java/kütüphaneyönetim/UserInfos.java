package kütüphaneyönetim;

import java.time.LocalDate;
import java.util.*;

public class UserInfos {

  String name;
    String password;
    String userNames;
  int rentDate;


    HashMap<String,String> userInfosMap= new HashMap<>();

    public void invalidAccounts(){
        userInfosMap.put("lena_sahin", "Tr3eHouse!");
        userInfosMap.put("berk_aksoy", "7SunriseA");
        userInfosMap.put("deniz.kaya", "p@ssw0rd9");
        userInfosMap.put("emre_yildiz", "BlueSky88");
        userInfosMap.put("ayla.ozcan", "G8laxy#01");
        userInfosMap.put("hakanerdem", "Mango2025");
        userInfosMap.put("selin.turan", "!BookLover");
        userInfosMap.put("onur_karaca", "Viva1234");
        userInfosMap.put("zeynep_ekim", "Leaf&Wind9");
        userInfosMap.put("murat.gunes", "RiverRun77");

    }


 public void userInfosMethod( Scanner input){

     System.out.println("Lütfen kullanıcı adınızı  giriniz");
  userNames = input.nextLine();
     userNames = input.nextLine();
     System.out.println("Lütfen şifrenizi giriniz");
    password = input.nextLine();

     if (userInfosMap.containsKey(password)){
         System.out.println("Kütüphane yönetim sistemine hoşgeldiniz");
     } else {
         System.out.println(" Böyle bir kullanıcı yok Lütfen kendinize bir hesap oluşturunuz");
      newAccountMethod(input);
       userInfosMap.put(userNames,password);
         System.out.println(" Hesabınız eklendi \nKütüphane yönetim sistemine hoşgeldiniz");

     }
 }


 public void setUserNames(Scanner input){
     while (true) {//username kontrolü

         System.out.println("Lütfen bir kullanıcı adı  giriniz");
         userNames = input.nextLine();
         userNames = userNames.toLowerCase();
         if (userInfosMap.containsKey(userNames)) {
             System.out.println("Bu kullanıcı adı kullanılıyor lütfen başka bir kullanıcı adı oluşturunuz ");

         } else {

             break;

         }
     }
 }


    public void newAccountMethod(Scanner input){


        while (true){
            //şifre kontrolü
            System.out.println("Lütfen şifre oluşturunuz  şifre en az 8 karakter uzunluğunda olmalı ve en az  bir harf içermelidir");
            password = input.nextLine();


            if (password.length()<8){
                System.out.println("Şifre en az 8 karakter uzunluğunda olmalıdır");
                continue;
            }
            if (!password.chars().anyMatch(Character::isLetter)) {
                System.out.println("Şifre en az bir harf içermelidir");

            }
            else {

                System.out.println("Hesabınız başarıyla oluşturuldu");
               addNewAccount();
                break;

            }


        }


    }

public void addNewAccount(){

    userInfosMap.put(userNames,password);

}













}
