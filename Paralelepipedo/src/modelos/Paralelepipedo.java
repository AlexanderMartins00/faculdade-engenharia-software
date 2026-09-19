/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexander
 */
public class Paralelepipedo {
    //Atributos
    private float altura = 0;
    private float largura = 0;
    private float comprimento = 0;
    
    //Metodos

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception{
        if(altura <= 0) throw new Exception("A altura nao pode ser <= 0");
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) throws Exception{
        if(largura <= 0) throw new Exception("A largura nao pode ser <= 0");
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) throws Exception{
        if(comprimento <= 0)throw new Exception("O Comprimento nao pode ser <= 0");
        this.comprimento = comprimento;
    }
    public float calcularArea(){
        return(2f *((altura * largura) + (altura * comprimento) + (largura * comprimento)));
    }
    public float calcularVolume(){
        return(altura * largura * comprimento);
    }
    
    
    
    
    
}
