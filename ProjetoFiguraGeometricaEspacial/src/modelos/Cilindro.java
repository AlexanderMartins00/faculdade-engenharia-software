/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexandermartins
 */
public class Cilindro implements IFiguraGeometrica{
    //Atributos
    protected double raio = 0;
    protected double altura = 0;
    //Metodos

    public Cilindro() {
    }
    
    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularAreaLateral(){
        return (2.0 * Math.PI * raio * altura);
    }
    
    @Override
    public double calcularAreaTotal() {
        return (2.0 * Math.PI * raio * (altura + raio));
    }

    @Override
    public double calcularVolume() {
        return (Math.PI * Math.pow(raio, 2) * altura);
    }

    @Override
    public String obterTipoFigura() {
        return "Cilindro";
    }
    
    
    
    
    
    
}
