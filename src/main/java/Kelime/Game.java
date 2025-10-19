package Kelime;

import java.util.Scanner;

public class Game {


    String kelime = "";
    String kabulMü = "";

    int miktar=0;

    Player player1;
    Player player2;






    public void  oyunuBaslat(Scanner input){
     System.out.println("Hoşgeldiniz oyun başlatılıyor...");

     System.out.println( player1.getİsim(input)+" Bir kelime giriniz");
     kelime = input.nextLine();

 }
public void kelimeyiDegerlendir(String kelime , Scanner input ){
    System.out.println(   " '"  + kelime + "'"+  " Kelimesini kabul ediyor musunuz?");
  kabulMü= input.nextLine();



}
public int puanVerpl1( ){
 if (kabulMü.equalsIgnoreCase("evet")  ){
    player1.puan = player1.getPuan() + kelime.length();

 } else if (kabulMü.equalsIgnoreCase("hayır")) {
     System.out.println("Geçersiz kelime"  + player1.isim + " Oyunu kazandı ");
 }else {
     System.out.println("Geçersiz cevap ");
 }


return player1.puan;}

    public int puanVerpl2( ){
        if (kabulMü.equalsIgnoreCase("evet")  ){
            player2.puan2 = player2.puan2 + kelime.length();

        } else if (kabulMü.equalsIgnoreCase("hayır")) {
            System.out.println("Geçersiz kelime"  + player2.isim2 + " Oyunu kazandı ");
        }else {
            System.out.println("Geçersiz cevap ");
        }


        return player2.puan2;}

public void kelimeyiGuncelle(Scanner input){
    System.out.println("Oyuna devam etmek istiyor musunuz?");
    String devam = input.nextLine();

    if (devam.equalsIgnoreCase("evet")){
        System.out.println("Bir kelime giriniz");
        String k = input.nextLine();
        System.out.println("Girdiğiniz kelimeyi stringin başına  eklemek isterseniz b sonuna eklemek isterseniz s yazınız");
        String başSon =input.nextLine();
        if (başSon.equalsIgnoreCase("b")){
            kelime =  k+ " " + kelime ;
        } else if (başSon.equalsIgnoreCase("s")) {
            kelime = kelime + " " + k ;
        }

    } else if (devam.equalsIgnoreCase("hayır")) {
        oyunuBitir(player1.puan, player2.puan2);

    }
}

public void oyunuBitir(int pl1, int pl2){
    System.out.println("Oyun bitti" + " Puanlar "+ player1 + " Puanı : " + pl1 + player2 + " Puanı : "+ pl2);

}




}
