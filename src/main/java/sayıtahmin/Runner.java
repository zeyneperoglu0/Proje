package sayıtahmin;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);


 SayiTahminOyunu s =  new SayiTahminOyunu( );
 s.oyunuBaşlat(input);
        s.kredi();
    s.devamMı(input);
//    s.bittiMi(input);

s.seviye(input);










}  }
