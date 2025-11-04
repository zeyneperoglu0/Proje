package ıteratorsenumlambdamix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterators {


    CoffeeType[] allCoffees = CoffeeType.values();
     List<CoffeeType> coffeeTypesList = new ArrayList<>(Arrays.asList(allCoffees));
    Iterator<CoffeeType> coffeeTypeIterator = coffeeTypesList.listIterator();



    public void printStocks(){
    while (coffeeTypeIterator.hasNext()){
      CoffeeType Coffee = coffeeTypeIterator.next();
        if (Coffee.getStock()>0){
            System.out.println("stok durumu " +Coffee.getKahveAdı() + " " +Coffee.getStock() );

        }
    }
}


public void lessThan(){

   coffeeTypesList.stream().filter(t -> t.getStock() > 0 && t.getStock() < 50)
           .forEach(t-> System.out.println( "Stok durumu 50'nin altında olan kahveler " +      t.getKahveAdı() + " " + t.getStock() ));



}
















}