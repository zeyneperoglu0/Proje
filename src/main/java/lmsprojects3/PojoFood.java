package lmsprojects3;

import java.util.ArrayList;
import java.util.List;

public class PojoFood {

//    2- Restauranttaki yiyecekler bir listede tutulsun.
//    Yiyeceklerin kodu, ismi ve ücreti olsun.

    private int code;
    private String name ;
    private static double price;
    private static double portion;
static int count =1000;
private  Categories categories;

public PojoFood(String name, double price,Categories categories) {
       this.code =count++;
        this.name = name;
        this.price = price;
        this.categories=categories;

    }

    public PojoFood(int code, String name, double price, double portion,Categories categories) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.portion = portion;
        this.categories=categories;

    }

    public  Categories getCategories() {
        return categories;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static double getPrice() {
        return price;
    }

    public static int getCount() {
        return count;
    }


    public static double getPortion() {
        return portion;
    }

    public static void setPortion(double portion) {
        PojoFood.portion = portion;
    }

    public static void setPrice(double price) {
        PojoFood.price = price;
    }

    @Override
    public String toString() {
        return code + " - " + name + " (" + price + " TL)";
    }

}





