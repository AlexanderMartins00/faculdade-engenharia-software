package aula11_03_11_26.grafo06;

import java.util.Arrays;

public class Grafo {

    private int totalVertices;
    private No[] listas;

    public Grafo(int totalVertices) {
        if (totalVertices < 1) {
            throw new IllegalArgumentException("Informe pelo menos 1 vertice.");
        }
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

    public int[] buscaLargura(int inicio) {
        if (inicio < 1 || inicio > totalVertices) {
            throw new IllegalArgumentException("Vertice inicial invalido.");
        }

        boolean[] visitado = new boolean[totalVertices + 1];
        int[] fila = new int[totalVertices];
        int[] caminho = new int[totalVertices];
        int frente = 0;
        int fim = 0;
        int quantidade = 0;

        visitado[inicio] = true;
        fila[fim++] = inicio;

        while (frente < fim) {
            int vertice = fila[frente++];
            caminho[quantidade++] = vertice;

            No atual = listas[vertice];
            while (atual != null) {
                int vizinho = atual.getVertice();
                if (!visitado[vizinho]) {
                    visitado[vizinho] = true;
                    fila[fim++] = vizinho;
                }
                atual = atual.getProximo();
            }
        }

        return Arrays.copyOf(caminho, quantidade);
    }
}
