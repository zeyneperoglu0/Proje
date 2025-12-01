package eticaret;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class OrderService {



    private Scanner input = ProductController.inp;
private orderRepository repository = new orderRepository();
ProductRepository p = new ProductRepository();
OrderItemRepository o = new OrderItemRepository();
public void createTable (){
    repository.createTable();

}
    public void saveOrder (Order order){
        repository.save(order);
    }
public Order getOrderInfo(){

    System.out.println("Customer ID : " );
    int customerId = input.nextInt();
    input.nextLine();
    System.out.println("PRİCE : " );
    double price = input.nextDouble();
    input.nextLine();
    System.out.println("DATE : ");
    LocalDateTime dateTime = LocalDateTime.parse(input.nextLine());

    Order order = new Order(customerId,price,dateTime);

return order;}


public Order findOrderById(int id ){

 Order order = repository.findById(id);
 if (order==null){
     System.out.println("Girdiğiniz id'li bir sipariş bulunamadı");

 }

return order;}

    public void printAllOrders(){

        List <Order> orderList = repository.findAll();
        for (Order o : orderList){

            System.out.println("Customer id : "+o.getCustomerId());
            System.out.println("Total price : "+o.getTotalPrice());
            System.out.println("Order Date : "+o.getOrderDate());

        }



    }

public void printOrderById (int id ){
    Order order = findOrderById(id);

    if (order != null){
        System.out.println(order);
    }





}


public void updateOrder (int id){

Order order = findOrderById(id)  ;

if (order!=null){

 Order newOrder = getOrderInfo();
 repository.update(newOrder,id);
}



}


public void deleteOrder (int id){
   Order order =  findOrderById(id);
if (order!= null) {

    repository.deleteById(id);

}
}


public void createOrder (){

    System.out.println("Müşteri id'sini giriniz ");
   Integer customerID=input.nextInt();
           input.nextLine();
    Order order =  new Order(customerID,0 ,LocalDateTime.now());
 int orderId = repository.save(order);
while (true) {
    System.out.println("Ürün ID giriniz :" +
            "\n çıkmak için 0'a basınız ");

int productId= input.nextInt();
if (productId==0){
    break;
}
input.nextLine();
    System.out.println("Almak istediğiiz ürünün miktarını giriniz (adet)");
    int quantity = input.nextInt();
    input.nextLine();

    Products products = p.findById(productId);

 Double totalPrice =    products.getPrice() * quantity;

OrderItem orderItem =  new OrderItem(orderId,productId,quantity,totalPrice);
o.saveItem(orderItem);







}
}













}
