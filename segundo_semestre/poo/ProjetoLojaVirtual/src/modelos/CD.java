/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexandermartins
 */
public class CD extends Produto{
    
    //Atributos
    private String nomeAlbum = "";
    private String banda = "";
    private String cantor = "";
    private String generoMusical = "";
    private double preco = 0;
    
    //Metodos

    public CD() {
    }

    public CD(int codigo, String nomeAlbum, String banda, String cantor, String generoMusical, double preco) {
        super(codigo);
        this.nomeAlbum = nomeAlbum;
        this.banda = banda;
        this.cantor = cantor;
        this.generoMusical = generoMusical;
        this.preco = preco;      
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
        
    @Override
    public String getDescricaoCompleta() {
        String saida = "Dados do CD";
        saida += "Nome do album: " + nomeAlbum + "\n";
        saida += "Banda: " + banda + "\n";
        saida += "Cantor: " + cantor + "\n";
        saida += "Genero Musical: " + generoMusical + "\n";
        saida += "Preço: R$" + preco + "\n";
        
        return saida;
    }

    @Override
    public double getPrecoVenda() {
        return preco;
    }

    @Override
    public String getTipoProduto() {
        return "CD\n";
    }
    
}
