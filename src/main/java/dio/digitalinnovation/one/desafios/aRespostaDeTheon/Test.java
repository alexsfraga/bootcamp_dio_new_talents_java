package dio.digitalinnovation.one.desafios.aRespostaDeTheon;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um Numero para (N): ");


        int n = leitor.nextInt();
        System.out.println( n );
        int t, menor = 0, posMenor = 0;

        for (int i=1 ; i <= n  ; i++ ) {
            System.out.println("Digite um Numero para (T) : ");
            t = leitor.nextInt();
            if ( i == 1 ) {
                menor = t;
                posMenor = i;

            } else if ( t < menor  ) {
                menor = t;
                posMenor = i;
            }


        }

        System.out.println(posMenor);
    }
}
