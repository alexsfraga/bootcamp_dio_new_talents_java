package dio.digitalinnovation.one.desafios.vetorDivisor;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        String num = "99999912343000007654329925.7865";


        System.out.println(num);

        Scanner leitor = new Scanner(System.in);
        System.out.println(" Digite o numero a ser dividido : ");

        //String input = num;//leitor.next().replace(",", ".");
        double x = leitor.nextDouble();

        BigDecimal[] n = new BigDecimal[100];
        n[0] = new BigDecimal(x);

        for (int i = 1; i < n.length; i++) {
            n[i] = n[i - 1].divide(new BigDecimal(2));
        }
        DecimalFormat df = new DecimalFormat("0.0000");
        for (int i = 0; i < n.length ; i++) {
            System.out.println("N[" + i + "] = " + df.format(n[i]));
        }


    }
}

/*
        //System.out.println(n[0]);
        //System.out.printf("N[%d] = %.4f\n", 0, n[0]);

99999912343000007654329925.7865
99999912342999999470108672.0000
Saída esperada:
N[0] = 99999912342999999470108672.0000
N[1] = 49999956171499999735054336.0000
 */
//n[0] = new BigDecimal(input.replace(",", "."));
/*
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double x = leitor.nextDouble();
        double[] n = new double[100];
        n[0] = x;
        for (int i=1;  i < n.length ; i++ ) {
            n[i] = n[i-1] /2;
        }
        for (  int i=0;  i < n.length ; i++   ) {
            System.out.println(String.format("N[" + i + "] = %.4f", n[i]));
        }
    }
 */

/*
        BigInteger[] n = new BigInteger[100];
        n[0] = new BigInteger(input);

        System.out.println(n[0]);

        for (int i=1;  i < n.length ; i++ ) {
            n[i] = n[i-1].divide(new BigInteger("2")) ;
        }
        for (  int i=0;  i < n.length ; i++   ) {
            System.out.println(String.format("N[" + i + "] = %.4f", n[i]).replace(",", "."));
        }
 */

/*
        Scanner leitor = new Scanner(System.in);

        String input = leitor.next();

        BigDecimal divisor = new BigDecimal(2);
        BigDecimal[] n = new BigDecimal[100];
        n[0] = new BigDecimal(input);

        for (int i=1;  i < 100 ; i++ ) {
            n[i] = n[i-1].divide(divisor,0,4);
        }
        for (  int i=0;  i < 100 ; i++   ) {
            System.out.println(String.format("N[%d] = %.4f", i, n[i].setScale(4, RoundingMode.HALF_EVEN)));
            //System.out.println(String.format("N[" + i + "] = %.4f", n[i]));
        }
 */


/*
        BigDecimal divisor = new BigDecimal("2");
        BigDecimal[] n = new BigDecimal[100];
        n[0] = new BigDecimal(input);
        //n[0] = String.format("N[%d] = %.4f", i, n[i].setScale(4, RoundingMode.HALF_EVEN));

        for (int i=1;  i < n.length ; i++ ) {
            n[i] = n[i-1].divide(divisor,0,4);
        }
        DecimalFormat converte = new DecimalFormat("0.0000");
        for (  int i=0;  i < n.length ; i++   ) {
            System.out.println("N[" + i + "] = " + converte.format(n[i]));
            //System.out.println(String.format("N[%d] = %.4f", i, n[i].setScale(4, RoundingMode.HALF_EVEN)));
            //System.out.println(String.format("N[" + i + "] = %.4f", n[i]));
        }




        Scanner leitor = new Scanner(System.in);
        double X = leitor.nextDouble();
        BigDecimal[] N = new BigDecimal[100];
        N[0] = new BigDecimal(X);

        for (int i = 1; i < 100; i++) {
            N[i] = N[i - 1].divide(new BigDecimal(2));
        }
        DecimalFormat converte = new DecimalFormat("0.0000");
        for (int i = 0; i < 100; i++) {
            System.out.println("N[" + i + "] = " + converte.format(N[i]));
        }
 */