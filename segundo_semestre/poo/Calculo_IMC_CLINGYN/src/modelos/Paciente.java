/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import javax.swing.JComboBox;

/**
 *
 * @author alexander
 */
public class Paciente {
    private String nomeCompleto = "";
    private float peso = 0;
    private float altura = 0;
    private String sexo = "";
    
public Paciente(String nomeCompleto, float peso, float altura, String sexo)throws Exception{
    
    if(peso <= 0)throw new Exception("O valor do peso nao pode ser <= 0");
    if(altura <= 0)throw new Exception("O valor do peso nao pode ser <= 0");
    
    this.nomeCompleto = nomeCompleto;
    this.peso = peso;
    this.altura = altura;
    this.sexo = sexo;
}
    
    public float calcularIMC(){        
        return(float)(peso/(altura*altura));  
    }
    
    public String calcularFaixaRisco(){
        
        float imc = calcularIMC();        
        if(imc < 20)return("Abaixo do peso ideal"); 
        if(imc <= 25)return("Peso normal");        
        if(imc <= 30)return("Excesso de peso");        
        if(imc <= 35)return("Obesidade");        
        return("Obesidade Morbida");
                
    }
    public float calcularPesoIdeal(){
        if(sexo.equalsIgnoreCase("masculino"))return(float)(72.7 * altura) - 58;
        
       return(float)((62.1 * altura) - 44.7);               
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) throws Exception{
        if(peso <= 0)throw new Exception("O valor do peso nao pode ser <= 0");
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception{
        if(altura <= 0)throw new Exception("O valor do peso nao pode ser <= 0");
        this.altura = altura;
    }
    
    
}
