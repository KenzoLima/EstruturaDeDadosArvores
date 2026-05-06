public class ArvoreBinaria {
    No raiz;

    public ArvoreBinaria() {
        this.raiz = new No(null);
    }

    public void inserir(Integer conteudo){
        No novoNo = new No(conteudo);
        inserirRecursivo(novoNo, this.raiz);
    }

    private void inserirRecursivo(No no, No atual) {
        if(atual.getConteudo() == null){
            this.raiz = no;
            return;
        }

        if (no.getConteudo() > atual.getConteudo()) {
            if(atual.getDireita() == null){
                atual.setDireita(no);
            } else {
                inserirRecursivo(no, atual.getDireita());
            }
        } else {
            if (atual.getEsquerda() == null){
                atual.setEsquerda(no);
                return;
            } else {
                inserirRecursivo(no, atual.getDireita());
            }
        }
    }



    public  boolean estaVazia(){
        if(this.raiz.getConteudo() == null){
            return true;
        } else {
            return false;
        }
    }

    public void exibir (String percurso){
        switch(percurso){
            case("pre"):
                preOrdem(this.raiz);
                break;
            case("em"):
                emOrdem(this.raiz);
                break;
            case("pos"):
                posOrdem(this.raiz);
                break;
        }
    }

    public void preOrdem(No no){
        if (no.getEsquerda() == null){
            return;
        }
        System.out.println(no.getEsquerda());
        preOrdem(no.getEsquerda());
        preOrdem(no.getDireita());
    }

    public void emOrdem(No no){
        if (no.getEsquerda() == null){
            return;
        }
        emOrdem(no.getEsquerda());
        System.out.println(no.getEsquerda());
        emOrdem(no.getDireita());
    }

    public void posOrdem(No no){
        if (no.getEsquerda() == null){
            return;
        }
        posOrdem(no.getEsquerda());
        posOrdem(no.getDireita());
        System.out.println(no.getEsquerda());
    }
}
