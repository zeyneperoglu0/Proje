package lmsprojects3;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {

   List<PojoFood> basketList = new ArrayList<>();





    public  void categoryMethod(Scanner input) {
while (true) {
    System.out.println("Hangi kategoriden sipariş vereceksiniz?" +
            "\n(Lütfen yanlarında yazan sayıyı giriniz)");
    System.out.println("1-" + Categories.MAIN.name() +
            "\n2-" + Categories.APPETIZER.name() +
            "\n3-" + Categories.DESSERT.name() +
            "\n4-" + Categories.DRINK.name()+
            "\nAna menüye dönmek için 5'e basınız+" +
            "\nSepet bilgileri için 6'ya basınız");

    int category = input.nextInt();
    input.nextLine();

    switch (category) {
        case 1 -> {
            FoodList.foodList.stream().filter(t -> t.getCategories() == Categories.MAIN).forEach(System.out::println);
            orderInfo(input,basketList);
        }
        case 2 -> {
            FoodList.foodList.stream().filter(t -> t.getCategories() == Categories.APPETIZER).forEach(System.out::println);
            orderInfo(input,basketList);
        }
        case 3 -> {
            FoodList.foodList.stream().filter(t -> t.getCategories() == Categories.DESSERT).forEach(System.out::println);
            orderInfo(input,basketList);
        }
        case 4 -> {
            FoodList.foodList.stream().filter(t -> t.getCategories() == Categories.DRINK).forEach(System.out::println);
            orderInfo(input,basketList);
        }
        case 5 ->{
            Menu.menu(input,basketList);
        }
        case 6 ->{
         orderInfo(input,basketList);
        }
        default -> System.out.println("Lütfen listedeki numaralar dışında bir değer girmeyiniz");

    }

//menüye dönsün ek sipariş yapabilsin
}


    }



 public  void orderInfo(Scanner input,   List<PojoFood> basketList) {


     while (true) {
         ShowBasket showBasket = new ShowBasket();

         boolean found = false;

         System.out.println("Lütfen sipariş vermek istediğiniz yiyeceğin kodunu giriniz" +
                 "\nAna menüye dönmek için q'ya basınız");
         String select = input.nextLine();

         if (select.equalsIgnoreCase("q")) {

             Menu.menu(input,basketList);
             return;
         }
         for (PojoFood w : FoodList.foodList) {

                 if (String.valueOf(w.getCode()).equalsIgnoreCase(select)) {
                     System.out.println("Kaç porsiyon istediğinizi giriniz");
                     double portion = input.nextDouble();
                     input.nextLine();
                     found=true;
                     boolean merged = false;


                     for (PojoFood item : basketList) {


                         if (item.getCode() == w.getCode()){


                          item.setPortion(item.getPortion()+portion);
                            merged =true;
                             showBasket.showBasketMethod(basketList);
                         }



                     }
                     if (!merged) {

                         basketList.add(new PojoFood(w.getCode(), w.getName(), w.getPrice(), portion, w.getCategories()));
                         showBasket.showBasketMethod(basketList);
                     }

                 }

                 } if (!found){

            System.out.println("Lütfen geçerli bir yiyecek kodu giriniz");

       }



         }
     }



public  static void totalCost(   List<PojoFood> basketList) {
double sum=0;

for (PojoFood w : basketList) {

    sum =  sum  +  w.getPrice()*w.getPortion();

}
    System.out.println("Toplam tutar = " + sum);




}






}
