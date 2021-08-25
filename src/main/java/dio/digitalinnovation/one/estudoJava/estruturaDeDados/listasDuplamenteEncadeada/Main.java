package dio.digitalinnovation.one.estudoJava.estruturaDeDados.listasDuplamenteEncadeada;

public class Main {

    public static void main(String[] args) {

        Lista<String> lista = new Lista();

        lista.add("c1");
        lista.add("c2");
        lista.add("c3");
        lista.add("c4");
        //lista.add("c6");
        //lista.add("c7");

        System.out.println( lista.toString() );

        lista.remove(2);

        lista.add(2, "99");

        System.out.println( lista.toString() ) ;

        System.out.println( lista.get(2));



    }
}
