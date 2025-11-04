package kütüphaneyönetim;

import java.time.LocalDate;

public class Books{

   public String name ;
   public String author;
   public int pages ;
    public int date ;
public boolean isBorrowed;
public LocalDate dateİade ;
    public Books(String name, String author, int pages, int date ,boolean isBorrowed,LocalDate dateİade) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.date = date;
        this.isBorrowed = isBorrowed;
        this.dateİade = dateİade;
    }



}
