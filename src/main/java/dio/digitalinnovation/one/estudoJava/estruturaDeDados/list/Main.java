package dio.digitalinnovation.one.estudoJava.estruturaDeDados.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrollet"));
        listCarros.add(new Carro("Volkswagen"));
        listCarros.add(new Carro("Fiat"));

        System.out.println( listCarros );

        //Comando CONTAINS verifica se o elemento informado esta contido na lista
        System.out.println( "se conten Ford" + listCarros.contains(new Carro("Ford")) );
        System.out.println( listCarros );

        //comando remove deleta o elemento informado da lista e retorna true se removido e false caso contrario
        System.out.println("Removendo Volkswagen -> " + listCarros.remove(new Carro("Volkswagen")));

        //Comando GET retorna o elemento de acordo com a posição do indice informado como paramepro de busca
        System.out.println( "pega elemento no index 1 =" + listCarros.get(1) );
        System.out.println( listCarros );

        //comando INDEXOF retorna um INTEIRO cujo valor representa a posição na lista deste elemento, caso nao encontre retorna o valor de (-1)
        System.out.println( listCarros.indexOf(new Carro("Fiat2")) );

    }
}
