package CollectionsProject;



import java.util.Set;
import java.util.TreeSet;

public class Notes extends Student {



    Set<Byte> not = new TreeSet<>();

       public void  notlar (){
        byte sayaç = 0;


            for (int i = 0; i < stdNames.size() ; i++) {


            System.out.println(list.get(i) + " kişisinin notunu giriniz" );
           Byte notes = input.nextByte();
            not.add(notes);
            sayaç++;


        }

       }

























    }






























