package dio.digitalinnovation.one.desafios.domingoDeManha;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) throws FileNotFoundException {


        List<String> list = new ArrayList<>();
        File file = new File("src/main/java/dio/digitalinnovation/one/desafios/domingoDeManha/dados.txt");
        Scanner ler = new Scanner(file);

        while ( ler.hasNext() ) {
                String[] relog = ler.next().split(":");
                int hora = Integer.parseInt(relog[0]);
                int min = Integer.parseInt(relog[1]);

                String txt = "Para hora: " + hora + " ";
                switch (hora) {
                    case (7):
                        System.out.println( txt + "Atraso maximo: " + min);
                        break;
                    case (8):
                        System.out.println( txt + "Atraso maximo: " + (60 + min));
                        break;
                    case (9):
                        System.out.println( txt + "Atraso maximo: " + (120 + min));
                        break;
                    default:
                        System.out.println( txt + "Atraso maximo: 0");
                }

        }

        //scanner com argumento "System.in" para ler o conteudo digitado no prompt do console
        Scanner ler2 = new Scanner(System.in);
        System.out.println("digite algo: ");
        //neste ponto faz a captura do conteudo digitado apos confirmação por parte do usuario com a tecla "enter"
        String str = ler2.next();
        //simplesmente imprimo o conteudo que foi capturado na tela e armazenado em uma variavel do tipo String
        System.out.println("conteudo de str = " + str);

    }
}
