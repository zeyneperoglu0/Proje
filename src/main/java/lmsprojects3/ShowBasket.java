package lmsprojects3;

public class ShowBasket {

   public void showBasketMethod() {

       System.out.println("\n========== SEPET ==========");
       System.out.printf("%-5s %-25s %-10s %-10s %-10s\n",
               "KOD", "YEMEK", "FİYAT", "PORSİYON", "TOPLAM");

       System.out.println("----------------------------------------------------------");

       Order.basketList.forEach(item -> {
           double total = item.getPrice() * item.getPortion();
           System.out.printf("%-5d %-25s %-10.2f %-10.1f %-10.2f\n",
                   item.getCode(),
                   item.getName(),
                   item.getPrice(),
                   item.getPortion(),
                   total
           );
       });

       System.out.println("===========================================================");


   }}
