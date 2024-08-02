public class TestListaSequencial {
    public static void main(String[] args) {
        ListaSequencial lista = new ListaSequencial(10);

        // Teste: Verificar se a lista está vazia antes da inserção
        System.out.println("Lista está vazia? " + lista.estaVazia());

        // Teste: Inserção de elementos
        lista.inserirElemento(1, 10);
        lista.inserirElemento(2, 20);
        lista.inserirElemento(3, 30);
        System.out.println("Após inserção: " + lista.obterElemento(1) + ", " + lista.obterElemento(2) + ", " + lista.obterElemento(3));

        // Teste: Verificar se a lista está vazia após a inserção
        System.out.println("Lista está vazia? " + lista.estaVazia());

        // Teste: Verificar se a lista está cheia
        System.out.println("Lista está cheia? " + lista.estaCheia());

        // Teste: Obter tamanho da lista
        System.out.println("Tamanho da lista: " + lista.obterTamanho());

        // Teste: Modificar elemento
        lista.modificarElemento(2, 25);
        System.out.println("Elemento na posição 2 após modificação: " + lista.obterElemento(2));

        // Teste: Remover elemento
        lista.retirarElemento(1);
        System.out.println("Lista após remoção do primeiro elemento: " + lista.obterElemento(1) + ", " + lista.obterElemento(2));

        // Teste: Obter tamanho da lista após remoção
        System.out.println("Tamanho da lista após remoção: " + lista.obterTamanho());
    }
}
