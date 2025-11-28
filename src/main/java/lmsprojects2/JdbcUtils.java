package lmsprojects2;

import java.sql.*;

public class JdbcUtils {


 public static Connection connection;
 public static Statement statement;
 public static PreparedStatement prst;


    //-----------------------------
    //a.connection oluşturma. Veritabanı ile bir bağlantı kurar.


public static void  setConnection(){

    try {
        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/projects_db",
                "techpro390",
                "password"
        );
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }

}


    //-----------------------------
    //b.statement oluşturma. Basit SQL sorguları için bir statement nesnesi oluşturur.


public static void setStatement(){


    try {
        statement = connection.createStatement();
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }


}


    //-----------------------------
    //c.prepareStatement oluşturma
    // Metot: Parametreli SQL sorguları için bir PreparedStatement nesnesi oluşturur.
    // 'sql' parametresi, çalıştırılacak sorguyu alır.




public  static void  setPrst(String sql){

    try {
        prst = connection.prepareStatement(sql);
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }


}








}
