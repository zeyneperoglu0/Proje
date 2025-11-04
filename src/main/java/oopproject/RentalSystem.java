package oopproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RentalSystem {
    public static void main(String[] args) {


        List<Vehicle> vehicles = new ArrayList<>();
        List<Customer> customers = new ArrayList<>();



    Truck truck = new Truck("Ford","F-Max",2022,100000.0,120);

    Car c = new Car("Tesla","3",2023,115000.0,true);
      ElectricCar electricCar = new ElectricCar("BYD", "Seal", 2023, 87000.0,100);
    vehicles.add(c);
vehicles.add(truck);
vehicles.add(electricCar);

for (Vehicle w : vehicles ){

    w.showInfo();
    System.out.println(w.calculatePrice());
}

Customer customer = new Customer("Ali Demir" , " A");
Customer customer2 = new Customer("Ayşe Kaya" , " B");
customers.add(customer);
customers.add(customer2);

        System.out.println("Müşteri ismi : " + customer.getName() + " Ehliyet Tipi : " +  customer.getLicenseType());
        System.out.println("Müşteri ismi : " +customer2.getName() + " Ehliyet Tipi : " + customer2.getLicenseType());
        System.out.println("Müşteri Sayısı : " + customers.size());


        System.out.println("Kiralanabilecek Araçlar ve özellikleri " );

for (Vehicle w : vehicles){
    w.showInfo();}


System.out.println("Müşteriler ve Kiralanan araçlar ");
     int sayaç =0;
        for (Customer k : customers ){
            System.out.println(k.getName() + "(" + k.getLicenseType() + " tipi ehliyet)");
            System.out.println("Kiralanan araç :  ");
          sayaç++;

          if (sayaç==1){

               c.showInfo();

              System.out.println("Toplam fiyat : " + c.calculatePrice() );

            System.out.println( " TL");

          }else if (sayaç==2){

               truck.showInfo();



              System.out.println("Toplam fiyat : " + truck.calculatePrice() );

           }
           
            System.out.println("Total gelir " + c.calculatePrice() + truck.calculatePrice() );
        }












    }
}
