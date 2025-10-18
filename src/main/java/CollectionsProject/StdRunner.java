package CollectionsProject;

import java.util.Collections;

public class StdRunner {
    public static void main(String[] args) {

Student s = new Student();
s.isim();
 System.out.println(s.stdNames);


 Notes n = new Notes();
 n.stdNames = s.stdNames;
 n.list = s.list;
n.notlar();
 System.out.println(n.not);


        System.out.println("En yüksek not  : " +   Collections.max(n.not) ) ;





    }




}
