package ıteratorsenumlambdamix;

import java.util.Scanner;

/*🔹 1️⃣ Enum Oluştur
Bir enum oluştur (CoffeeType)
Her kahve türü için:
İsim (örneğin "Latte")
Fiyat (örneğin 55.0)
Stok adedi (örneğin 10)
bilgilerini tutsun.
Enum içinde:
getCoffeeName()
getPrice()
getStock()
methodları olsun.
Ayrıca reduceStock() adında stoktan 1 düşüren bir method ekle.*/
public enum CoffeeType {


LATTE("Latte", 150,40),
    AMERICANO("Americano",100,45),
    FILTER_COFFEE("Filter Coffee",110,35),
    CAPPUCCINO("Cappuccino",170,89),
    MOCHA("Mocha",200,120);

private final String   kahveAdı;
private final int price ;
private final int stock;

    CoffeeType(String kahveAdı, int price, int stock) {
        this.kahveAdı = kahveAdı;
        this.price = price;
        this.stock = stock;
    }


    public String getKahveAdı() {
        return kahveAdı;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

public void reduceStocks(Scanner input ){
       String a =input.nextLine();
        if (a.equalsIgnoreCase("evet"))

            System.out.println(stock-1 );

}


}
