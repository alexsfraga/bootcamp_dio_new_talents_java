package dio.digitalinnovation.one.estudoJava.date;

import java.time.Instant;
import java.util.Date;

public class TypeDate {

    public static void main(String[] args) {
        Long currentTimeMillis = System.currentTimeMillis();

        System.out.println( currentTimeMillis );

        Date dataNova = new Date( currentTimeMillis );
        Date dataVelha = new Date( System.currentTimeMillis() );
        boolean res = dataNova.equals( dataVelha );

        System.out.println( dataNova );
        System.out.println( dataVelha );
        System.out.println( res );
        System.out.println( dataNova.compareTo(dataVelha) );
        System.out.println( dataNova.toInstant());
        Instant inst = dataVelha.toInstant();

        System.out.println( inst );
        System.out.println( Date.from(inst));
    }


}
