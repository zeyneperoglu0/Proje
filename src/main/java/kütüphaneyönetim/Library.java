package kütüphaneyönetim;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Library  {

    Set<Books> booksSet = new HashSet<>();

    LocalDate localDate = LocalDate.of(2025,11,1);
    LocalDate localDate2 = LocalDate.of(2025,10,31);
    LocalDate localDate3 = LocalDate.of(2025,10,29);
    LocalDate localDate4= LocalDate.of(2025,10,2);
    LocalDate localDate5= LocalDate.of(2025,10,3);
    LocalDate localDate1 =LocalDate.now();



    Books books0 = new Books("Don Kişot", "Miguel de Cervantes", 863, 1605,true,localDate);
    Books books1 = new Books("Suç ve Ceza", "Fyodor Dostoyevski", 671, 1866,false,localDate1);
    Books books2 = new Books("Anna Karenina", "Lev Tolstoy", 864, 1877,false,localDate1);
    Books books3 = new Books("Sefiller", "Victor Hugo", 1232, 1862,false,localDate1);
    Books books4 = new Books("Gurur ve Önyargı", "Jane Austen", 432, 1813,false,localDate1);
    Books books5 = new Books("Moby Dick", "Herman Melville", 635, 1851,true,localDate2);
    Books books6 = new Books("Kırmızı ve Siyah", "Stendhal", 576, 1830,true,localDate3);
    Books books7 = new Books("Uğultulu Tepeler", "Emily Brontë", 416, 1847,false,localDate1);
    Books books8 = new Books("Savaş ve Barış", "Lev Tolstoy", 1225, 1869,true,localDate4);
    Books books9 = new Books("Romeo ve Juliet", "William Shakespeare", 256, 1597,false,localDate1);



    public void addBooks(){
        booksSet.add(books0);
        booksSet.add(books1);
        booksSet.add(books2);
        booksSet.add(books3);
        booksSet.add(books4);
        booksSet.add(books5);
        booksSet.add(books6);
        booksSet.add(books7);
        booksSet.add(books8);
        booksSet.add(books9);
    }









}
