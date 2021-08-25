package dio.digitalinnovation.one.estudoJava.date;

import java.util.Calendar;

public class TypeCalendar {

    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();
        //System.out.println( agora.toInstant() );
        //System.out.println( agora.getTime() );
        //System.out.println( agora.getTimeInMillis() );

        System.out.println( agora.toInstant() );
        agora.add( Calendar.DATE, -5);
        agora.add( Calendar.MONTH, 3 );
        agora.add( Calendar.YEAR, -39 );
        //agora.add( Calendar.ZONE_OFFSET, 3 );
        //agora.add( Calendar.ZONE_OFFSET);
        System.out.println( agora.toInstant() );
        System.out.println( agora.getTime() );

        System.out.printf( "%tc\n", agora );
        System.out.printf( "%tF\n" , agora);
        System.out.printf( "%tD\n" , agora);
        System.out.printf( "%tr\n", agora );
        System.out.printf( "%tT\n", agora );

    }
}
