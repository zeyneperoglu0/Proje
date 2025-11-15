package lmsprojects3;

import java.util.Scanner;

public class Menu {


    public static void menu(Scanner input) {
        Order order = new Order();
        CancelOrder c = new CancelOrder();
        lmsprojects2.Menu n = new lmsprojects2.Menu();
        ShowBasket s = new ShowBasket();
        while (true) {
            System.out.println("GNSANDROSE Restaurant Uygulamasına Hoşgeldiniz");
            System.out.println("Hangi işlemi yapmak istersiniz?" +
                    "\n1-Sipariş oluşturma" +
                    "\n2-Sipariş iptali" +
                    "\n3-Hesap oluşturma" +
                    "\n4-Sepete git" +
                    "\n5-Çıkış"
            );
            int işlem = input.nextInt();
            input.nextLine();
            switch (işlem) {
                case 1 -> order.categoryMethod(input);
                case 2 -> c.cancelOrderMethod(input);
                case 3 -> n.menu(input);
                case 4 ->s.showBasketMethod();
                case 5 ->  {
                  System.out.println("İşlem sonlandırılıyor...");
                System.exit(0);
              }

                default -> System.out.println("Lütfen geçerli bir numara giriniz ");
            }

        }
    }
}