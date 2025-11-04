package ıteratorsenumlambdamix;

import java.util.Scanner;

public class Menu {


    public void whichCoffee(Scanner input) {

        while (true) {
            boolean bul = false;
            System.out.println("istediğiniz kahveyi seçiniz (menüden çıkmak için q 'ya basınız)+\n 0000" +
                    " LATTE\n" +
                    "AMERICANO\n" +
                    "FILTER_COFFEE\n" +
                    "CAPPUCCINO\n" +
                    "MOCHA ");
            String kullanıcıKahveGirişi = input.nextLine();

if (kullanıcıKahveGirişi.equalsIgnoreCase("q")){
    break;
}
            CoffeeType[] coffee = CoffeeType.values();

            for (CoffeeType w : coffee) {

                if (kullanıcıKahveGirişi.equalsIgnoreCase(w.getKahveAdı())) {
                    bul = true;
                    System.out.println("Kahve : " + w.getKahveAdı() + " stok durumu : " + w.getStock() + " fiyatı :  " + w.getPrice());
                    break;}

                if (w.getStock()==0){
                        System.out.println("Bu kahve tükendi");
                        bul=true;
                        break;

                    }

            }if (bul){
                break;
            } if (!bul){

                    try {
                        throw new IllegalArgumentException("böyle bir kahve yok ");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Lütfen başka bir kahve adı giriniz");

                    }
                }


        }
    }


















}







