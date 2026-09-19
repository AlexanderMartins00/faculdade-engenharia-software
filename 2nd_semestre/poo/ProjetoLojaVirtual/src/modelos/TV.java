/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexandermartins
 */
public class TV extends Produto{
    
    //Atributos
    private String modelo = "";
    private String marca = "";
    private String sistemaOperacional = "";
    private double tamanhoTela = 0;
    private double preco = 0;
    
    //Metodos

    public TV() {
    }

    public TV(int codigo, String modelo, String marca, String sistemaOperacional, double tamanhoTela, double preco) {
        super(codigo);
        this.modelo = modelo;
        this.marca = marca;
        this.sistemaOperacional = sistemaOperacional;
        this.tamanhoTela = tamanhoTela;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }    

    @Override
    public String getDescricaoCompleta() {
        String saida = "Dados da TV";
        saida += "Modelo: " + modelo + "\n";
        saida += "Marca: " + marca + "\n";
        saida += "Sistema Operacional: " + sistemaOperacional + "\n";
        saida += "Tamanho da Tela: " + tamanhoTela + "\n";
        saida += "Preço: R$" + preco + "\n";
        return saida;
    }

    @Override
    public double getPrecoVenda() {
        return preco;
    }

    @Override
    public String getTipoProduto() {
        return "TV\n";
    }
    
}
