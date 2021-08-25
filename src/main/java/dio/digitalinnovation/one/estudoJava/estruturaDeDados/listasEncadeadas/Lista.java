package dio.digitalinnovation.one.estudoJava.estruturaDeDados.listasEncadeadas;

public class Lista<T> {

    private No<T> referenciaEntrada;

    public Lista() {
        this.referenciaEntrada = null;
    }

    //metodo que ira adicionar um novo elemento a lista
    public void add(T conteudo){
        No<T> novoNo = new No(conteudo);
        if( this.isEmpty() ){
            this.referenciaEntrada = novoNo;
        }else {
            No<T> noAuxiliar = referenciaEntrada;
            for (int i = 0; i < this.size() - 1; i++) {
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            noAuxiliar.setProximoNo(novoNo);
        }
    }

    //metodo publico que ira retornar um elemento da lista, de acordo com o indice informado.
    public T get( int index ){
        return getNo( index ).getConteudo();
    }

    //metodo privado que ira efetuar a busca do entre os elementos da lista de acordo com o indice informado e ira retornar um objeto do tipo "No"
    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
        for(int i =0; i <= index ; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    private void validaIndice(int index){
        if( index < 0 || index >= size() ){
            int ultimoIndex = size() -1;
            throw new IndexOutOfBoundsException("Não existe conteudo na lista para o valor de index informado: ( " + index + " ). A lista possui indice que vai de ( 0 a " + ultimoIndex + " ).");
        }
    }

    public T remove( int index ){
        validaIndice( index );
        No<T> noPivor = getNo( index );
        if( index == 0 ){
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo( index -1 );
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while(true){
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else{
                    break;
                }

            }else{
                break;
            }
        }
        return tamanhoLista;
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    @Override
    public String toString(){
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for ( int i=0 ; i < this.size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
