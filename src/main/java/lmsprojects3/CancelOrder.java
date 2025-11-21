package lmsprojects3;

import java.util.List;
import java.util.Scanner;

public class CancelOrder {


    public void cancelOrderMethod(Scanner input, List<PojoFood> basketList) {

        while (true) {
            boolean removed = false;
            ShowBasket s = new ShowBasket();
            s.showBasketMethod(basketList);
            PojoFood silinecek = null;

            System.out.println("İptal etmek istediğiniz ürünün kodunu giriniz " +
                    "\nAna menüye dönmek için 1'i tuşlayınız");

            int code = input.nextInt();
            input.nextLine();

            if (code <= 0) {
                System.out.println("Lütfen 0'dan büyük bir değer giriniz");
                continue;
            }
            if (code == 1) {
                Menu.menu(input, basketList);
                return;
            }
            for (PojoFood w : basketList) {
                if (w.getCode() == code) {
                    System.out.println("Kaç adet iptal etmek istediğinizi giriniz");

                    double adet = input.nextDouble();
                    input.nextLine();

                    if (adet <= 0) {
                        System.out.println("Lütfen 0'dan büyük bir değer giriniz");
                        continue;
                    }
                    if (w.getPortion() - adet > 0) {
                        w.setPortion(w.getPortion() - adet);
                        removed = true;
                        System.out.println(w.getName() + " ürününüzden " + adet + "adet iptal edilmiştir");
                        break;

                    }
                    if (w.getPortion() - adet == 0) {
                        silinecek = w;
                        removed = true;
                    }
                }
            }
            if (silinecek != null) {
                basketList.remove(silinecek);}

                if (!removed) {
                    System.out.println("Sepetinizde böyle bir ürün bulunmamaktadır");
                }




        }
    }


}

























