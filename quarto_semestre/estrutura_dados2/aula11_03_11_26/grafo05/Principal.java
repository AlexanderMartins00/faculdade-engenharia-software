package aula11_03_11_26.grafo05;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("BUSCA EM PROFUNDIDADE (DFS)");
        System.out.println("Grafo simples nao direcionado. Vertices numerados de 1 a N.");

        int totalVertices;
        do {
            System.out.print("Digite a quantidade de vertices: ");
            totalVertices = sc.nextInt();

            if (totalVertices < 1) {
                System.out.println("Valor invalido. Digite pelo menos 1 vertice.");
            }
        } while (totalVertices < 1);

        Grafo grafo = new Grafo(totalVertices);

        for (int vertice = 1; vertice <= grafo.getTotalVertices(); vertice++) {

            System.out.println("\nVertice " + vertice);

            int quantidade;

            do {
                System.out.print("Quantidade de vertices adjacentes a " + vertice +
                                " (0 a " + (totalVertices - 1) + "): ");
                quantidade = sc.nextInt();

                if (quantidade < 0 || quantidade >= totalVertices) {
                    System.out.println("Quantidade invalida.");
                }

            } while (quantidade < 0 || quantidade >= totalVertices);

            int inseridos = 0;

            while (inseridos < quantidade) {

                System.out.print("Digite o " + (inseridos + 1) +
                                "o vertice adjacente a " + vertice + ": ");
                int adjacente = sc.nextInt();

                if (adjacente < 1 || adjacente > totalVertices) {

                    System.out.println("O vertice deve estar entre 1 e " + totalVertices);

                } else if (adjacente == vertice) {

                    System.out.println("Nao e permitido ligar um vertice a ele mesmo.");

                } else if (!grafo.adicionarAdjacente(vertice, adjacente)) {

                    System.out.println("Esse vertice ja foi informado nesta lista.");

                } else {
                    inseridos++;
                }
            }
        }

        int completadas = grafo.completarNaoDirecionado();

        if (completadas > 0) {
            System.out.println("\nForam completadas " + completadas + " ligacao(oes) reciproca(s).");
        }

        System.out.println("\nLISTAS DE ADJACENCIA:");

        for (int i = 1; i <= grafo.getTotalVertices(); i++) {

            System.out.print(i + " -> ");

            No atual = grafo.getInicio(i);

            while (atual != null) {

                System.out.print(atual.getVertice() + " -> ");

                atual = atual.getProximo();
            }

            System.out.println("NULL");
        }

        int inicio;
        do {
            System.out.print("\nDigite o vertice inicial: ");
            inicio = sc.nextInt();
            if (inicio < 1 || inicio > totalVertices) {
                System.out.println("O vertice deve estar entre 1 e " + totalVertices);
            }
        } while (inicio < 1 || inicio > totalVertices);

        int[] caminho = grafo.buscaProfundidade(inicio);
        System.out.println("\nCaminho da busca em profundidade (DFS) (ordem de visita):");
        for (int i = 0; i < caminho.length; i++) {
            if (i > 0) {
                System.out.print(" -> ");
            }
            System.out.print(caminho[i]);
        }
        System.out.println();

        if (caminho.length < totalVertices) {
            System.out.println("Existem vertices que nao sao alcancaveis a partir de " + inicio + ".");
        }

        sc.close();
    }
}
