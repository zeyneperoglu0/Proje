package eticaret;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements  Repository <Products,Integer> {


    @Override
    public void createTable() {

JdbcUtils.setConnection();
JdbcUtils.setStatement();


        try {
            JdbcUtils.statement.execute(
                    "CREATE TABLE IF NOT EXISTS t_products (id SERIAL UNIQUE," +
                            "name VARCHAR(100) NOT NULL CHECK(LENGTH(name) > 0)," +
                            "price REAL CHECK (price)>0" +
                            "category VARCHAR(50)," +
                            ")"
            );
        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } finally {

            try {

                JdbcUtils.statement.close();
                JdbcUtils.connection.close();

            } catch (SQLException e) {

                System.out.println(e.getMessage());
            }
        }


    }

    @Override
    public void save(Products products) {


   JdbcUtils.setConnection();
   JdbcUtils.setPrst("INSERT INTO t_products(name,price,category) VALUES (?,?,?)");

        try {
            JdbcUtils.prst.setString(1, products.getName());
            JdbcUtils.prst.setDouble(2,products.getPrice());
            JdbcUtils.prst.setString(3,products.getCategory().getCategory());

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally {

            try {

                JdbcUtils.statement.close();
                JdbcUtils.connection.close();

            } catch (SQLException e) {

                System.out.println(e.getMessage());
            }
        }



    }

    @Override
    public List<Products> findAll() {


        JdbcUtils.setConnection();
        JdbcUtils.setStatement();

        List<Products>  allProducts = new ArrayList<>();



        try {
            ResultSet rs = JdbcUtils.statement.executeQuery("" +
                    "SELECT *" +
                    "FROM t_products");

            while (rs.next()){
                String categoryString = rs.getString("category");
                Categories category = Categories.valueOf(categoryString.toUpperCase());
              Products products = new Products(
                      rs.getString("name"),
                      rs.getDouble("price"),
                      category);

allProducts.add(products);

            }



        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally {

            try {

                JdbcUtils.statement.close();
                JdbcUtils.connection.close();

            } catch (SQLException e) {

                System.out.println(e.getMessage());
            }
        }




        return  allProducts;}

    @Override
    public void update(Products entity, Integer id) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Products findById(Integer id) {
        return null;
    }
}
