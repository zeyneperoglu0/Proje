package Interfaceproject;

import java.util.Scanner;

public interface Device {

    void turnOn();
    void turnOff();

    default void status(Scanner input){
        System.out.println("Işıklar kapalı");
    }















}
