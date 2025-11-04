package oopproject;

public class CarRentalSystem {

    /*🚗 Görev: “Araç Kiralama Sistemi”

(OOP’nin tamamını kapsar)

🎯 Amaç:

Bir araç kiralama şirketi için basit bir sistem oluştur.
Sistemde hem binek arabalar hem de ticari araçlar olacak.
Her araç tipi, bazı ortak özellikleri miras alacak ama kendine özgü davranışları da olacak.

🧩 Kullanılacak OOP Prensipleri:
OOP Kavramı	Nerede Kullanacaksın
Encapsulation	Araç bilgilerini private yap, getter-setter kullan
Inheritance	Car sınıfı → ElectricCar, Truck, SportCar gibi alt sınıflar türet
Polymorphism	Tüm araçlarda calculatePrice() metodunu override et
Abstraction	Vehicle adında abstract class oluştur, gövdesiz metotları alt sınıflar doldursun
Composition (Has-A)	Her aracın bir Customer (müşteri) nesnesi olsun
Static / Final	Fiyat hesaplamasında sabit veriler için final sabitler kullan
Constructor	Her araç nesnesi oluşturulurken gerekli bilgileri constructor’dan al
🔧 Sistem Detayları:
1️⃣ Abstract Class → Vehicle

Ortak alanlar:

private String brand;
private String model;
private int year;
private double basePrice;


Ortak methodlar:

public abstract double calculatePrice();

public void showInfo() → tüm araçların temel bilgilerini yazdırır

2️⃣ Alt sınıflar:
🚙 Car (extends Vehicle)

Ek alan: boolean isAutomatic

calculatePrice() → Eğer otomatikse fiyat %10 artsın

🚚 Truck (extends Vehicle)

Ek alan: double capacity (ton cinsinden)

calculatePrice() → kapasiteye göre fiyat +%5 artar

⚡ ElectricCar (extends Car)

Ek alan: int batteryCapacity

calculatePrice() → pil kapasitesi 100 kWh üzerindeyse fiyat %15 artsın

3️⃣ Customer Sınıfı

Encapsulation örneği:

private String name;

private String licenseType;

Getter / Setter kullan

4️⃣ RentalSystem (ana class)

Burada:

Müşteriler oluşturulacak

Araçlar oluşturulacak

Polymorphism örneğiyle Vehicle listesi tutulacak

for-each döngüsü ile her aracın calculatePrice() metodu çağrılacak

🔍 Örnek çıktı:
Araç: Tesla Model 3 (2023)
Fiyat: 115000.0 TL
Müşteri: Ali Demir
------------------------
Araç: Ford F-Max (2022)
Fiyat: 87000.0 TL
Müşteri: Ayşe Kaya
------------------------
Toplam Araç Sayısı: 2

🚀 Task Özeti

Sınıflar:

Vehicle → abstract class

Car, Truck, ElectricCar → alt sınıflar

Customer → kapsülleme örneği

RentalSystem → main (nesneleri oluştur, polymorphism uygula)

Zorunlu Kullanılacak Yapılar:

constructor

extends

abstract & override

private + getter/setter

ArrayList<Vehicle> (polymorphism)

final sabit (örneğin vergi oranı)*/











}
