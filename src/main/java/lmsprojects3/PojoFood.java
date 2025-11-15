package lmsprojects3;

import java.util.ArrayList;
import java.util.List;

public class PojoFood {

//    2- Restauranttaki yiyecekler bir listede tutulsun.
//    Yiyeceklerin kodu, ismi ve ücreti olsun.

    private int code;
    private String name ;
    private double price;
    private double portion;
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

    public double getPrice() {
        return price;
    }

    public static int getCount() {
        return count;
    }


    public double getPortion() {
        return portion;
    }





    @Override
    public String toString() {
        return code + " - " + name + " (" + price + " TL)";
    }

}





