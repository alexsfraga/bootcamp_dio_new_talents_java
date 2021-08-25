package dio.digitalinnovation.one.estudoJava.estruturaDeDados.listasEncadeadas;

public class Main {

    public static void main(String[] args) {

        System.out.println( " testando a saida de dados ");

        Lista<String> listaEncadeada = new Lista();

        listaEncadeada.add("primeira");
        listaEncadeada.add( "segundo");
        listaEncadeada.add( "terceiro");
        listaEncadeada.add( "quarto");
        listaEncadeada.add( "quinto");
        listaEncadeada.add( "sexto");

        System.out.println( listaEncadeada.get(2) );
        System.out.println( listaEncadeada.get(0) );
        System.out.println( listaEncadeada.get(4) );

        System.out.println( listaEncadeada.toString() );

        System.out.println( "removendo o No com counteudo: " + listaEncadeada.remove(3) );
    }

}
