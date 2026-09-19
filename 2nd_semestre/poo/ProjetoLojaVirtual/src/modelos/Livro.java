/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexandermartins
 */
public class Livro extends Produto{
    
    //Atributos
    private String titulo = "";
    private String autor = "";
    private String tradutor = "";
    private String editora = "";
    private int anoPublicacao = 0;
    private double preco = 0;
    
    //Metodos

    public Livro() {
    }
     public Livro(int codigo, String titulo, String autor, String tradutor,
             String editora, int anoPublicacao, double preco) {
         super(codigo);
         this.titulo = titulo;
         this.autor = autor;
         this.tradutor = tradutor;
         this.editora = editora;
         this.anoPublicacao = anoPublicacao;
         this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTradutor() {
        return tradutor;
    }

    public void setTradutor(String tradutor) {
        this.tradutor = tradutor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
     
       
    @Override
    public String getDescricaoCompleta() {
        String saida = "Dados do Livro\n";
        saida += "Título: " + titulo + "\n";
        saida += "Autor: " + autor + "\n";
        saida += "Tradutor: " + tradutor + "\n";
        saida += "Editora: " + editora + "\n";
        saida += "Ano: " + anoPublicacao + "\n";
        saida += "Preço: R$ " + preco + "\n";

        return saida;
    }

    @Override
    public double getPrecoVenda() {
        return preco;
    }

    @Override
    public String getTipoProduto() {
        return "livro\n";
    }    
    
}
