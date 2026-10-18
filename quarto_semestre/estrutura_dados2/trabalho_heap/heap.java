package trabalho_heap;

import java.util.Arrays;

public class heap {
    private Pacientes[] A;  // Vetor que guarda o heap (índices 1 a tam)
    private int tam;       // Quantidade atual de pacientes
    private int max;       // Capacidade máxima

    public heap(int capacidade) {
        this.max = capacidade;
        this.tam = 0;
        this.A = new Pacientes[capacidade + 1]; // índice 0 não é usado
    }

    // --- Navegação nos índices ---
    private int pai(int i) {
        return i / 2;
    }

    private int esq(int i) {
        return 2 * i;
    }

    private int dir(int i) {
        return (2 * i) + 1;
    }

    // Troca dentro do vetor do heap
    private void trocar(int i, int j) {
        trocar(A, i, j);
    }

    // Troca em qualquer vetor (usado também pelo Heapsort)
    private void trocar(Pacientes[] v, int i, int j) {
        Pacientes temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }

    // --- Subida: reaproveitada no insere e no piorarQuadro ---
    private void sobe(int i) {
        while (i > 1 && A[i].maiorPrioridade(A[pai(i)])) {
            trocar(i, pai(i));
            i = pai(i);
        }
    }

    // --- Requisito 1: Inserção com estabilidade ---
    public void insere(Pacientes p) {
        if (tam == max) {
            throw new IllegalStateException("Erro: heap cheio");
        }
        tam++;
        A[tam] = p;   // entra no fim da árvore
        sobe(tam);    // sobe enquanto tiver maior prioridade que o pai
    }

    // --- Requisito 2: Atendimento médico ---
    public Pacientes atenderProximo() {
        if (tam == 0) {
            throw new IllegalStateException("Não há pacientes aguardando.");
        }

        Pacientes proximo = A[1];  // paciente de maior prioridade
        A[1] = A[tam];            // último assume a raiz temporariamente
        A[tam] = null;            // limpa a posição antiga
        tam--;

        if (tam > 0) {
            corrigeHeap(1);       // rebaixa o nó até o lugar certo
        }
        return proximo;
    }

    // --- CorrigeHeap (descida) ---
    private void corrigeHeap(int i) {
        descer(A, i, tam);
    }

    // Descida genérica: serve para o heap e para o Heapsort (recebe vetor e tamanho)
    private void descer(Pacientes[] v, int i, int n) {
        int esq = esq(i);
        int dir = dir(i);
        int maior = i;

        if (esq <= n && v[esq].maiorPrioridade(v[maior])) {
            maior = esq;
        }
        if (dir <= n && v[dir].maiorPrioridade(v[maior])) {
            maior = dir;
        }

        if (maior != i) {
            trocar(v, i, maior);
            descer(v, maior, n);
        }
    }

    // --- Requisito 3: Agravamento de quadro ---
    public void piorarQuadro(String nome, int novaGravidade) {
        // 1. Localiza o paciente pelo nome
        int pos = -1;
        for (int i = 1; i <= tam; i++) {
            if (A[i].getNome().equals(nome)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Paciente \"" + nome + "\" não encontrado na fila.");
            return;
        }

        // 2. Valida se a nova gravidade é estritamente maior
        if (novaGravidade <= A[pos].getGravidade()) {
            System.out.println("A nova gravidade (" + novaGravidade
                    + ") deve ser maior que a atual (" + A[pos].getGravidade() + ").");
            return;
        }

        // 3. Atualiza a gravidade (ordemChegada não é alterada)
        A[pos].setGravidade(novaGravidade);

        // 4. Sobe a partir da posição atual
        sobe(pos);
    }

    // --- Requisito 4: Relatório com Heapsort ---
    public void gerarRelatorioTurno() {
        System.out.println("\n===== RELATÓRIO DE FECHAMENTO DE TURNO =====");

        if (tam == 0) {
            System.out.println("Nenhum paciente aguardando.");
            return;
        }

        // Trabalha numa cópia para não destruir a fila original
        Pacientes[] v = Arrays.copyOf(A, tam + 1);
        int n = tam;

        // Fase 1: construir o heap máximo
        for (int i = n / 2; i >= 1; i--) {
            descer(v, i, n);
        }

        // Fase 2: leva a raiz (maior prioridade) para o fim e reduz o heap
        for (int fim = n; fim >= 2; fim--) {
            trocar(v, 1, fim);
            descer(v, 1, fim - 1);
        }

        // Agora v está em ordem CRESCENTE de prioridade.
        // Imprime de trás para frente: mais graves primeiro.
        int lugar = 1;
        for (int i = n; i >= 1; i--) {
            System.out.println(lugar + "º Lugar: " + v[i].getNome()
                    + " (Gravidade " + v[i].getGravidade()
                    + ", Chegada #" + v[i].getOrdemChegada() + ")");
            lugar++;
        }
    }

    public boolean estaVazia() {
        return tam == 0;
    }

    public void imprimirVetor() {
        System.out.print("[");
        for (int i = 1; i <= tam; i++) {
            System.out.print(A[i].getNome() + "(" + A[i].getGravidade() + ")"
                    + (i < tam ? ", " : ""));
        }
        System.out.println("]");
    }
}