package Chatgptminiproject;

import java.util.Scanner;

public class BankAccount {


    private String hesapSahibi;

    private double bakiye;

public void paracek( Scanner input){
    System.out.println("Ne  kadar çekmek istersiniz");
    double çek = input.nextDouble();

    if ( bakiye<çek){
       System.out.println("bakiye yetersiz");
   }else{
       bakiye = bakiye - çek ;
       System.out.println( çek + " tl  çekildi");

   }
}
public void paraYatır ( Scanner input){
    System.out.println("Ne  kadar yatırmak istersiniz");
    double yatır= input.nextDouble();
    bakiye = bakiye + yatır;

    System.out.println(yatır +  " tl yatırıldı ");
}

public void getBakiye(){
    System.out.println("Bakiye : " + bakiye);
}



















}
