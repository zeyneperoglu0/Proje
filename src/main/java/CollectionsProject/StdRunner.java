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
        Integer max = Collections.max(n.notList);
        int index = n.notList.indexOf(max);
        String enBasarili = n.list.get(index);


        System.out.println("En yüksek not: " + max + " (" + enBasarili + ")");





    }




}
