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
                            "price REAL CHECK (price > 0 )," +
                            "category VARCHAR(50)" +
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
    public int save(Products products) {


   JdbcUtils.setConnection();
   JdbcUtils.setPrst("INSERT INTO t_products(name,price,category) VALUES (?,?,?)");

        try {
            JdbcUtils.prst.setString(1, products.getName());
            JdbcUtils.prst.setDouble(2,products.getPrice());
            JdbcUtils.prst.setString(3,products.getCategory().name());
JdbcUtils.prst.executeUpdate();
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


        return 0;
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
                    category.name());

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

    //4-----------------
    // Metot: Belirli bir ID'ye sahip ürününün bilgilerini günceller.

    @Override
    public void update(Products products, Integer id) {

     JdbcUtils.setConnection();
     JdbcUtils.setPrst("UPDATE t_products SET name=?,price = ?, category = ? WHERE id =? ");

        try {
            JdbcUtils.prst.setString(1, products.getName());
            JdbcUtils.prst.setDouble(2,products.getPrice());
            JdbcUtils.prst.setString(3,products.getCategory().name());
            JdbcUtils.prst.setInt(4,id);

            int updated = JdbcUtils.prst.executeUpdate();
            if (updated>0){
                System.out.println("Güncelleme işi başarıyla tamamlandı");
            }

        } catch (SQLException e) {
           e.printStackTrace();
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
    public void deleteById(Integer id) {

   JdbcUtils.setConnection();
   JdbcUtils.setPrst("DELETE FROM t_products WHERE id =?");

        try {
            JdbcUtils.prst.setInt(1,id);
            int deleted = JdbcUtils.prst.executeUpdate();
            if (deleted>0){
                System.out.println("Silme işlemi tamamlandı ");
            }
        } catch (SQLException e) {
           e.printStackTrace();
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
    public Products findById(Integer id) {

      JdbcUtils.setConnection();
      JdbcUtils.setPrst("SELECT * FROM t_products WHERE id = ? ");
      Products products = null;

        try {
            JdbcUtils.prst.setInt(1,id);
        ResultSet rs = JdbcUtils.prst.executeQuery();

            if (rs.next()){//Eger kayit bulunduysa, ResultSet bos degilse, orn. id yanlis girildi

              products = new Products(
                      rs.getString("name"),
                      rs.getDouble("price"),
                     rs.getString("category"));

            }


        } catch (SQLException e) {
           e.printStackTrace();
        } finally {
            try {
                JdbcUtils.statement.close();
                JdbcUtils.connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }


   return products;
    }
}
