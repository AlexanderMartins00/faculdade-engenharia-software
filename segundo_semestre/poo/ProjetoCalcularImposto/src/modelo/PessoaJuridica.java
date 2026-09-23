/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author alexandermartins
 */
public class PessoaJuridica extends Cliente implements ICalcularImposto{
    //Atributos
    private String cnpj = "";
    private String razaoSocial = "";
    private String inscricaoEstadual = "";
    private String url = "";
    private double faturamentoBruto = 0;
    
    //Metodos

    public PessoaJuridica() {
    }

    public PessoaJuridica(String codigo, String nome, String endereco, String email, String telefone,
    String cnpj, String razaoSocial, String inscricaoEstadual, String url, double faturamentoBruto) {
        super(codigo, nome, endereco, email, telefone);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
        this.url = url;
        this.faturamentoBruto = faturamentoBruto;        
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getFaturamentoBruto() {
        return faturamentoBruto;
    }

    public void setFaturamentoBruto(double faturamentoBruto) {
        this.faturamentoBruto = faturamentoBruto;
    }
    @Override
    public double calcularImposto() {
        return (this.faturamentoBruto * 0.20);
    }    
    
}
