package dio.digitalinnovation.one.estudoJava.estruturaDeDados.listasCirculares;

public class Main {

    public static void main(String[] args) {

        Lista<String> lista = new Lista();

        lista.add("c1");
        lista.add("c2");
        lista.add("c3");
        lista.add("c4");
        //lista.add("c6");
        //lista.add("c7");


        System.out.println("cauda=" + lista.get(0));
        System.out.println("cabeca=" + lista.get(lista.size()-1));
        System.out.println( lista.toString() );
        lista.remove(0);
        System.out.println( lista.toString() );
        System.out.println("cauda=" + lista.get(0));
        System.out.println("cabeca=" + lista.get(lista.size()-1));
        System.out.println( lista.toString() );
        //System.out.println("elemento=" + lista.get(0));
        //System.out.println("elemento=" + lista.get(1));
        //System.out.println("elemento=" + lista.get(2));
        //System.out.println("elemento=" + lista.get(3));
        for (int i=0; i <= 20 ;i++){
            System.out.println("elemento=" + lista.get(i));
        }
    }
}
