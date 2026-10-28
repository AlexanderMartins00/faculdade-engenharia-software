package aula10_27_10_26;

import java.util.Arrays;
import java.util.Scanner;

public class Grafo03 {

    // Definir tamanho da matriz
    // Retorna um vetor: [0] = vertices, [1] = arestas
    public static int[] definirTamanhoMatriz(Scanner sc) {
        int vertices = 0;
        int arestas = 0;

        do {
            System.out.print("Digite quantidade de Vertices: ");
            vertices = sc.nextInt();
            arestas = vertices;

            if (vertices < 2) {
                System.out.println("Valor invalido");
            }

        } while (vertices < 2 || arestas < 1);

        return new int[]{vertices, arestas};
    }

    // Colocar Valores
    public static int[][] inserirValores(Scanner sc, int vertices, int arestas) {
        int[][] matriz = new int[vertices][arestas];
        int valor;

        System.out.print("\nDigite valores: 0 ou 1\n");

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

                for (int g = 0; g < matriz.length; g++) {
                    for (int h = 0; h < matriz[g].length; h++) {
                        System.out.printf("%2d | ", matriz[g][h]);
                    }
                    System.out.println();
                    for (int t = 0; t < matriz[g].length * 5; t++) {
                        System.out.print("-");
                    }
                    System.out.println();
                }
            }
        }

        return matriz;
    }

    // Exibição da matriz final
    public static void exibirMatrizFinal(int[][] matriz) {
        System.out.println("\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%2d | ", matriz[i][j]);
            }
            System.out.println();
            for (int t = 0; t < matriz[i].length * 5; t++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    // Verificação de grau
    public static int[] verificarGrau(int[][] matriz) {

         int[] graus = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            int grau = 0;
            int vertice = i + 1;

            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 1) {
                    grau++;
                }
            }

            graus[i] = grau;
            System.out.println(vertice + "° vertice: grau " + grau);
        }

        return graus;
    }

    public static void verificarIsomorfismo(int[] tamanho01, int[][] matriz, int[]tamanho02, int[][]matriz02){

        if(tamanho01[0] != tamanho02[0] || tamanho01[1] != tamanho02[1]){
            System.out.println("Não e isomorfo, quantidade de vertices ou arestas diferentes");
            return;
        }

        System.out.println("GRAUS DO PRIMEIRO GRAFO");
        int[] graus = verificarGrau(matriz);

        System.out.println("GRAUS DO SEGUNDO GRAFO");
        int[] graus02 = verificarGrau(matriz02);

        int[] ordenado01 = graus.clone();
        int[] ordenado02 = graus02.clone();
        Arrays.sort(ordenado01);
        Arrays.sort(ordenado02);

        if (!Arrays.equals(ordenado01, ordenado02)) {
            System.out.println("\nNão e isomorfo, sequencia de graus diferente\n");
            return;
        }
        else{
            System.out.println("\nPossivelmente isomorfo\n");
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPrimeiro Grafo");
        // Primeiro grafo
        int[] tamanho01 = definirTamanhoMatriz(sc);

        System.out.println("Segundo Grafo");

        // Segundo grafo
        int[] tamanho02 = definirTamanhoMatriz(sc);

        System.out.println("\n-------------------------------------------");
        System.out.println("Faça a inserção do 1° grafo:");
        int[][] matriz = inserirValores(sc, tamanho01[0], tamanho01[1]);

        System.out.println("\n-------------------------------------------");
        System.out.println("Faça a inserção do 2° grafo:");
        int[][] matriz02 = inserirValores(sc, tamanho02[0], tamanho02[1]);
        System.out.println("\n-------------------------------------------");

        System.out.println("PRIMEIRO GRAFO:");
        exibirMatrizFinal(matriz);

        System.out.println("SEGUNDO GRAFO:");
        exibirMatrizFinal(matriz02);

        System.out.println("\nVERIFICAÇÃO DE ISOMORFISMO\n");
        verificarIsomorfismo(tamanho01, matriz, tamanho02, matriz02);

        sc.close();
    }

}