/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexander
 */
public class Cone {
    //Atributos
    private float raio = 0;
    private float altura = 0;
    
    //Metodos
    public float calcularGeratriz(){
        return(float)(Math.sqrt(Math.pow(altura, 2) + Math.pow(raio, 2)));
    }
    public float calcularAreaLateral(){
        return(float)(Math.PI * raio * calcularGeratriz());        
    }
    public float calcularAreaTotal(){
        return(float)(Math.PI * raio * (calcularGeratriz() + raio));        
    }
    public float calcularVolume(){
        return(float)((1.0/3.0) * Math.PI * Math.pow(raio, 2) * altura);        
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception{
        if(raio <= 0) throw new Exception("O valor do Raio nao pode ser <= 0");
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception{
        if(altura <= 0)throw new Exception("O valor da Altura nao pode ser <= 0");
        this.altura = altura;
    }
    
    
}
