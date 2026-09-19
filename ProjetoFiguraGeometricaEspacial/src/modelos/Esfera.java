/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexandermartins
 */
public class Esfera implements IFiguraGeometrica{
    
    //Atributos
    private double raio = 0;
    
    //Metodos

    public Esfera() {
    }
    
    public Esfera(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularAreaTotal() {
        return (4.0 * Math.PI  * Math.pow(raio, 2));
    }

    @Override
    public double calcularVolume() {
        return (4.0/3.0 * Math.PI * Math.pow(raio, 3));
    }

    @Override
    public String obterTipoFigura() {
        return "Esfera";
    }
    
    public double calcularDiametro(){
        return (2.0 * raio);
    }
    
    
    
}
