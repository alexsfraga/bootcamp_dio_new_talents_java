package dio.digitalinnovation.one.estudoJava.estruturaDeDados.pilha;

public class Pilha {

    private No noOnTop;

    public Pilha(){
        this.noOnTop = null;
    }

    public void push(No novoNo){
        if( !isEmpty() ) {
            No nextNo = noOnTop;
            noOnTop = novoNo;
            noOnTop.setRefNextNo(nextNo);
        }else
            noOnTop = novoNo;
    }

    public No pop(){
        if( !isEmpty() ) {
            No oldNo = noOnTop;
            noOnTop = noOnTop.getRefNextNo();
            return oldNo;
        }
        return null;
    }
    public No top(){
        return noOnTop;
    }

    public boolean isEmpty(){
        /*if(!this.noOnTop == null){
           return false;
        }
        return true;*/
        return noOnTop == null ? true : false;
    }

    @Override
    public String toString(){
        String ret = " ------------ \n";
        ret += "   Pilha   \n";
        ret += " ------------ \n";

        No noAux = noOnTop;

        while(true){
            if(noAux != null){
              ret += " " + noAux.toString() + " \n";
              noAux = noAux.getRefNextNo();
            }else
                break;
        }
        ret += " ============ \n";
        return ret;
    }
}
