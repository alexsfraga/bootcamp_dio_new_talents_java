package dio.digitalinnovation.one.estudoJava.date;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;


public class AtivCalendar {

    public static void main(String[] args) {

        Long dt1 = System.currentTimeMillis();
        Long dt2 = System.currentTimeMillis();

        Calendar agora = Calendar.getInstance();
        Calendar dtVenc = Calendar.getInstance();
        dtVenc.setTime( new Date(dt2));
        dtVenc.set(2021,07,25);
        dt2 = dtVenc.getTimeInMillis();

        //dtVenc.add( Calendar.DATE , 4 );

        System.out.println( dtVenc.DAY_OF_YEAR );
        System.out.println( agora.DAY_OF_YEAR );
        Instant inst = agora.toInstant();

        System.out.println( agora.toInstant() );
        System.out.println( dtVenc.toInstant() );

        System.out.println( dtVenc.DAY_OF_YEAR - agora.DAY_OF_YEAR  + " = dias de diferenca entre datas");


    }
}
