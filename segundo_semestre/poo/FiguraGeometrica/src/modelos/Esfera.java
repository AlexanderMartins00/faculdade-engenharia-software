/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexandermartins
 */
 public class Esfera extends FiguraGeometrica{

    //Metodos
    public Esfera() {
    }

    public Esfera(double raio) {
        super(raio);
    }
    
    @Override
    public double calcularAreaTotal() {        
        
        return (4.0 * Math.PI * Math.pow(raio, 2));        
    }
    @Override
    public double calcularVolume(){

        return ((4.0/3.0) * Math.PI * Math.pow(raio, 3));
    }

    @Override
    public String obterTipoFigura() {
        return("Esfera");
    }    
}
