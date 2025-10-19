package Kelime;

import java.util.Scanner;

public class Player {



    String isim = "" ;
    String isim2 = "" ;
    int puan = 0;
    int puan2 = 0;

    public String getİsim(Scanner input){
        System.out.println("1. oyuncu : İsminizi giriniz");
        isim = input.nextLine();

  return isim;  }
    public void getİsim2(Scanner input) {
        System.out.println("2. oyuncu : İsminizi giriniz");
        isim2 = input.nextLine();
    }



   public int  getPuan(){
       System.out.println(puan);
       System.out.println(puan2);
   return puan; }

















}
