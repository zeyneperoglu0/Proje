package LambdaProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionChain {





    public static void funcChain(List<Integer> nums){
        Function<Integer,Integer>first = x->x*x*2;
        Function<Integer,String>sec = String::valueOf;
        nums.stream().map(first).map(sec).forEach(System.out::println);
    }
}
