package aula09_20_10_26;

import java.util.Scanner;

public class Grafo01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linhas = 0;
        int colunas = 0;
        int grau;
        int vertice;
        int valor;

        System.out.print("Digite a quantidade de elementos da matriz (EX: 4 x 4): ");
        linhas = sc.nextInt();
        colunas = linhas;

        if (linhas < 2 || linhas > 10) {
            System.out.println("Tamanho invalido: ");
        }

        int[][] matriz = new int[linhas][colunas];

        System.out.println("\nDigite os valores: 1 para tem aresta e 0 para não tem aresta\n");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = i; j < matriz[i].length; j++) {
                do {
                    System.out.print(
                            "Digite a aresta entre o vertice (" + (i + 1) + ") e o vertice (" + (j + 1) + ") 0 ou 1: ");
                    valor = sc.nextInt();

                    if (valor != 1 && valor != 0) {
                        System.out.println("Valor invalido! Valores validos apenas 0 e 1");
                    }
                } while (valor != 0 && valor != 1);

                matriz[i][j] = valor;
                matriz[j][i] = valor;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++) {
            grau = 0;
            vertice = i + 1;

            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 1) {
                    grau++;
                }
            }
            System.out.println(vertice + "° vertice: grau " + grau);
        }
        sc.close();

    }

}
