package kütüphaneyönetim;

public enum BookInfos {


    DON_KISOT("Don Kişot", "Miguel de Cervantes", "863", "1605"),
    SUC_VE_CEZA("Suç ve Ceza", "Fyodor Dostoyevski", "671", "1866"),
    ANNA_KARENINA("Anna Karenina", "Lev Tolstoy", "864", "1877"),
    SEFILLER("Sefiller", "Victor Hugo", "1232", "1862"),
    GURUR_VE_ONGORU("Gurur ve Önyargı", "Jane Austen", "432", "1813"),
    MOBY_DICK("Moby Dick", "Herman Melville", "635", "1851"),
    KIRMIZI_VE_SIYAH("Kırmızı ve Siyah", "Stendhal", "576", "1830"),
    UCUZ_HAYAT("Uğultulu Tepeler", "Emily Brontë", "416", "1847"),
    SAVAŞ_VE_BARIŞ("Savaş ve Barış", "Lev Tolstoy", "1225", "1869"),
    ROMEO_VE_JULIET("Romeo ve Juliet", "William Shakespeare", "256", "1597");


    private String name ;
    private String author;
    private String pages;
    private String date;


    BookInfos(String name, String author, String pages, String date) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.date = date;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
