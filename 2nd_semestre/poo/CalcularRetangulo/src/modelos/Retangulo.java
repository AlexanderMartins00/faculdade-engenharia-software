/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexander
 */
public class Retangulo {
    //Atributos
    private float comprimento = 0;
    private float largura = 0;
    
    //Metodos

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) throws Exception{
        if(comprimento <= 0) throw new Exception("O Comprimento nao pode ser <= 0");
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) throws Exception{
        if(largura <= 0) throw new Exception("A largura nao pode ser <= 0");
        this.largura = largura;
    }
    public float calcularArea(){
        return(comprimento * largura);
}
    public float calcularPerimetro(){
        return(2*(comprimento + largura));
    }
    
    
}
