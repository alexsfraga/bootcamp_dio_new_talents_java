package dio.digitalinnovation.one.desafios.evitandoChuva;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" Digite o numero a de dias : ");
        int n = leitor.nextInt();
        int casaComprado = 0;
        int casaSobrando = 0;
        int trabComprado = 0;
        int trabSobrando = 0;
        for ( int i=0 ;  i < n ; i++ ) {
            String linha = leitor.next();
            String[]  previsao = linha.split(" ");

            if ( previsao[0].equals("chuva") && casaSobrando == 0){
                casaComprado += 1;
                trabSobrando += 1;
            } else if ( previsao[0].equals("chuva") &&  casaSobrando > 0 ) {
                casaSobrando -= 1;
                trabSobrando += 1;
            }
            if ( previsao[1].equals("chuva") && trabSobrando == 0 ) {
                trabComprado += 1;
                casaSobrando += 1;
            } else if ( previsao[1].equals("chuva") && trabSobrando > 0) {
                trabSobrando -= 1;
                casaSobrando += 1;
            }
        }
        System.out.println(casaComprado + " " + trabComprado);


    }
}
