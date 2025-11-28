package eticaret;

public enum Categories {


    TEMIZLIK("Temizlik"),
    EV("Ev"),
    ELEKTRONIK ("Elektronik"),
    KOZMETIK("Kozmetik"),
    KIYAFET("Kıyafet"),
    OYUNCAK("Oyuncak"),
    KITAP("Kitap");


    public String getCategory() {
        return category;
    }

    private String category;

    Categories(String category) {
        this.category = category;
    }























}
