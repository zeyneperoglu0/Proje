package LambdaProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class NumberProcessor {

/*

🔹 NumberProcessor
    Stream + Predicate + Function + Consumer ile sayılar üzerinde işlem:
    Pozitifleri filtrele
    Çifteri filtrele
    Kare al
    Max – Min
    Toplam – Çarpım
7’den büyük en küçük çift
    Tek sayıların karelerini yazdır
*/






public static void positiveNumbers(List<Integer> nums){
    Predicate<Integer> positives = x->x>0;
nums.stream().filter(positives).forEach(t-> System.out.println("positives = " + t));

}

public static void evenNumbers(List<Integer> nums){
    Predicate<Integer>evens = x->x%2==0;
nums.stream().filter(evens).forEach(t-> System.out.println("evens = " + t));
}

public static void squareNumbers(List<Integer> nums){
    Function<Integer,Integer> squares = x->x*x;


nums.stream().map(squares).forEach(t-> System.out.println("squares = " + t));

}


public static int sumNumbers(List<Integer> nums){
    return nums.stream().reduce(Integer::sum).get();

}

public static void max(List<Integer> nums){
    System.out.println(nums.stream().max(Comparator.naturalOrder()).get());

}


public static void yedidenBüyükEnKÇ(List<Integer> nums){
    System.out.println(nums.stream().filter(t -> t > 7 && t % 2 == 0).sorted().findFirst());

}




}
