public class ListaSequencial {
    private final int[] lista; // Tornar o campo 'lista' final
    private int tamanho;

    public ListaSequencial(int capacidade) {
        lista = new int[capacidade];
        tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public boolean estaCheia() {
        return tamanho == lista.length;
    }

    public int obterTamanho() {
        return tamanho;
    }

    public int obterElemento(int posicao) {
        if (posicao < 1 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }
        return lista[posicao - 1];
    }

    public void modificarElemento(int posicao, int elemento) {
        if (posicao < 1 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }
        lista[posicao - 1] = elemento;
    }

    public void inserirElemento(int posicao, int elemento) {
        if (estaCheia()) {
            throw new IllegalStateException("Lista cheia.");
        }
        if (posicao < 1 || posicao > tamanho + 1) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }
        for (int i = tamanho; i >= posicao; i--) {
            lista[i] = lista[i - 1];
        }
        lista[posicao - 1] = elemento;
        tamanho++;
    }

    public void retirarElemento(int posicao) {
        if (estaVazia()) {
            throw new IllegalStateException("Lista vazia.");
        }
        if (posicao < 1 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }
        for (int i = posicao - 1; i < tamanho - 1; i++) {
            lista[i] = lista[i + 1];
        }
        tamanho--;
    }
}
