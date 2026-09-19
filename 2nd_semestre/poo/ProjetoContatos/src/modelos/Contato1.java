/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexandermartins
 */
public class Contato1 {
    //Atributos
    private String nome = "";
    private String emailPessoal = "";
    private String emailTrabalho = "";
    private Telefone telefonePessoal = null;
    private Telefone telefoneTrabalho = null;
    private Endereco enderecoPessoal = null;
    private Endereco enderecoTrabalho = null;
    //Metodos
    public Contato1(){
        
    }
    public Contato1(String nome, String emailPessoal, String emailTrabalho, Telefone telefonePessoal, 
            Telefone telefoneTrabalho, Endereco enderecoPessoal, Endereco enderecoTrabalho){
        this.nome = nome;
        this.emailPessoal = emailPessoal;
        this.emailTrabalho = emailTrabalho;
        this.telefonePessoal = telefonePessoal;
        this.telefoneTrabalho = telefoneTrabalho;
        this.enderecoPessoal = enderecoPessoal;
        this.enderecoTrabalho = enderecoTrabalho;        
    }

    @Override
    public String toString() {
        return "Contato1 " + "nome = " + nome + ", \nemailPessoal = " + emailPessoal +
                ", \nEmailTrabalho = " + emailTrabalho + 
                ",\nTelefonePessoal = " + telefonePessoal + 
                ", \nTelefoneTrabalho = " + telefoneTrabalho + 
                ", \nEnderecoPessoal = " + enderecoPessoal + 
                ", \nEnderecoTrabalho = " + enderecoTrabalho;
    }
    
    
    
}
