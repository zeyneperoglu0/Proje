package oopproject;

public class Customer {

  private String name ;
  private  String licenseType ;

    public Customer(String name, String licenseType) {
        this.name = name;
        this.licenseType = licenseType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }
}
