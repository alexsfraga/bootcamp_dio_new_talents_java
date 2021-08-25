package dio.digitalinnovation.one.desafios.divisores;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println(" Digite o numero a ser dividido : ");
        int n = leitor.nextInt();
        for ( int i=1; i <= n ; i++ ) {
            int r = n % i;
            if ( r == 0 ) {
                System.out.println(i);
            }
        }

    }
}
