package dio.digitalinnovation.one.estudoJava.estruturaDeDados.arvore.model;

public abstract class ObjArvore<T> implements Comparable<T> {

    public abstract boolean equals(Object o);
    public abstract int hasCode();
    public abstract int compareTo(T outro);
    public abstract String toString();

}
