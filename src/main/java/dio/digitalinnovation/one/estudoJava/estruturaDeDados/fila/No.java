package dio.digitalinnovation.one.estudoJava.estruturaDeDados.fila;

public class No<T> {

    private T obj;
    private No<T> refNoBefore;

    public No(){
        this.refNoBefore = null;
    }

    public No(T obj){
        this.refNoBefore = null;
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public No getRefNoBefore() {
        return refNoBefore;
    }

    public void setRefNoBefore(No refNoBefore) {
        this.refNoBefore = refNoBefore;
    }

    @Override
    public String toString() {
        return "No{" +
                "obj=" + obj +
                '}';
    }
}
