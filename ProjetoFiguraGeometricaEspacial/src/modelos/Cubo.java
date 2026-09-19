/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexandermartins
 */
public class Cubo implements IFiguraGeometrica{
    //Atributos
    private double aresta = 0;
    
    //Metodos

    public Cubo() {
    }
    
    public Cubo(double aresta){
        this.aresta = aresta;        
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
    
    public double calcularAreaFace(){
        return Math.pow(aresta, 2);
    }
    
    public double calcularAreaLateral(){
        return (4.0 * Math.pow(aresta, 2));
    }

    @Override
    public double calcularAreaTotal() {
        return (6.0 * Math.pow(aresta, 2));
    }

    @Override
    public double calcularVolume() {
        return Math.pow(aresta, 3);
    }

    @Override
    public String obterTipoFigura() {
        return "Cubo";
    }
    
    
}
