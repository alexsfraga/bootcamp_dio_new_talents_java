package dio.digitalinnovation.one.estudoJava.estruturaDeDados.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrollet"));
        stackCarros.push(new Carro("Volkswagen"));

        System.out.println( stackCarros );

        //Comando PEEK retorna o ultimo elemento da pilha
        System.out.println( "comando peek" + stackCarros.peek() );
        System.out.println( stackCarros );

        //Comando POP retorna o ultimo elemento da Pilha e o remove da Pilha
        System.out.println( "comando pop" + stackCarros.pop() );
        System.out.println( stackCarros );

        //comando EMPTY() retorna true se a pilha estiver vazia e false se a pilha contiver elementos
        System.out.println( stackCarros.empty() );

    }
}
