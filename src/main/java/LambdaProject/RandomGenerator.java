package LambdaProject;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RandomGenerator {
    public static void random (){
        Supplier<Integer>rnd = ()->(int)(Math.random()*100)+1;
        int ran = rnd.get();;
        Predicate<Integer> even =x->x%2==0;

        if (even.test(ran)){
           Consumer<Integer> print = x-> System.out.println(x);
           print.accept(ran);
       }else {
            System.out.println("geçersiz");
        }




    }


}
