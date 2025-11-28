package eticaret;

import java.util.Locale;

public class Products {

  private Integer productId;
   private String name;
   private double price;
  Categories category ;

    public Products() {
    }

    public Products(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = Categories.valueOf(category.trim().toUpperCase(Locale.ROOT));
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
