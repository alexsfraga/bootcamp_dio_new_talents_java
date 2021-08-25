package dio.digitalinnovation.one.estudoJava.estruturaDeDados.arvore;

public class ArvoreBinaria<T extends Comparable<T>> {

    private NoArvoreBinaria<T> raiz;

    public ArvoreBinaria(){
        this.raiz=null;
    }
    public void inserir(T conteudo){
        NoArvoreBinaria<T> noNovo = new NoArvoreBinaria<>(conteudo);
        this.raiz = inserir(raiz, noNovo);
    }

    private NoArvoreBinaria<T> inserir(NoArvoreBinaria<T> noAtual,NoArvoreBinaria<T> noNovo){
        if(noAtual == null){
            return noNovo;
        }else if(noNovo.getConteudo().compareTo(noAtual.getConteudo()) < 0){
            noAtual.setNoEsquerdo(inserir(noAtual.getNoEsquerdo(), noNovo));
        }else{
            noAtual.setNoDireiro(inserir(noAtual.getNoDireiro(), noNovo));
        }
        return noAtual;
    }

    public void exibirInOrdem(){
        System.out.println("exibindo em Ordem");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(NoArvoreBinaria<T> noAtual){
        if(noAtual != null){
            exibirInOrdem(noAtual.getNoEsquerdo());
            System.out.print("No->" + noAtual.getConteudo() + ", ");
            exibirInOrdem(noAtual.getNoDireiro());
        }
    }

    public void exibirPosOrdem(){
        System.out.println("\nExibindo PosOrdem");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(NoArvoreBinaria<T> noAtual){
        if(noAtual != null){
            exibirPosOrdem(noAtual.getNoEsquerdo());
            exibirPosOrdem(noAtual.getNoDireiro());
            System.out.print("No->" + noAtual.getConteudo() + ", ");
        }
    }

    public void exibirPreOrdem(){
        System.out.println("\nExibindo PréOrdem");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(NoArvoreBinaria<T> noAtual){
        if(noAtual != null){
            System.out.print("No->" + noAtual.getConteudo() + ", ");
            exibirPreOrdem(noAtual.getNoEsquerdo());
            exibirPreOrdem(noAtual.getNoDireiro());
        }
    }

    public void remover(T conteudo){
        try{
            NoArvoreBinaria noAtual = this.raiz;
            NoArvoreBinaria noPai = null;
            NoArvoreBinaria noFilho = null;
            NoArvoreBinaria noTemp = null;

            while(noAtual != null && !noAtual.getConteudo().equals(conteudo)){
                noPai = noAtual;
                if(conteudo.compareTo((T) noAtual.getConteudo()) < 0){
                    noAtual = noAtual.getNoEsquerdo();
                }else{
                    noAtual = noAtual.getNoDireiro();
                }
            }
            if(noAtual == null){
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }
            if(noPai == null){
                if(noAtual.getNoDireiro() == null ){
                    this.raiz = noAtual.getNoEsquerdo();
                }else if( noAtual.getNoEsquerdo() == null){
                    this.raiz = noAtual.getNoDireiro();
                }else{
                    for ( noTemp = noAtual, noFilho = noAtual.getNoEsquerdo() ;
                        noFilho.getNoDireiro() != null;
                        noTemp = noFilho, noFilho = noFilho.getNoEsquerdo()
                    ){
                        if(noFilho != noAtual.getNoEsquerdo()){
                            noTemp.setNoDireiro(noFilho.getNoEsquerdo());
                            noFilho.setNoEsquerdo(this.raiz.getNoEsquerdo());
                        }
                    }
                    noFilho.setNoDireiro(this.raiz.getNoEsquerdo());
                    this.raiz = noFilho;
                }
            }else if( noAtual.getNoDireiro() == null){
                if(noPai.getNoEsquerdo() == noAtual){
                    noPai.setNoEsquerdo(noAtual.getNoEsquerdo());
                }else{
                    noPai.setNoDireiro(noAtual.getNoEsquerdo());
                }
            }else if( noAtual.getNoEsquerdo() == null){
                if(noPai.getNoEsquerdo() == noAtual){
                    noPai.setNoEsquerdo(noAtual.getNoDireiro());
                }else{
                    noPai.setNoDireiro(noAtual.getNoDireiro());
                }
            }else{
                for (
                        noTemp = noAtual, noFilho = noAtual.getNoEsquerdo();
                        noFilho.getNoDireiro() != null;
                        noTemp = noFilho, noFilho = noFilho.getNoDireiro()
                ){
                    if(noFilho != noAtual.getNoEsquerdo()){
                        noTemp.setNoDireiro(noFilho.getNoEsquerdo());
                        noFilho.setNoEsquerdo(noAtual.getNoEsquerdo());
                    }
                    noFilho.setNoDireiro(noAtual.getNoDireiro());
                    if(noPai.getNoEsquerdo() == noAtual){
                        noPai.setNoEsquerdo(noFilho);
                    }else{
                        noPai.setNoDireiro(noFilho);
                    }
                }
            }
        }catch(NullPointerException erro){
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }
    }
}
