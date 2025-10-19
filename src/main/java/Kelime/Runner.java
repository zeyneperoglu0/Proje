package Kelime;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       Player p = new Player();

       p.getİsim(input);
       p.getİsim2(input);
       p.getPuan();

        Game g  = new Game();
        g.oyunuBaslat(input);
        g.kelimeyiDegerlendir(g.kelime,input);
        g.puanVerpl1();
        g.kelimeyiGuncelle(input);
        g.oyunuBitir(g.puanVerpl1(), g.puanVerpl2());















    }
}
