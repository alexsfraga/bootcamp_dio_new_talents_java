package dio.digitalinnovation.one.estudoJava.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class TypeLocalDateTime {

    public static void main(String[] args) {

        Date dt = new Date( 2010-05-15);
        LocalDate ld = LocalDate.parse( "2010-05-15" );
        LocalTime lt = LocalTime.parse("10:00:00");

        System.out.println( lt );
        System.out.println( dt.toInstant() );
        System.out.println( ld );

        //DateTimeFormatter formatter = DateTimeFormatter("yyyy-MM-dd hh:mm:ss");
        LocalDateTime ldt1 = ld.atTime(10,00,00);
        System.out.println( ldt1 );
        ld = ld.plusMonths(6).plusYears(4);
        lt = lt.plusHours(13);
        ldt1 = ldt1.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println( ldt1 );
        System.out.println( ld + " " + lt );


    }
}
