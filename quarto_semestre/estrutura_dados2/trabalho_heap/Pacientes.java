package trabalho_heap;

public class Pacientes {

    private String nome = "";
    private int gravidade = 0;
    private int ordemChegada = 0;
    private static int contadorChegada = 0;

    public Pacientes(String nome, int gravidade){
        validarGravidade(gravidade);
        this.nome = nome;
        this.gravidade = gravidade;
        contadorChegada += 1;
        this.ordemChegada = contadorChegada;
    }

    public boolean maiorPrioridade(Pacientes paciente){
        if(this.gravidade != paciente.gravidade){
            return this.gravidade > paciente.gravidade;
        }
        return this.ordemChegada < paciente.ordemChegada;
    }

    public static void validarGravidade(int gravidade){
        if(gravidade < 1 || gravidade > 10){
            throw new IllegalArgumentException("A gravidade a cima ou a baixo do valor permitido. Valor permitido entre 1 e 10.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGravidade() {
        return gravidade;
    }

    public void setGravidade(int gravidade) {
        this.gravidade = gravidade;
    }

    public int getOrdemChegada() {
        return ordemChegada;
    }

    @Override 
    public String toString(){
        return "pacientes{nome = " + nome + ", gravidade = " + gravidade 
            + ", ordemChegada = " + ordemChegada + "}";
    }
}
