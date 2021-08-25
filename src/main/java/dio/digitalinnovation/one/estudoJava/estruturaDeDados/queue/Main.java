package dio.digitalinnovation.one.estudoJava.estruturaDeDados.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrollet"));
        queueCarros.add(new Carro("Volkswagen"));

        System.out.println( queueCarros );

        //comando PEEK retorna o primeiro elemento da Fila porem não o Remove
        System.out.println( "comando peek" + queueCarros.peek() );
        System.out.println( queueCarros );

        //comando add adiciona o elemento no final da Fila
        System.out.println( "registrou ? " + queueCarros.add(new Carro("Peugeout")) );

        //comando POLL retorna o primeiro elemento da Fila e o remove da Fila
        System.out.println( "comando poll" + queueCarros.poll() );
        System.out.println( queueCarros );

        //comando ISEMPTY() retorna se a FILA esta vazia, vazia = true, ou NãoVazia = false
        System.out.println( queueCarros.isEmpty() );
        System.out.println( queueCarros.size() );

    }
}
