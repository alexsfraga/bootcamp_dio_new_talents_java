package dio.digitalinnovation.one.estudoJava.estruturaDeDados.fila;

public class Fila<T> {

    private No<T> refLastNo;

    public Fila() {
        this.refLastNo = null;
    }

    public void enqueue(T obj){
        No novoNo = new No(obj);
        novoNo.setRefNoBefore(refLastNo);
        refLastNo = novoNo;
    }

    public T first(){
        if( !this.isEmpty() ){
            No firstNo = refLastNo;
            while(true){
                if(firstNo.getRefNoBefore() != null){
                    firstNo = firstNo.getRefNoBefore();
                }else
                    break;
            }
            return (T)firstNo.getObj();
        }
        return null;
    }

    public T dequeue(){
        if( !this.isEmpty() ){
            No firstNo = refLastNo;
            No auxNo = refLastNo;
            while(true){
                if(firstNo.getRefNoBefore() != null){
                    auxNo = firstNo;
                    firstNo = firstNo.getRefNoBefore();
                }else {
                    auxNo.setRefNoBefore(null);
                    break;
                }
            }
            return (T)firstNo.getObj();
        }
        return null;
    }

    public boolean isEmpty(){
        return refLastNo == null ? true : false;
    }


    @Override
    public String toString(){
        String ret = " ------------ \n";
        ret += "   Fila   \n";
        ret += " ------------ \n";

        if( refLastNo != null ) {
            No noAux = refLastNo;

            while (true) {
                if (noAux != null) {
                    ret += " " + noAux.toString() + " \n";
                    noAux = noAux.getRefNoBefore();
                } else
                    break;
            }
        }else{
            ret += " null \n";
        }
        ret += " ============ \n";
        return ret;
    }
}
