package lmsprojects;

import java.util.Scanner;

public class Bus1 implements CalculatePrim{


    @Override
    public void CalPrim(Scanner input) {

        while (true) {


            System.out.println(VehicleTypes.OTOBUS_TIP1.getName() + " hangi dönem primini hesaplamak istiyorsunuz?" +
                    "\n1- 1. dönem(Aralık)" +
                    "\n2- 2.dönem(Haziran)" +
                    "\nAna menüye dönmek için 0(sıfır)'a basınız");

            int dönem = input.nextInt();
            input.nextLine();
            if (dönem == 1) {
                System.out.println(VehicleTypes.OTOBUS_TIP1.getName() +" Prim miktarı " +VehicleTypes.OTOBUS_TIP1.getPrimAralık());

            } else if (dönem == 2) {
                System.out.println(VehicleTypes.OTOBUS_TIP1.getName() +" Prim miktarı " +VehicleTypes.OTOBUS_TIP1.getPrimHaziran());
            } else if (dönem == 0) {
                MainMenu m = new MainMenu();
                m.menu(input);

            } else {
                System.out.println("Yanlış bir seçim yaptınız lütfen tekrar deneyiniz");
                continue;
            }


        }


    }




}
