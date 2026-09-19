/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexandermartins
 */
abstract public class FiguraGeometrica {
    //Atributo
    protected double raio = 0;
    
    //metodos

    public FiguraGeometrica() {
    }
    
    public FiguraGeometrica(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    abstract public double calcularAreaTotal();
    abstract public double calcularVolume();
    abstract public String obterTipoFigura();
    
}