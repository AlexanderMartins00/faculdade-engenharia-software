
package aula10_27_10_26.Grafo04;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int totalVertices = definirTamanhoMatriz(entrada);

        Grafo grafo = new Grafo(totalVertices);

        for (int vertice = 1; vertice <= grafo.getTotalVertices(); vertice++) {

            System.out.println("\nVertice " + vertice);

            int quantidade;

            do {
                quantidade = lerInteiro(entrada,
                        "Quantidade de vertices adjacentes a " + vertice +
                                " (0 a " + (totalVertices - 1) + "): ");

                if (quantidade < 0 || quantidade >= totalVertices) {
                    System.out.println("Quantidade invalida.");
                }

            } while (quantidade < 0 || quantidade >= totalVertices);

            int inseridos = 0;

            while (inseridos < quantidade) {

                int adjacente = lerInteiro(entrada,
                        "Digite o " + (inseridos + 1) +
                                "o vertice adjacente a " + vertice + ": ");

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

        entrada.close();
    }

    public static int definirTamanhoMatriz(Scanner sc) {

        int vertices;

        do {

            vertices = lerInteiro(sc,
                    "Digite a quantidade de vertices: ");

            if (vertices < 2) {
                System.out.println(
                        "Valor invalido. Digite pelo menos 2 vertices.");
            }

        } while (vertices < 2);

        return vertices;
    }

    private static int lerInteiro(Scanner entrada, String mensagem) {

        while (true) {

            System.out.print(mensagem);

            if (entrada.hasNextInt()) {
                return entrada.nextInt();
            }

            System.out.println(
                    "Entrada invalida. Digite um numero inteiro.");

            entrada.next();
        }
    }
}
