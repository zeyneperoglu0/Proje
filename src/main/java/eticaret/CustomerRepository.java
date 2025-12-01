package eticaret;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements Repository<Customer, Integer> {

    //tablo oluşturma
    @Override
    public void createTable() {

        JdbcUtils.setConnection();
        JdbcUtils.setStatement();

        try {
            JdbcUtils.statement.execute("CREATE TABLE IF NOT EXISTS t_customer (" +
                    "id SERIAL PRIMARY KEY ," +
                    "name VARCHAR(100) UNIQUE NOT NULL," +
                    "email VARCHAR(100)UNIQUE NOT NULL," +
                    "phone VARCHAR(11) UNIQUE NOT NULL)");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {

            try {
                JdbcUtils.connection.close();
                JdbcUtils.statement.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }


        }


    }

    //insertler
    @Override
    public int save(Customer entity) {

        JdbcUtils.setConnection();
        JdbcUtils.setPrst("INSERT INTO t_customer (name,email,phone) VALUES (?,?,?)");

        try {
            JdbcUtils.prst.setString(1, entity.getName());
            JdbcUtils.prst.setString(2, entity.getEmail());
            JdbcUtils.prst.setString(3, entity.getPhone());
            int inserted = JdbcUtils.prst.executeUpdate();
            if (inserted > 0) {
                System.out.println("Tabloya başarıyla eklediniz");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {

            try {
                JdbcUtils.connection.close();
                JdbcUtils.prst.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }


        }


        return 0;
    }

    //listeye ekle
    @Override
    public List<Customer> findAll() {

        JdbcUtils.setConnection();
        JdbcUtils.setStatement();
        List<Customer> customers = new ArrayList<>();

        try {

            ResultSet rs = JdbcUtils.statement.executeQuery("SELECT * FROM t_customer");
            while (rs.next()) {
                Customer customer = new Customer(
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone"));
customers.add(customer);
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


   return customers; }

    @Override
    public void update(Customer entity, Integer id) {

        JdbcUtils.setConnection();
        JdbcUtils.setPrst("UPDATE t_customer SET name=? , email = ? , phone =? WHERE id = ? ");

        try {
            JdbcUtils.prst.setString(1,entity.getName());
            JdbcUtils.prst.setString(2, entity.getEmail());
            JdbcUtils.prst.setString(3, entity.getPhone());
            JdbcUtils.prst.setInt(4,id);
            int updated = JdbcUtils.prst.executeUpdate();
            if (updated>0){
                System.out.println("Güncelleme işlemi başarılı");
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












    }

    @Override
    public void deleteById(Integer id) {

       JdbcUtils.setConnection();
       JdbcUtils.setPrst("DELETE FROM t_customer WHERE id =?");

        try {
            JdbcUtils.prst.setInt(1,id);
            int deleted = JdbcUtils.prst.executeUpdate();
            if (deleted>0){
                System.out.println("Silme işlemi başarılı");
            }
        } catch (SQLException e) {
           e.printStackTrace();
        }finally {

            try {
                JdbcUtils.connection.close();
                JdbcUtils.prst.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }


        }


    }

    @Override
    public Customer findById(Integer id) {

     JdbcUtils.setConnection();
     JdbcUtils.setPrst("SELECT * FROM t_customer WHERE id =?");

        Customer customer = null;

        try {
            JdbcUtils.prst.setInt(1,id);
            ResultSet rs = JdbcUtils.prst.executeQuery();
            if (rs.next()){
             customer = new Customer(
                     rs.getString("name"),
                     rs.getString("email"),
                     rs.getString("phone")
             );
                customer.setId(rs.getInt("id"));
            }

        } catch (SQLException e) {
          e.printStackTrace();
        }finally {

            try {
                JdbcUtils.connection.close();
                JdbcUtils.prst.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
   return customer; }
}
