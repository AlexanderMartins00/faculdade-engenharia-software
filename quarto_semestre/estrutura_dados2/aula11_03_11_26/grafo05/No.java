package aula11_03_11_26.grafo05;

public class No {
    private int vertice;
    private No proximo;

    public No(int vertice) {
        this.vertice = vertice;
        this.proximo = null;
    }

    public int getVertice() {
        return vertice;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
