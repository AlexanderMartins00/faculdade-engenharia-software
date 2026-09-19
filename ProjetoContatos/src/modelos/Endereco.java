/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexandermartins
 */
public class Endereco {
    //Atributos
    private String logradouro = "";
    private int numero = 0;
    private String cep = "";
    
    //Metodos
    public Endereco(){
        
    }
    public Endereco(String logradouro, int numero, String cep){
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;        
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco " + "logradouro = " + logradouro + ", numero = " + numero + ", cep = " + cep;
    }
    
    
    
}
