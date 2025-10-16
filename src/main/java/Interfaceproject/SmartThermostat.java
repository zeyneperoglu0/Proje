package Interfaceproject;

import java.util.Scanner;

public interface SmartThermostat {

double setTemprature(Scanner input);

default void ecoMode(){
    System.out.println("Eko mod aktif");
}








}
