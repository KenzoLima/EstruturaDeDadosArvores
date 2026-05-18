public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria(); // criando arvore

        arvore.inserir(1); //raiz


        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(15);
        arvore.inserir(3);
        arvore.inserir(7);
        arvore.inserir(12);
        arvore.inserir(20);

        arvore.exibir("Em");

        arvore.Remover(3);     // folha
        arvore.exibir("Em");

        arvore.Remover(5);     // um filho
        arvore.exibir("Em");

        arvore.Remover(15);    // dois filhos
        arvore.exibir("Em");
    }
}