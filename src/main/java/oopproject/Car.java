package oopproject;

public class Car extends Vehicle{

boolean isAutomatic;


    public Car(String brand, String model, int year, double basePrice, boolean isAutomatic) {
        super(brand, model, year, basePrice);
        this.isAutomatic = isAutomatic;
    }


    @Override
    public double calculatePrice() {

        if (isAutomatic) {

        } else {
return  getBasePrice();
        }
    return  getBasePrice() + getBasePrice() * 0.1; }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}
