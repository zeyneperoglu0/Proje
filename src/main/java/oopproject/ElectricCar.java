package oopproject;

public class ElectricCar extends  Vehicle {

    int batteryCapacity;

    public ElectricCar(String brand, String model, int year, double basePrice ,int batteryCapacity ) {
        super(brand, model, year, basePrice);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public double calculatePrice() {
        double total = 0;

        if (batteryCapacity>100){
         return getBasePrice() + getBasePrice()*0.15;

      }else {
            return getBasePrice();
        }

          }


    @Override
    public void showInfo() {
        super.showInfo();
    }
}
