/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexandermartins
 */
public class Graduado extends Estudante{
    //Atributos
    private int anoConclusao = 0;
    private int anoColacao = 0;
    private String numeroDiploma = "";

    public Graduado() {
    }

    public Graduado(String nome, String endereco, String telefone, String email, 
            String matricula, String curso, String campus,
            int anoConclusao,int anoColacao, String numeroDiploma) {
        
        super(nome, endereco, telefone, email, matricula, curso, campus);
        this.anoConclusao = anoConclusao;
        this.anoColacao = anoColacao;
        this.numeroDiploma = numeroDiploma;
    }

    public int getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(int anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public int getAnoColacao() {
        return anoColacao;
    }

    public void setAnoColacao(int anoColacao) {
        this.anoColacao = anoColacao;
    }

    public String getNumeroDiploma() {
        return numeroDiploma;
    }

    public void setNumeroDiploma(String numeroDiploma) {
        this.numeroDiploma = numeroDiploma;
    }

    @Override
    public String toString() {
        return "\n\nGraduado: " + "anoConclusao = " + anoConclusao + ", anoColacao = " + anoColacao + ", numeroDiploma = " + numeroDiploma;
    }
       
    
    
    
}
