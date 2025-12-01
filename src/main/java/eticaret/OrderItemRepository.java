package eticaret;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderItemRepository {


  public void createTable (){

 JdbcUtils.setConnection();
 JdbcUtils.setStatement();

      try {
          JdbcUtils.statement.executeUpdate("CREATE TABLE IF NOT EXISTS t_order_item (id SERIAL," +
                  "order_id INTEGER  REFERENCES t_orders (id) ," +
                  "product_id INTEGER  REFERENCES t_products (id)," +
                  "quantity INTEGER," +
                  "price_item REAL " +
                  " ) ");
      } catch (SQLException e) {
          System.out.println(e.getMessage());
      }finally {
          try {
              JdbcUtils.connection.close();
              JdbcUtils.statement.close();
          } catch (SQLException e) {
              System.out.println(e.getMessage());
          }

      }


  }


public void saveItem(OrderItem item ){
      JdbcUtils.setConnection();
      JdbcUtils.setPrst("INSERT INTO t_order_item (order_id , product_id,quantity, price_item)  VALUES (?,?,?,?)");

    try {
        JdbcUtils.prst.setInt(1,item.getOrderId());
        JdbcUtils.prst.setInt(2,item.getProductId());
        JdbcUtils.prst.setInt(3,item.getQuantity());
        JdbcUtils.prst.setDouble(4,item.getPriceItem());
        JdbcUtils.prst.executeUpdate();


    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }finally {
        try {
            JdbcUtils.connection.close();
            JdbcUtils.prst.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }


}


public List<OrderItem> findItemsByOrderId(int orderId){

JdbcUtils.setConnection();
JdbcUtils.setPrst("SELECT * FROM t_order_item WHERE order_id = ?  ");
List<OrderItem> orderItemList = new ArrayList<>();
    OrderItem orderItem = null;
    try {
        JdbcUtils.prst.setInt(1,orderId);
        ResultSet rs = JdbcUtils.prst.executeQuery();

        while (rs.next()){
         orderItem = new OrderItem(rs.getInt("order_id"),
                 rs.getInt("product_id"),
                 rs.getInt("quantity"),
                 rs.getDouble("price_item"));
            orderItemList.add(orderItem);


        }


    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }finally {
        try {
            JdbcUtils.connection.close();
            JdbcUtils.prst.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }



return orderItemList; }










}
