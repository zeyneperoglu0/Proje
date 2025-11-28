package eticaret;

import java.sql.*;

public class JdbcUtils {

    public static Connection connection; //Veritabanı bağlantı nesnesi. Bağlantıyı temsil eder.
    public static Statement statement; //SQL sorgularını çalıştırmak için kullanılan nesne.
    public static PreparedStatement prst; //Parametreli SQL sorguları (güvenlik için) için kullanılan nesne.

    //-----------------------------
    //a.connection oluşturma. Veritabanı ile bir bağlantı kurar.

    public static void setConnection() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/project_db",
                    "techpro390",
                    "password"
            );
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


public static void setStatement(){

    try {
        statement = connection.createStatement();
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}

public static void setPrst(String sql){

    try {
        prst =connection.prepareStatement(sql)   ;
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}













}
