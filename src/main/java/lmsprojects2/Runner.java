package lmsprojects2;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
RegisteredAccounts r = new RegisteredAccounts();
r.addAccounts();

        Menu m =  new Menu();
        m.menu(input);









    }
}
