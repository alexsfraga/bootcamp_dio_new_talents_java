package dio.digitalinnovation.one.estudoJava.equalsHashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> lista = new ArrayList<>();

        lista.add(new Carro("Ford"));
        lista.add(new Carro("Chevrollet"));
        lista.add(new Carro("Volkswagen"));

        System.out.println("Existe Ford ? : " + lista.contains(new Carro("Ford")));
        System.out.println("hashcod= " + new Carro("Ford").hashCode());
        System.out.println("hashcod= " + new Carro("Ford1").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrollet");
        System.out.println(carro1.equals(carro2));
        System.out.println(carro1.equals(new Carro("Ford")));
    }
}
