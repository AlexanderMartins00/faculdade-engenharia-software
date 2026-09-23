/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexander
 */
public class Cilindro {
    //Atributos
    private float raio = 0;
    private float altura = 0;
    
    //Metodos

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception{
        if(raio <= 0)throw new Exception("O raio nao pode ser <= 0");
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura)throws Exception{
        if(altura <= 0) throw new Exception("A altura nao pode ser <= 0");
        this.altura = altura;
    }
    public float calcularAreaLateral(){
        return(float)(2 * Math.PI* raio * altura);
    
}
    public float calcularAreaTotal(){
        return(float)(2 * Math.PI * raio * (altura + raio));
        
    }
    public float calcularVolume(){
        return(float)(Math.PI * Math.pow(raio, 2) * altura);
        
    }
    
    
}
