package aula10_27_10_26.Grafo04;

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
