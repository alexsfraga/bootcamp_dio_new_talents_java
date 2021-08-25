package dio.digitalinnovation.one.estudoJava.estruturaDeDados.pilha;

public class No<T> {

    private T data;
    private No refNextNo;

    public No(T data){
        this.refNextNo = null;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public No getRefNextNo() {
        return refNextNo;
    }

    public void setRefNextNo(No refNextNo) {
        this.refNextNo = refNextNo;
    }

    @Override
    public String toString() {
        String ret = "No{" +
                "data=" + data +
                '}';

        return ret;
    }
}
