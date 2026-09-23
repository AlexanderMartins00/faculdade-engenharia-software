/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import visao.TelaPrincipal;

import javax.swing.JOptionPane;

/**
 *
 * @author alexander
 */
public class Funcionarios {
    private int matricula = 0;
    private String nome = "";
    private int dependentes = 0;
    private float salarioBase = 0;
    private int gratificacao = 0;
    
public Funcionarios(int matricula, String nome, int dependentes, float salarioBase,int gratificacao)throws Exception{
        
         if(matricula <= 0)throw new Exception("O valor da matricula nao pode ser <= 0");
         if(dependentes < 0)throw new Exception("A quantidade de dependentes nao pode ser negativa.");
         if(salarioBase <= 0)throw new Exception("O valor do salario base nao pode ser <= 0");
         if(gratificacao < 0)throw new Exception("O valor da gratificaçao nao pode ser negativa");
    
        this.matricula = matricula;
        this.nome = nome;
        this.dependentes = dependentes;
        this.salarioBase = salarioBase;
        this.gratificacao = gratificacao;
    
}
    
    public float calcularSalarioBruto(){
        return(salarioBase + gratificacao);        
    }
    public float calcularDescontoINSS(){
        float salario = calcularSalarioBruto();

        if(salario <= 1412.00)return(float)(salario * 0.075);
        if(salario <= 2666.68)return(float)(salario * 0.09);
        if(salario <= 4000.03)return(float)(salario * 0.12);
        return(float)(salario * 0.14);        
        
    }
    public float calcularDescontoIRPF(){
        float salario = calcularSalarioBruto();
        
        if(salario <= 2259.20)return(float)(salario - (123 * dependentes));
        if(salario <= 2826.65)return(float)((salario - (123 * dependentes)) * 0.075);
        if(salario <= 3751.05)return(float)((salario - (123 * dependentes)) * 0.15);
        if(salario <= 4664.68)return(float)((salario - (123 * dependentes)) * 0.225);
        return(float)((salario -(123 * dependentes)) * 0.275);
                
    }
    public float calcularSalarioLiquido(){
        return(calcularSalarioBruto() - calcularDescontoINSS() - calcularDescontoIRPF());        
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) throws Exception{
        if(matricula <= 0)throw new Exception("O valor da matricula nao pode ser <= 0");
        this.matricula = matricula; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) throws Exception{
        if(dependentes < 0)throw new Exception("A quantidade de dependentes nao pode ser negativa.");
        this.dependentes = dependentes;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) throws Exception{
        if(salarioBase <= 0)throw new Exception("O valor do salario base nao pode ser <= 0");
        this.salarioBase = salarioBase;
    }

    public int getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(int gratificacao) throws Exception{
        if(gratificacao < 0)throw new Exception("O valor da gratificaçao nao pode ser negativa");
        this.gratificacao = gratificacao;
    }
    
    
    public String exibirContracheque(){
        float salarioBruto = calcularSalarioBruto();
        float INSS = calcularDescontoINSS();
        float IRPF = calcularDescontoIRPF();
        float salarioLiquido = calcularSalarioLiquido();
        
        String saida= "contra cheque ";
        saida += "Matricula: " + getMatricula() + "\n";
        saida += "Nome: " + getNome() + "\n";
        saida += "Numero de Dependentes: " + getDependentes() + "\n";
        saida += "Salario Base: " + (String.format("%.2f",getSalarioBase())) + "\n";
        saida += "Valor da Gratificaçao: " + getGratificacao() + "\n";
        saida += "Salario Bruto: " + (String.format("%.2f",salarioBruto)) + "\n";
        saida += "Desconto INSS: " + (String.format("%.2f",INSS)) + "\n";
        saida += "Desconto IRPF: " + (String.format("%.2f",IRPF)) + "\n";
        saida += "Salario Liquido: " + (String.format("%.2f",salarioLiquido)) + "\n";     
         
        return saida; 
    }
    
    
    
    
}
