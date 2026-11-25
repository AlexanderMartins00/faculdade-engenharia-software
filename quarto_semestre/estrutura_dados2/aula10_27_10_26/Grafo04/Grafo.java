
package aula10_27_10_26.Grafo04;

public class Grafo {

    private int totalVertices;
    private No[] listas;

    public Grafo(int totalVertices) {
        this.totalVertices = totalVertices;
        listas = new No[totalVertices + 1];
    }

    public int getTotalVertices() {
        return totalVertices;
    }

    public No getInicio(int vertice) {
        return listas[vertice];
    }

    public boolean existeAdjacente(int origem, int destino) {
        No atual = listas[origem];

        while (atual != null) {
            if (atual.getVertice() == destino) {
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    public boolean adicionarAdjacente(int origem, int destino) {
        if (origem < 1 || origem > totalVertices ||
                destino < 1 || destino > totalVertices ||
                origem == destino ||
                existeAdjacente(origem, destino)) {
            return false;
        }

        No novo = new No(destino);

        if (listas[origem] == null) {
            listas[origem] = novo;
        } else {
            No atual = listas[origem];

            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }

            atual.setProximo(novo);
        }

        return true;
    }

    public int completarNaoDirecionado() {
        int adicionadas = 0;

        for (int i = 1; i <= totalVertices; i++) {
            No atual = listas[i];

            while (atual != null) {
                int vizinho = atual.getVertice();

                if (!existeAdjacente(vizinho, i)) {
                    adicionarAdjacente(vizinho, i);
                    adicionadas++;
                }

                atual = atual.getProximo();
            }
        }

        return adicionadas;
    }
}
