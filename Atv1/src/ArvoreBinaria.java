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

    private void inserirIterativo(No no){
        if(estaVazia()){
            this.raiz= no;
            return;
        } else {
            No aux = this.raiz;
            while(aux != null){
                if(no.getConteudo() > aux.getConteudo()){
                    if(no.getConteudo() == null){
                        aux.setDireita(no);
                        return;
                    } else {
                        aux = aux.getDireita();
                    }
                } else {
                    if (aux.getEsquerda() == null) {
                        aux = aux.getEsquerda();
                        return;
                    } else {
                        aux = aux.getEsquerda();
                    }
                }
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

//+++++++++++++++++++++++++++ REMOVER ++++++++++++++++++++++++++++++++++++++++++++
    public void Remover(Integer valor) {
        if (!estaVazia()) {
            this.raiz = removerRecursivo(this.raiz, valor);
            if (this.raiz == null) this.raiz = new No(null);
        }
    }

    private No removerRecursivo(No atual, Integer valor) {
        if (atual == null || atual.getConteudo() == null) return null;

        if (valor < atual.getConteudo()) {
            atual.setEsquerda(removerRecursivo(atual.getEsquerda(), valor));
        } else if (valor > atual.getConteudo()) {
            atual.setDireita(removerRecursivo(atual.getDireita(), valor));
        } else {
            if (atual.getEsquerda() == null) return atual.getDireita();
            if (atual.getDireita() == null) return atual.getEsquerda();

            Integer menorValorDireita = encontrarMenorConteudo(atual.getDireita());
            atual.setConteudo(menorValorDireita);
            atual.setDireita(removerRecursivo(atual.getDireita(), menorValorDireita));
        }
        return atual;
    }

    private Integer encontrarMenorConteudo(No no) {
        return no.getEsquerda() == null ? no.getConteudo() : encontrarMenorConteudo(no.getEsquerda());
    }
}
