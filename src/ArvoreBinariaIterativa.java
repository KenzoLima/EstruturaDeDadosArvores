public class ArvoreBinariaIterativa {
    No raiz;

    public ArvoreBinariaIterativa() {
        this.raiz = null;
    }

    public void inserir(Integer conteudo){
        No novoNo = new No(conteudo);
        No atual = this.raiz;

        if(this.raiz == null){
            this.raiz = novoNo;
            return;
        }

        while(true){
            if(conteudo < atual.getConteudo()){
                if(atual.getEsquerda() == null){
                    atual.setEsquerda(novoNo);
                    return;
                } else {
                    atual =  atual.getEsquerda();
                }
            } else if (conteudo > atual.getConteudo()) {
                if(atual.getDireita() == null){
                    atual.setDireita(novoNo);
                    return;
                } else {
                    atual = atual.getDireita();
                }
            }
        }
    }
}
