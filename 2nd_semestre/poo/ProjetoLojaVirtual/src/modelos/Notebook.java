/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexandermartins
 */
public class Notebook extends Produto{
    
    //Atributos
    private String marca = "";
    private String modelo = "";
    private String memoriaRAM = "";
    private String capacidadeHD = "";
    private String processador = "";
    private double tamanhoTela = 0;
    private String sistemaOperacional = "";
    private double preco = 0;
    
    //Metodos

    public Notebook() {
    }

    public Notebook(int codigo, String marca, String modelo, String memoriaRAM, String capacidadeHD,
            String processador, double tamanhoTela, String sistemaOperacional, double preco) {
        super(codigo);
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.capacidadeHD = capacidadeHD;
        this.processador = processador;
        this.tamanhoTela = tamanhoTela;
        this.sistemaOperacional = sistemaOperacional;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getCapacidadeHD() {
        return capacidadeHD;
    }

    public void setCapacidadeHD(String capacidadeHD) {
        this.capacidadeHD = capacidadeHD;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    

    @Override
    public String getDescricaoCompleta() {
        String saida = "Dados do Notebook";
        saida += "Marca: " + marca + "\n";
        saida += "Modelo: " + modelo + "\n";
        saida += "Memoria Ram: " + memoriaRAM + "\n";
        saida += "Capacidade HD: " + capacidadeHD + "\n";
        saida += "Processador: " + processador + "\n";
        saida += "Tamanho da Tela: " + tamanhoTela + "\n";
        saida += "Sistema Operacional: " + sistemaOperacional + "\n";
        saida += "Preço: R$" + preco + "\n";
        
        return saida;
    }

    @Override
    public double getPrecoVenda() {
        return preco;
    }

    @Override
    public String getTipoProduto() {
        return "Notebook\n";
    }
    
}
