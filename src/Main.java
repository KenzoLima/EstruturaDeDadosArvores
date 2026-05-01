public class Main {
    public static void main(String[] args) {
        ArvoreBinariaIterativa arvore = new ArvoreBinariaIterativa(); // criando arvore

        arvore.inserir(27); //raiz

        arvore.inserir(20);
        arvore.inserir(-100);
        arvore.inserir(2);
        arvore.inserir(29);
        arvore.inserir(63);
        arvore.inserir(40);
        arvore.inserir(35);

        System.out.println(arvore);
    }
}