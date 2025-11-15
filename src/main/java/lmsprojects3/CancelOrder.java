package lmsprojects3;

import java.util.Scanner;

public class CancelOrder {


    public void cancelOrderMethod(Scanner input){

       while (true) {

           ShowBasket s = new ShowBasket();
           s.showBasketMethod();


           System.out.println("İptal etmek istediğiniz ürünün kodunu giriniz " +
                   "\nAna menüye dönmek için 1'i tuşlayınız");

           int code = input.nextInt();
           input.nextLine();

           if (code==1){
               Menu.menu(input);
               return;
           }

           boolean removed = Order.basketList.removeIf(w -> w.getCode() == code);


       if (!removed){
               System.out.println("Sepetinizde böyle bir ürün bulunmamaktadır");
           }


       }
    }
    }





























