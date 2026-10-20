package trabalho_heap;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        heap fila = new heap(10);
        int opcao;

        do {
            System.out.println("\n");
            System.out.println("1 - Cadastrar chegada do paciente");
            System.out.println("2 - Piorar quadro do paciente");
            System.out.println("3 - Atender paciente");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");

            opcao = lerInteiro(sc);

            switch (opcao) {
                case 1:
                    System.out.print("Nome do paciente: ");
                    String nome = sc.nextLine().trim().toLowerCase();

                    if (nome.isEmpty()) {
                        System.out.println("O nome não pode ser vazio.");
                        break;
                    }

                    System.out.print("Gravidade (1 a 10): ");
                    int gravidade = lerInteiro(sc);

                    try {
                        fila.insere(new Pacientes(nome, gravidade));
                        System.out.println("Paciente cadastrado.");
                    } catch (IllegalArgumentException | IllegalStateException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    fila.imprimirVetor();
                    break;

                case 2:
                    System.out.print("Nome do paciente: ");
                    String nomePior = sc.nextLine().trim().toLowerCase();

                    System.out.print("Nova gravidade (1 a 10): ");
                    int novaGravidade = lerInteiro(sc);

                    try {
                        fila.piorarQuadro(nomePior, novaGravidade);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    fila.imprimirVetor();
                    break;

                case 3:
                    try {
                        Pacientes atendido = fila.atenderProximo();
                        System.out.println("Atendido: " + atendido);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    fila.imprimirVetor();
                    break;

                case 4:
                    fila.gerarRelatorioTurno();
                    break;

                default:
                    System.out.println("Opção inválida. Escolha de 1 a 4.");
            }
        } while (opcao != 4);

        sc.close();
    }

    private static int lerInteiro(Scanner sc) {
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}