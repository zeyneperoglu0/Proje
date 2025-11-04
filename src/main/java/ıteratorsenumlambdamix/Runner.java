package ıteratorsenumlambdamix;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
 Menu m = new Menu();
 m.whichCoffee(input);
  Iterators ı = new Iterators();

        System.out.println("Stok durumunu görmek ister misiniz?");
        String evtHyr = input.nextLine();
        if (evtHyr.equalsIgnoreCase("evet")){
            ı.printStocks();
            ı.lessThan();
        }else {
            System.out.println("iyi günler dilerim :)");
        }













    }
}
