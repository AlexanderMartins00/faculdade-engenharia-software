/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author alexander
 */

public class ContaCorrente {
    //Atributos
    private String nomeCliente = "";
    private int numeroConta = 0;
    private int agencia = 0;
    private float saldo=0;
    private float limite = 0;
    
public ContaCorrente(String nomeCliente, int numeroConta, int agencia, float saldo, float limite)throws Exception{
    
    if(numeroConta <= 0)throw new Exception("Numero da conta nao poder ser <=0");
    if(agencia <= 0)throw new Exception("Numero da agencia nao poder ser <=0");
    if(saldo < 1000) throw new Exception("O deposito não pode ser inferior a R$1000,00");
    if(limite < 0) throw new Exception("o limite não pode ser <0");    
          
    this.nomeCliente = nomeCliente;
    this.numeroConta = numeroConta;
    this.agencia = agencia;
    this.saldo = saldo;
    this.limite = limite;
    
}

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) throws Exception{
        if(numeroConta<=0)throw new Exception("Numero da conta não pode ser <=0 ");
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) throws Exception{
        if(agencia<=0)throw new Exception("Numero da agencia não pode ser <=0 ");
        this.agencia = agencia;
    }

    public float getSaldo() {
        return saldo;
    }

    
    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) throws Exception{
        if(limite<0)throw new Exception("o limite não pode ser <0 ");
        this.limite = limite;
    }
    
    public float sacar (float valor)throws Exception{
        if(valor <= 0)throw new Exception("O valor de saque nao pode ser <= 0");
        if(valor > (saldo + limite))throw new Exception("Saldo insuficiente");
        
        saldo -= valor;
        return valor;        
    }
    
    public float depositar (float valor)throws Exception{
        if(valor <= 0)throw new Exception("O valor do deposito nao pode ser <= 0");
        saldo += valor;
        return valor;
    }
    
    public String emitirSaldo(){
        String saida = "Banco 100% da galera \n\n";
        saida += "Nome do cliente: " + nomeCliente + "\n";
        saida+= "Numero da conta: " + numeroConta + "\n";
        saida += "Numero da agencia: " + agencia + "\n";
        saida += "Saldo: " + saldo + "\n";
        saida += "Limite: " + limite + "\n";
        return saida;
    }

    
}
