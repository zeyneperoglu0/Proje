package Interfaceproject;

import java.util.Scanner;

public class LivingRoomLight implements Device,SmartLight{

    @Override
    public void turnOn() {
        System.out.println("Işıklar Açılıyor");
    }

    @Override
    public void turnOff() {
        System.out.println("Işıklar kapatılıyor");
    }

    @Override
    public void status(Scanner input) {
        System.out.println("Işıklar açık");
        System.out.println("Işıkları kapatmak için c tuşuna basınız");
        String close = input.nextLine();

        if (close.equalsIgnoreCase("c")) {
            this.turnOff();
            Device.super.status(input);
        }else {
            System.out.println("Geçersiz bir tuşlama yaptınız");
        }


    }
    @Override
    public int setBrigthness(Scanner input) {

        int level =0;
        while (true){
            System.out.println("Işık seviyesini ayarlayınız 1-100");
           level = input.nextInt();
            input.nextLine();
            if (level > 0 && level <101) {
                System.out.println("ışık " + level + " seviyesinde ayarlanıyor");
                break;

            }else { System.out.println("Lütfen 1 ile 100 arasında bir değer giriniz");
            continue;}


           }
        return level;   }


    @Override
    public String color(Scanner input) {

        System.out.println("Hangi rengi ayarlamak istersiniz? \n kırmızı \nmavi\nsarı\nturuncu\nbeyaz");
String color = input.nextLine();
        System.out.println(color +" Işık açılıyor");
            return color;
        }

    }
