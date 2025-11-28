package lmsprojects2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Repo implements Repository<Account,Integer>{


    @Override
    public void createTable() {

JdbcUtils.setConnection();
JdbcUtils.setStatement();

        try {
            JdbcUtils.statement.execute("CREATE TABLE IF NOT EXISTS accounts (id SERIAL UNIQUE,email VARCHAR(50) UNIQUE," +
                    "password VARCHAR(20) NOT NULL)");
        } catch (SQLException e) {
            e.printStackTrace();

        }finally {

            try {
                JdbcUtils.connection.close();
                JdbcUtils.statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


        }


    }

    @Override
    public void save(Account account  ) {

JdbcUtils.setConnection();
JdbcUtils.setPrst("INSERT INTO accounts (email,password) VALUES(?,?)");


        try {
            JdbcUtils.prst.setString(1, account.getEmail());
            JdbcUtils.prst.setString(2, account.getPassword());
JdbcUtils.prst.executeUpdate();
            System.out.println("başarılı");


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally {

            try {
                JdbcUtils.connection.close();
                JdbcUtils.statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


        }

    }

    @Override
    public List<Account> findAll() {

JdbcUtils.setConnection();
JdbcUtils.setStatement();

List<Account> allAccounts = new ArrayList<>();

        try {
            ResultSet rs = JdbcUtils.statement.executeQuery("SELECT * FROM accounts");

            while (rs.next()){
Account account = new Account(
   rs.getString("email") ,
   rs.getString("password")

);
allAccounts.add(account);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally {

            try {
                JdbcUtils.connection.close();
                JdbcUtils.statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


    }
  return allAccounts;  }





    @Override
    public void update(Account entity, Integer id) {

    }

    @Override
    public void deletedById(Integer id) {

    }

    @Override
    public Account findById(Integer id) {
        return null;
    }

}
