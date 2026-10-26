package aula09_20_10_26;

import java.util.Scanner;

public class Grafo02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vertices = 0;
        int arestas = 0;
        int valor;
        int grauEntrada;
        int grauSaida;

        // Definir tamanho da matriz
        do {
            System.out.print("Digite quantidade de Vertices: ");
            vertices = sc.nextInt();
            System.out.print("Digite a quantidade de Arestas: ");
            arestas = sc.nextInt();

            if(vertices < 2 || arestas < 1){
                System.out.println("Valor invalido");
            }

        } while (vertices < 2 || arestas < 1);

        int[][] matriz = new int[vertices][arestas];

        // Colocar Valores
        System.out.print("\nDigite os valores: +1 indo para vertice, -1 vertice final, 0 null\n");

        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                do {
                    System.out.println();
                    System.out.print("Vertice (" + (i + 1) + ") na aresta (" + (j + 1) + "): ");
                    valor = sc.nextInt();

                    if (valor != 1 && valor != 0 && valor != -1) {
                        System.out.println("Valor invalido! Valores validos apenas 0, -1 e 1");
                    }
                } while (valor != 0 && valor != +1 && valor != -1);

                matriz[i][j] = valor;

                for (int g = 0; g < matriz.length; g++) {
                    for (int h = 0; h < matriz[i].length; h++) {
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

        //Exibição da matriz final
        System.out.println("\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%2d | ",matriz[i][j]);
            }
            System.out.println();
            for (int t = 0; t < matriz[i].length * 5; t++) {
                        System.out.print("-");
                    }
            System.out.println();
        }   

        // Verificação de grau
        for(int i = 0; i < matriz.length; i++){
            int vert = i + 1;
            grauEntrada = 0;
            grauSaida = 0;

            for(int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == 1) {
                    grauSaida++;
                } else if (matriz[i][j] == -1) {
                    grauEntrada++;
                }
            }
            System.out.println(vert + "° vertice: saida " + grauSaida + " | entrada " + grauEntrada);
        }
        sc.close();
    }

}
