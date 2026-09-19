/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexander
 */
public class NNatural {
    //Atributos 
    private long numero = 0;
    
    //Metodos
    
    public NNatural(){}
    
    public NNatural(long numero)throws Exception{
        if(numero <= 0)throw new Exception("O numero nao pode ser <= 0");
        this.numero = numero;
    
    }
    public NNatural(NNatural objeto){
        numero = objeto.numero;
        
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) throws Exception{
        if(numero <= 0)throw new Exception("O numero nao pode ser <= 0");
        this.numero = numero;
    }
    
    public NNatural calcularFatorial()throws Exception{
        long fat = 1;
        
        for(long aux = numero; aux > 0; aux--) fat *= aux;
        
        NNatural resultado = new NNatural(fat);
        return resultado;        
    }
    public boolean eNumeroPerfeito(){
        long soma = 0;
                
        for(long aux = numero/2; aux > 0; aux--)if(numero % aux == 0)soma += aux;                       
        
        if(soma == numero)return true;
        return false;         
    }
    public boolean eNumeroPrimo(){
        int contador = 0;
        
        for(long aux = (long)Math.sqrt(numero); aux > 0; aux--){            
            if(numero % aux == 0)return false;
            return true;
        }
    
    }
    
    
}
