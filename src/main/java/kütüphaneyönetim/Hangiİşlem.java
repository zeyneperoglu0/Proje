package kütüphaneyönetim;

import java.util.Scanner;

public class Hangiİşlem {
int num ;






    public int whichProccess(Scanner input ){
        System.out.println("Hangi işlemi yapmak istersiniz? \n" +



                "1- Kitap ödünç alma\n" +
                "2-Kitap iadesi\n" +
                "3- Kitap bağışı\n" +
                "Lütfen yapmak istediğiniz işlemin numarasını giriniz");

         num = input.nextInt();


        return num;
    }



}
//kitabı ödünç almak istiyor musunuz metodu onaylarsa date ver ve boolean kısmını true yap