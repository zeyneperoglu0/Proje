package Interfaceproject;

import java.util.Scanner;

public class SmartHomeRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LivingRoomLight l = new LivingRoomLight();

        System.out.println("Işıkları açmak için o tuşuna  basınız ");
        String ışık = input.nextLine();

        if (ışık.equalsIgnoreCase("o")) {
            l.turnOn();
            l.setBrigthness(input);
            l.color(input);
            l.status(input);


        }

BedroomThermostat b = new BedroomThermostat();
        b.turnOn();

 System.out.println("Eko moda geçmek için e tuşuna basınız eko moda geçmek istemiyorsanız c tuşuna basınız");
String eko = input.nextLine();
if (eko.equalsIgnoreCase("e")) {
    b.ecoMode();
}else if (eko.equalsIgnoreCase("c")){
    System.out.println("Eko mod aktif değil");

}else{
    System.out.println("Geçersiz bir tuşlama yaptınız");
}

b.setTemprature(input);
b.status(input);
























    }}
