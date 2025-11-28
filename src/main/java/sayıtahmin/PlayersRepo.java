package sayıtahmin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlayersRepo implements Repository <Players,Integer> {


    @Override
    public void createTable() {

       JdbcUtils.setConnection();
       JdbcUtils.setStatement();

        try {
            JdbcUtils.statement.execute("CREATE TABLE IF NOT EXISTS t_players(id INTEGER ,kredi INTEGER," +
                    "tahmin_sayısı INTEGER, tahmin_hakkı INTEGER)");
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

    @Override
    public void save(Players players) {


  JdbcUtils.setConnection();
  JdbcUtils.setPrst("INSERT INTO t_players(kredi, tahmin_sayısı ,tahmin_hakkı) VALUES (?,?,?)");

        try {
            JdbcUtils.prst.setInt(1,players.getKredi());
            JdbcUtils.prst.setInt(2,players.getTahminSayısı());
            JdbcUtils.prst.setInt(3,players.getTahminHakkı());

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


    @Override
    public List<Players> findAll() {

     JdbcUtils.setConnection();
     JdbcUtils.setStatement();
        List<Players>playersList = new ArrayList<>();

        try {

            ResultSet rs = JdbcUtils.statement.executeQuery("SELECT * FROM t_players");

            while (rs.next()){

              Players players = new Players(
                 rs.getInt("kredi") ,
                 rs.getInt("tahmin_sayısı"),
                 rs.getInt("tahmin_hakkı")
              );
              playersList.add(players);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                JdbcUtils.connection.close();
                JdbcUtils.statement.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }}



            return playersList; }

    @Override
    public void update(Players entity, Integer id) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Players findById(Integer id) {
        return null;
    }
}
