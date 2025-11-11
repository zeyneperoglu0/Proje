package lmsprojects;

public enum VehicleTypes {

    OTOMOBIL("Otomobil", 2000, 2500),
    KAMYON("Kamyon", 3000,3500 ),
    OTOBUS_TIP1("Otobüs1", 4000,4500),//18-30 koltuk
    OTOBUS_TIP2("Otobüs2", 5000,5500),//31+ koltuk
    MOTOSIKLET("Motosiklet", 1500,1750 );


   private String name;
   private int primHaziran;
   private int primAralık;

    VehicleTypes(String name, int primHaziran, int primAralık) {
        this.name = name;
        this.primHaziran = primHaziran;
        this.primAralık = primAralık;
    }

    public String getName() {
        return name;
    }

    public int getPrimHaziran() {
        return primHaziran;
    }

    public int getPrimAralık() {
        return primAralık;
    }
}