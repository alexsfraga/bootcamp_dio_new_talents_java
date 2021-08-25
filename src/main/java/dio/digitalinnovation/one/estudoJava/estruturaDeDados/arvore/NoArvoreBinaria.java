package dio.digitalinnovation.one.estudoJava.estruturaDeDados.arvore;

public class NoArvoreBinaria<T extends Comparable<T>> {

    private T conteudo;
    private NoArvoreBinaria<T> noEsquerdo;
    private NoArvoreBinaria<T> noDireiro;

    public NoArvoreBinaria(T conteudo){
        this.conteudo = conteudo;
        this.noDireiro=null;
        this.noEsquerdo=null;
    }
    public NoArvoreBinaria(){}

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoArvoreBinaria<T> getNoEsquerdo() {
        return noEsquerdo;
    }

    public void setNoEsquerdo(NoArvoreBinaria<T> noEsquerdo) {
        this.noEsquerdo = noEsquerdo;
    }

    public NoArvoreBinaria<T> getNoDireiro() {
        return noDireiro;
    }

    public void setNoDireiro(NoArvoreBinaria<T> noDireiro) {
        this.noDireiro = noDireiro;
    }

    @Override
    public String toString() {
        return "NoArvoreBinaria{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
