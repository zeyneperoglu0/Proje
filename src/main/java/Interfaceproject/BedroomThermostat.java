package Interfaceproject;

import java.util.Scanner;

public class BedroomThermostat implements SmartThermostat,Device{

    @Override
    public void turnOn() {
        System.out.println("Termostat açılıyor");
    }
    @Override
    public void turnOff() {
        System.out.println("Termostat kapatılıyor");
    }

    @Override
    public void status(Scanner input) {
        System.out.println("Termostat açık");

        System.out.println("Termostatı kapatmak için c tuşuna basınız");
        String cl = input.nextLine();
        if (cl.equalsIgnoreCase("c")) {
       this.turnOff();
        Device.super.status(input);
        }else {
            System.out.println("Geçersiz bir tuşlama yaptınız");
        }

    }



    @Override
    public double setTemprature(Scanner input) {
        double temp = 0;
        while (true) {
            System.out.println("Lütfen dereceyi ayarlayınz 16 - 28 ");
           temp = input.nextDouble();
           input.nextLine();

            if (temp > 15 && temp < 29) {
                System.out.println(temp + " Derece ayarlanıyor");
                break;
            } else {
                System.out.println("16 ile 28 arasında bir değer giriniz");
                continue;
            }



         }      return temp ;}

    @Override
    public void ecoMode() {



        SmartThermostat.super.ecoMode();
    }
}

