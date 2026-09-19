/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexandermartins
 */
public class Trabalhador extends Pessoa{
    //Atributos
    
    private String funcao = "";
    private String departamento = "";
    private double salario = 0;

    public Trabalhador() {
    }

    public Trabalhador(String nome, String endereco, String telefone, String email, String funcao, 
            String departamento, double salario) {
        super(nome, endereco, telefone, email);
        this.funcao = funcao;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\nTrabalhador :" + "funcao = " + funcao + ", departamento = " + departamento + ", salario = " + salario;
    }
    
    
    
    
    
}
