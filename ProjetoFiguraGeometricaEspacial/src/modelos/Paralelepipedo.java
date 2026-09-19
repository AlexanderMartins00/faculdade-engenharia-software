/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexandermartins
 */
public class Paralelepipedo implements IFiguraGeometrica{
    //Atributos
    private double comprimento = 0;
    private double altura = 0;
    private double largura = 0;
    
    //Metodos

    public Paralelepipedo() {
    }
    
    public Paralelepipedo(double comprimento, double altura, double largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    public double calcularDiagonal(){
        return (Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2) + Math.pow(comprimento, 2)));
    }

    @Override
    public double calcularAreaTotal() {
        return (2 * (comprimento * largura + comprimento * altura + largura * altura));
    }

    @Override
    public double calcularVolume() {
        return (comprimento * largura * altura);
    }

    @Override
    public String obterTipoFigura() {
        return "Paralelepipedo";
    }
    
    
    
}
