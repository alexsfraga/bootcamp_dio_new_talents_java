package dio.digitalinnovation.one.estudoJava.estruturaDeDados.listasCirculares;

public class Lista<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public Lista(){
        this.tamanhoLista = 0;
        this.cabeca = null;
        this.cauda = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No(conteudo);
        if(this.tamanhoLista == 0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(cauda);
        }else{
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void remove(int index){
        if(index >= this.size())
            throw new IndexOutOfBoundsException(" O indice esta fora da Lista");

        No<T> noAuxiliar = this.cauda;
        if(index == 0){
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda);
        }else if(index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo());
        }else{
            for (int i=0; i < index-1 ; i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;

    }

    private No<T> getNo(int index){
        if(this.isEmpty())
            throw new IndexOutOfBoundsException("Lista esta VAZIA");

        if(index == 0){
            return this.cauda;
        }
        No<T> noAuxiliar = this.cauda;
        for (int i=0; (i<index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size(){
        return tamanhoLista;
    }

    @Override
    public String toString(){
        String str = "";
        No<T> noAuxiliar = this.cauda;
        for (int i=0; i < size() ; i++){
            str += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        str += this.size() !=0 ? "(retorna ao inicio)": "[]";
        return str;
    }

}
