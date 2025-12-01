package eticaret;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class orderRepository implements Repository <Order,Integer>{


    public void createTable() {

        JdbcUtils.setConnection();
        JdbcUtils.setStatement();

        try {
            JdbcUtils.statement.executeUpdate("CREATE TABLE IF NOT EXISTS t_orders (" +
                    "id SERIAL PRIMARY KEY ," +
                    "customer_id INTEGER NOT NULL," +
                    "order_date TIMESTAMP NOT NULL," +
                    "total_price REAL NOT NULL)");


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                JdbcUtils.connection.close();
                JdbcUtils.statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }


    }



    public int save(Order order) {


        JdbcUtils.setConnection();
        JdbcUtils.setPrst("INSERT INTO t_orders (customer_id,order_date,total_price) VALUES (?,?,?) RETURNING id ");
        int orderId=-1;
        try {
            JdbcUtils.prst.setInt(1, order.getCustomerId());
            JdbcUtils.prst.setObject(2, order.getOrderDate());
            JdbcUtils.prst.setDouble(3, order.getTotalPrice());
            JdbcUtils.prst.executeUpdate();
            ResultSet rs = JdbcUtils.prst.executeQuery();
            if (rs.next()) {
                 orderId = rs.getInt("id");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                JdbcUtils.connection.close();
                JdbcUtils.prst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }


        return orderId;
    }


    @Override
    public List<Order> findAll() {


        JdbcUtils.setConnection();
        JdbcUtils.setStatement();
        List<Order> orderItemList = new ArrayList<>();
        try {

            ResultSet rs = JdbcUtils.statement.executeQuery("SELECT * FROM t_orders");

            while (rs.next()) {
                Order order = new Order(
                        rs.getInt("customer_id"),
                        rs.getDouble("total_price"),
                        (LocalDateTime) rs.getObject("order_date")
                );
                orderItemList.add(order);
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }finally {
            try {
                JdbcUtils.connection.close();
                JdbcUtils.statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return orderItemList;

    }


    @Override
    public void update(Order entity, Integer id) {

     JdbcUtils.setConnection();
     JdbcUtils.setPrst("UPDATE t_orders SET customer_id=?,order_date=? , total_price=? WHERE id = ?  ");

        try {
            JdbcUtils.prst.setInt(1,entity.getCustomerId());
            JdbcUtils.prst.setObject(2,entity.getOrderDate());
            JdbcUtils.prst.setDouble(3,entity.getTotalPrice());
            JdbcUtils.prst.setInt(4,id);
            int update = JdbcUtils.prst.executeUpdate();
            if (update>0){
                System.out.println("güncelleme işlemi başarılı");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                JdbcUtils.connection.close();
                JdbcUtils.statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }



    }



    @Override
    public Order findById(Integer id) {
     JdbcUtils.setConnection();
     JdbcUtils.setPrst("SELECT * FROM t_orders WHERE id = ? ");
        Order order =  null;

        try {
            JdbcUtils.prst.setInt(1,id);
            ResultSet rs =  JdbcUtils.prst.executeQuery();
            if (rs.next()){
                order = new Order(
                        rs.getInt("customer_id"),
                        rs.getDouble("price"),
                        (LocalDateTime) rs.getObject("order_date")
                );
                order.setId(rs.getInt("id"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                JdbcUtils.connection.close();
                JdbcUtils.prst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }




  return order;  }



    @Override
    public void deleteById(Integer id) {
        JdbcUtils.setConnection();
        JdbcUtils.setPrst("DELETE FROM t_orders WHERE id =?");

        try {
            JdbcUtils.prst.setInt(1,id);
            int deleted = JdbcUtils.prst.executeUpdate();
            if (deleted>0){
                System.out.println("silme işlemi başarılı");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                JdbcUtils.connection.close();
                JdbcUtils.prst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }


    }


}