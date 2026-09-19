/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexander
 */
public class Esfera {
    //Atributos
    private float raio = 0;
    
    //Metodos

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception{
        if(raio <= 0) throw new Exception("O raio nao pode ser <= 0");
        this.raio = raio;
    }
    
    
    public float calcularArea(){
        return((float)(4.0 * Math.PI * Math.pow(raio, 2)));
    }
    public float calcularVolume(){
        return((float)((4.0/3.0) * Math.PI * Math.pow(raio, 3)));
    }
    
    
    
}
