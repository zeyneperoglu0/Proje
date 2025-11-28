package sayıtahmin;

public class Players {

    private int id;
    private int kredi ;
   private int tahminSayısı;
    private int tahminHakkı ;

    public Players(int kredi, int tahminSayısı, int tahminHakkı) {
        this.kredi = kredi;
        this.tahminSayısı = tahminSayısı;
        this.tahminHakkı = tahminHakkı;
    }

    public Players() {
    }

    public int getKredi() {
        return kredi;
    }

    public void setKredi(int kredi) {
        this.kredi = kredi;
    }

    public int getTahminSayısı() {
        return tahminSayısı;
    }

    public void setTahminSayısı(int tahminSayısı) {
        this.tahminSayısı = tahminSayısı;
    }

    public int getTahminHakkı() {
        return tahminHakkı;
    }

    public void setTahminHakkı(int tahminHakkı) {
        this.tahminHakkı = tahminHakkı;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Players{" +
                "kredi=" + kredi +
                ", tahminSayısı=" + tahminSayısı +
                ", tahminHakkı=" + tahminHakkı +
                '}';
    }
}
