package lmsprojects;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainMenu {







  public void menu(Scanner input){

while (true){
      System.out.println("Prim hesaplama sistemine Hoşgeldiniz. Lütfen araç tipinizi seçiniz (Çıkmak için q'yabasınız)" +
              "\n-" +VehicleTypes.OTOMOBIL.getName()+
              "\n-" +VehicleTypes.KAMYON.getName()+
              "\n-" +VehicleTypes.OTOBUS_TIP1.getName()+
              "\n-" +VehicleTypes.OTOBUS_TIP2.getName()+
              "\n-"+VehicleTypes.MOTOSIKLET.getName());
      String seç = input.nextLine();




  if (seç.equalsIgnoreCase(VehicleTypes.OTOMOBIL.getName())){
      AutoMobile a = new AutoMobile();
      a.CalPrim(input);

  } else if (seç.equalsIgnoreCase(VehicleTypes.KAMYON.getName())) {
      Lorry l = new Lorry();
      l.CalPrim(input);

  } else if (seç.equalsIgnoreCase(VehicleTypes.OTOBUS_TIP1.getName())) {
      Bus1 b1 = new Bus1();
      b1.CalPrim(input);

  }  else if (seç.equalsIgnoreCase(VehicleTypes.OTOBUS_TIP2.getName())) {
      Bus2 b2 = new Bus2();
      b2. CalPrim(input);

  }else if (seç.equalsIgnoreCase(VehicleTypes.MOTOSIKLET.getName())) {
      Motocycle m = new Motocycle();
      m.CalPrim(input);

  }else if (seç.equalsIgnoreCase("q")){
      System.out.println("Prim hesaplama sisteminden çıkılıyor iyi günler dileriz");
return;
  }else if (seç.isEmpty()){
     try {
         throw new NullPointerException("Seçim boş olamaz");
     }catch (NullPointerException e){
         System.out.println("Seçim boş olamaz lütfen tekrar deneyiniz");
     }

  }else{
      System.out.println("Yanlış bir seçim yaptınız lütfen tekrar deneyiniz");}

  }
  }

}













