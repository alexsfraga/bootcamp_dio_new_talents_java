package dio.digitalinnovation.one.estudoJava.estruturaDeDados.listasDuplamenteEncadeada;

public class Lista<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public Lista(){
        this.tamanhoLista = 0;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public T get(int index){
        return this.getNoDuplo(index).getConteudo();
    }

    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento){
        NoDuplo<T> noAuxiliar = getNoDuplo(index);
        NoDuplo<T> novoNo = new NoDuplo(elemento);
        novoNo.setNoProximo(noAuxiliar);

        if( novoNo.getNoProximo() != null ){
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        }else{
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }
        if(index == 0){
            primeiroNo = novoNo;
        }else{
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;
    }

    public void remove(int index){
        if(index == 0){
            primeiroNo = primeiroNo.getNoProximo();
            if(primeiroNo != null){
                primeiroNo.setNoPrevio(null);
            }
        }else{
            NoDuplo<T> noAuxiliar = getNoDuplo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            if( noAuxiliar != ultimoNo ){
                noAuxiliar.getNoProximo().setNoPrevio( noAuxiliar.getNoPrevio());
            }else{
                ultimoNo = noAuxiliar;
            }
        }
        tamanhoLista--;

    }

    private NoDuplo<T> getNoDuplo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0; ( i < index ) && (noAuxiliar !=null) ; i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString(){
        String str = "";
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i=0; i < size(); i++){
            str += "[No{conteudo=" + noAuxiliar.getConteudo() +"}] ->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        str += "null";
        return str;
    }
}
