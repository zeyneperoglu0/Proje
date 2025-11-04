package oopproject;

public abstract class Vehicle {

  private String brand ;
  private String model ;
   private int year;
   private double basePrice;

    public Vehicle(String brand, String model, int year, double basePrice) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public abstract double calculatePrice();


    public  void showInfo(){
        System.out.println(" marka : " + brand + " model : " + model + " yıl  : " + year + "  Taban fiyat : " + basePrice);


 }





















}
