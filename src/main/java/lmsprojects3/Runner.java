package lmsprojects3;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
FoodList f = new FoodList();
f.foodListMethod();
        Menu.menu(input);

    }
}
