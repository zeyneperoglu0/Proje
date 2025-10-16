package Interfaceproject;

import java.util.Scanner;

public interface SmartLight {

  int setBrigthness(Scanner input);

  default  String color (Scanner input){

 return "Default renk";}











}
