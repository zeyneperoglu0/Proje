package LambdaProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,6,7,5,7,8,4,7,8,5,-1,0));
   NumberProcessor.evenNumbers(nums);
        NumberProcessor.positiveNumbers(nums);
        NumberProcessor.squareNumbers(nums);
        NumberProcessor.sumNumbers(nums);
        NumberProcessor.max(nums);
        NumberProcessor.yedidenBüyükEnKÇ(nums);

        List<String> names = new ArrayList<>(Arrays.asList("Zeynep","Ali","Veli","Fatma","Ayşe","Ali","Kerem","Emir"));
        WordProcessor.alphabeticOrder(names);
        WordProcessor.convertTo(names);
        WordProcessor.distinctStr(names);
        WordProcessor.longerThanFive(names);
        WordProcessor.notStartsWithE(names);

      RandomGenerator.random();
        FunctionChain.funcChain(nums);




    }
}
