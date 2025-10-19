package CollectionsProject;



import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Notes extends Student {



    Set<Integer> not = new TreeSet<>();
    ArrayList<Integer> notList  =new ArrayList<>(not);


       public void  notlar (){
        byte sayaç = 0;


            for (int i = 0; i < stdNames.size() ; i++) {


            System.out.println(list.get(i) + " kişisinin notunu giriniz" );
           Integer notes = input.nextInt();
            not.add(notes);
            sayaç++;


        }
notList = new ArrayList<>(not);
       }

























    }






























