package sayıtahmin;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

Random rnd =new Random();
int a = rnd.nextInt(101);
    int maxAralik = 100;
    int kredi = 10;
    int tahminSayısı;
int tahminHakkı = 15;
boolean devam= true;

public void oyunuBaşlat(Scanner input){
    System.out.println(a);

  while (tahminHakkı>0 && devam == true) {

      System.out.println("Bir sayı tahmini yapınız");
      int tahmin = input.nextInt();
      input.nextLine();
      if (tahmin < a) {
          System.out.println("Yanlış tahmin daha büyük bir tahmin yapınız");
          tahminSayısı++;
          tahminHakkı--;

      } else if (tahmin > a) {
          System.out.println("Yanlış tahmin daha küçük bir tahmin yapınız");
          tahminSayısı++;
          tahminHakkı--;

      } else {
          System.out.println("Tebrikler doğru tahmin");
          tahminSayısı++;
         kredi();
          break;
      }

  }

  }

public void kredi(){
 if (tahminSayısı == 1){
     kredi= kredi + kredi*4;
     System.out.println("tebrikler x4 bonus kazandınız " + "kredi = " + kredi);
 } else if (tahminSayısı == 2) {
     kredi =kredi+ kredi*3;
     System.out.println("tebrikler x3 bonus kazandınız " +  "kredi = " + kredi  );
 } else if (tahminSayısı == 3) {
     kredi = kredi + kredi*2;
     System.out.println("tebrikler x2 bonus kazandınız " +  "kredi = " + kredi   );
 }else {

 }

}

public boolean devamMı(Scanner input){
    System.out.println("Oyuna devam etmek istiyor musunuz?");
    String d = input.nextLine();

   if ( d.equalsIgnoreCase("evet")) {

    return devam = true;

    }else if (d.equalsIgnoreCase("hayır")){
       System.out.println("Oyun bitiriliyor");
       tahminHakkı = 0;

       return devam = false;
    }   return devam;}


//public void bittiMi(Scanner input){
//    System.out.println("Oyun bitti!");
//    System.out.println("Toplam tahmin sayısı: " + tahminSayısı);
//    System.out.println("Kalan tahmin hakkınız: " + tahminHakkı);



public void seviye(Scanner input){
    System.out.println("Yeni oyuna başlamak ister misiniz?");
    String seviye = input.nextLine();
    if (seviye.equalsIgnoreCase("evet")){
maxAralik*=2;
      a= rnd.nextInt(maxAralik +1);

        tahminSayısı = 0;
        tahminHakkı = 15;


    } else if (seviye.equalsIgnoreCase("hayır")) {
        a= rnd.nextInt(101);
        System.out.println("Oyuna tekrar başlamak için lütfen tekrar runlayın");
    }
}





















}
