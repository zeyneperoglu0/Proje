package kütüphaneyönetim;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class İadeEdilmesiGereken {


    Library library;

    public İadeEdilmesiGereken(Library library) {
        this.library = library;
    }

    public void iadeEdilmesiGerekenKitaplar(){
      for (Books w : library.booksSet){
      LocalDate iadeb =    w.dateİade.plusDays(7);
        long kalanGün = ChronoUnit.DAYS.between(LocalDate.now(),iadeb);


          if (kalanGün<0){
              System.out.println(w.name + " iade süresi  geçmiş");
          }
      }






    }


}
