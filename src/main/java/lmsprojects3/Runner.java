package lmsprojects3;

import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

       Order o = new Order();
        Scanner input = new Scanner(System.in);
FoodList f = new FoodList();
f.foodListMethod();
        Menu.menu(input,o.basketList);

    }
}
