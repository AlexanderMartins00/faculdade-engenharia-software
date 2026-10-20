package trabalho_heap;

import java.util.Arrays;

public class heap {
    private Pacientes[] vetorHeap;  
    private int tam;       
    private int max;       

    public heap(int capacidade) {
        this.max = capacidade;
        this.tam = 0;
        this.vetorHeap = new Pacientes[capacidade + 1]; 
    }

    private int pai(int i) {
        return i / 2;
    }

    private int esq(int i) {
        return 2 * i;
    }

    private int dir(int i) {
        return (2 * i) + 1;
    }

    private void trocar(int i, int j) {
        trocar(vetorHeap, i, j);
    }

    private void trocar(Pacientes[] v, int i, int j) {
        Pacientes temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }

    private void sobe(int i) {
        while (i > 1 && vetorHeap[i].maiorPrioridade(vetorHeap[pai(i)])) {
            trocar(i, pai(i));
            i = pai(i);
        }
    }

    public void insere(Pacientes pacientes) {
        if (tam == max) {
            throw new IllegalStateException("Erro: heap cheio");
        }
        tam++;
        vetorHeap[tam] = pacientes;   
        sobe(tam);    
    }

    public Pacientes atenderProximo() {
        if (tam == 0) {
            throw new IllegalStateException("Não há pacientes aguardando.");
        }

        Pacientes proximo = vetorHeap[1];  
        vetorHeap[1] = vetorHeap[tam];            
        vetorHeap[tam] = null;           
        tam--;

        if (tam > 0) {
            corrigeHeap(1);       
        }
        return proximo;
    }

    private void corrigeHeap(int i) {
        descer(vetorHeap, i, tam);
    }

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

    public void piorarQuadro(String nome, int novaGravidade) {
        
        int pos = -1;
        for (int i = 1; i <= tam; i++) {
            if (vetorHeap[i].getNome().equals(nome)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Paciente \"" + nome + "\" não encontrado na fila.");
            return;
        }

        if (novaGravidade <= vetorHeap[pos].getGravidade()) {
            System.out.println("A nova gravidade (" + novaGravidade
                    + ") deve ser maior que a atual (" + vetorHeap[pos].getGravidade() + ").");
            return;
        }

        vetorHeap[pos].setGravidade(novaGravidade);

        sobe(pos);
    }

    public void gerarRelatorioTurno() {
        System.out.println("\n===== RELATÓRIO DE FECHAMENTO DE TURNO =====");

        if (tam == 0) {
            System.out.println("Nenhum paciente aguardando.");
            return;
        }

        Pacientes[] copiaHeap = Arrays.copyOf(vetorHeap, tam + 1);
        int n = tam;

        for (int i = n / 2; i >= 1; i--) {
            descer(copiaHeap, i, n);
        }

        for (int fim = n; fim >= 2; fim--) {
            trocar(copiaHeap, 1, fim);
            descer(copiaHeap, 1, fim - 1);
        }

        int lugar = 1;
        for (int i = n; i >= 1; i--) {
            System.out.println(lugar + "º Lugar: " + copiaHeap[i].getNome()
                    + " (Gravidade " + copiaHeap[i].getGravidade()
                    + ", Chegada #" + copiaHeap[i].getOrdemChegada() + ")");
            lugar++;
        }
    }

    public boolean estaVazia() {
        return tam == 0;
    }

    public void imprimirVetor() {
        System.out.print("\n[");
        for (int i = 1; i <= tam; i++) {
            System.out.print(vetorHeap[i].getNome() + "(" + vetorHeap[i].getGravidade() + ")"
                    + (i < tam ? ", " : ""));
        }
        System.out.println("]");
    }
}