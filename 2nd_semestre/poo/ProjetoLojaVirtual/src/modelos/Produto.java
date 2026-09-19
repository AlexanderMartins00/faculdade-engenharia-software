/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexandermartins
 */
abstract public class Produto {
    
    //Atributos
    protected int codigo = 0;
    
    //Metodos

    public Produto() {
    }
    
    public Produto(int codigo){
        this.codigo = codigo;
    }       
   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    abstract public String getDescricaoCompleta();
    abstract public double getPrecoVenda();
    abstract public String getTipoProduto();

    
    
}
