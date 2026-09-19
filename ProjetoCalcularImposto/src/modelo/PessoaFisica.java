/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author alexandermartins
 */
public class PessoaFisica extends Cliente implements ICalcularImposto{
    //Atributos
    private String cpf = "";
    private String identidade = "";
    private String sexo = "";
    private double rendaBruta = 0;
    
    //Metodos
    public PessoaFisica() {
    }

    public PessoaFisica(String codigo, String nome, String endereco, String email, String telefone, 
            String cpf, String identidade, String sexo, double rendaBruta) {
        super(codigo, nome, endereco, email, telefone);
        this.cpf = cpf;
        this.identidade = identidade;
        this.sexo = sexo;
        this.rendaBruta = rendaBruta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }
        
    @Override
    public double calcularImposto() {
        if(rendaBruta <= 1400){
            return (0);            
        }
        else if(rendaBruta <= 2100){
            return (rendaBruta * 0.10);            
        }
        else if (rendaBruta <= 2800){
            return (rendaBruta * 0.15);
        }
        else if(rendaBruta <= 3600){
            return (rendaBruta * 0.25);
        }        
        
        return (rendaBruta * 0.30);        
    }
    
    
}
