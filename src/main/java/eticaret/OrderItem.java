package eticaret;

public class OrderItem {


private int id ;
private int orderId;
private int productId;
private int quantity;
private double priceItem;

    public OrderItem() {
    }

    public OrderItem(int orderId,int productId, int quantity, double priceItem) {
       this.orderId=orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.priceItem = priceItem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(double priceItem) {
        this.priceItem = priceItem;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", price=" + priceItem +
                '}';
    }
}
