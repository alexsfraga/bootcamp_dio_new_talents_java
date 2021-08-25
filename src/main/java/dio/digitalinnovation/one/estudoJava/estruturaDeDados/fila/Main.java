package dio.digitalinnovation.one.estudoJava.estruturaDeDados.fila;

public class Main {

    public static void main(String[] args) {
        // FIFO = First-IN is First-OUT
        Fila<String> fila = new Fila();

        fila.enqueue( "primeiro");
        fila.enqueue( "segundo");
        fila.enqueue( "terceiro");
        fila.enqueue( "quarto");
        fila.enqueue( "quinto");
        fila.enqueue( "sexto");

        System.out.println( fila );

        System.out.println( fila.dequeue() );

        System.out.println( fila );

        System.out.println( "first element is --> " + fila.first() );

    }
}
