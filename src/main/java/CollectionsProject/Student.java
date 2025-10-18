package CollectionsProject;

import java.util.*;

public class Student {

    LinkedHashSet<String> stdNames = new LinkedHashSet<>();
    ArrayList<String> list = new ArrayList<>(stdNames);

Scanner input = new Scanner(System.in);

public void isim (){
  int sayaç = 0 ;

while (sayaç<5){

        System.out.println("İsminizi giriniz");
        String n = input.nextLine();
stdNames.add(n);

        sayaç++;

    }
    list = new ArrayList<>(stdNames);
}






















    }










