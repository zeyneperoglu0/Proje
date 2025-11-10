package LambdaProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordProcessor {
  /*  WordProcessor

5’ten uzun kelimeler
    Benzersiz kelimeler
    Alfabetik sıralama
    Küçük harf – büyük harf dönüşüm
“E” ile başlamayan kelimeler*/



 public static void distinctStr(List<String> names){
     names.stream().distinct().forEach(t-> System.out.println("distinct = " + t));
 }
  public static void longerThanFive(List<String> names){
     names.stream().filter(t->t.length()>5).forEach(t-> System.out.println(t));
  }

   public static void alphabeticOrder (List<String> names){
     names.stream().sorted().forEach(t-> System.out.println("alph = " + t));
   }

    public static void convertTo(List<String> names){
     names.stream().map(t->t.toLowerCase()).forEach(t-> System.out.println("lower = " + t));
     names.stream().map(t->t.toUpperCase()).forEach(t-> System.out.println("upper = " + t));
    }

    public static void notStartsWithE(List<String> names){
     names.stream().filter(t->!t.startsWith("E")).forEach(t-> System.out.println("noE = " + t));
    }











}
