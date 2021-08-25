package dio.digitalinnovation.one.estudoJava.estruturaDeDados.set;

import java.util.*;

public class MainSetEndTree {

    public static void main(String[] args) {

        Set<Carro> setCarros = new HashSet<>();
        Set<Carro> treeCarros = new TreeSet<>();

        setCarros.add(new Carro("Ford"));
        setCarros.add(new Carro("Chevrolet"));
        setCarros.add(new Carro("Fiat"));
        setCarros.add(new Carro("Peugeot"));
        setCarros.add(new Carro("Zip"));
        setCarros.add(new Carro("Alfa Romeu"));

        System.out.println( setCarros );

        treeCarros.add(new Carro("Ford"));
        treeCarros.add(new Carro("Chevrolet"));
        treeCarros.add(new Carro("Fiat"));
        treeCarros.add(new Carro("Peugeot"));
        treeCarros.add(new Carro("Zip"));
        treeCarros.add(new Carro("Alfa Romeu"));

        System.out.println( treeCarros );
    }
}
