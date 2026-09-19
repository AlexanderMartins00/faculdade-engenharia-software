/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexandermartins
 */
public class Cone extends Cilindro{
    //Metodos
    public Cone() {
    }

    public Cone(double raio, double altura) {
        super(raio, altura);
    }
    
    public double calcularGeratriz(){
        return (Math.sqrt(Math.pow(altura, 2) + Math.pow(raio, 2)));
    }
    
    @Override
    public double calcularAreaLateral(){
        return (Math.PI * raio * calcularGeratriz());
    }
    
    @Override
    public double calcularAreaTotal() {
         return (Math.PI * raio * (calcularGeratriz() + raio));
    }
    
    @Override
    public double calcularVolume() {
        return (1.0/3.0 * super.calcularVolume());
    }
    
    @Override
    public String obterTipoFigura() {
        return "Cone";
    }
    
    
}
