package lmsprojects;

import java.util.Scanner;

public class AutoMobile implements CalculatePrim {


    @Override
    public void CalPrim(Scanner input) {





        while (true) {


            System.out.println("Otomobilinizin hangi dönem primini hesaplamak istiyorsunuz?" +
                    "\n1- 1. dönem(Aralık)" +
                    "\n2- 2.dönem(Haziran)" +
                    "\nAna menüye dönmek için 0(sıfır)'a basınız");

            int dönem = input.nextInt();
            input.nextLine();
           if (dönem==1){
               System.out.println(VehicleTypes.OTOMOBIL.getName() +" Prim miktarı " + VehicleTypes.OTOMOBIL.getPrimAralık());

           } else if (dönem==2) {

               System.out.println(VehicleTypes.OTOMOBIL.getName() +" Prim miktarı " +VehicleTypes.OTOMOBIL.getPrimHaziran());

           }else if(dönem ==0) {
               MainMenu m = new MainMenu();
               m.menu(input);
               return;

           } else {
               System.out.println("Yanlış bir seçim yaptınız lütfen tekrar deneyiniz");
               continue;
           }


        }







    }}