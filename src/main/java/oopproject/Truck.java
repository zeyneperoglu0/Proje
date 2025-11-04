package oopproject;

public class Truck extends Vehicle {

 double capacity ;

    public Truck(String brand, String model, int year, double basePrice , double capacity) {
        super(brand, model, year, basePrice);
        this.capacity = capacity;
    }





    @Override
    public double calculatePrice() {

        return getBasePrice()+ getBasePrice()*capacity*0.005;
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}
