/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexandermartins
 */
public class Conjunto {
    //Atributos
    private int tamanho = 0;
    private int indeceDeUso = 0;
    private int[] array = null;
    
    //Metodos
    public Conjunto(int tamanho)throws Exception{
        if(tamanho < 0) throw new Exception("O Tamanho nao pode ser < 0");
        array = new int[tamanho];
        this.tamanho = tamanho;
        indeceDeUso = 0;
        
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getIndeceDeUso() {
        return indeceDeUso;
    }
    
    public void incluir(int elemento)throws Exception{
        if(tamanho == indeceDeUso)throw new Exception("Conjunto esta XXeio");           
        if(buscar(elemento)) throw new Exception("O Elemento Ja Existe");
        array[indeceDeUso] = elemento;
        indeceDeUso++;
        
    }
    
    private boolean buscar(int elemento){
        for(int pos = 0; pos < indeceDeUso; pos++){
            if(array[pos] == elemento) return true;            
        }
        return false;
    }
    
    public String obterDadosDoArray(){
        String str = "";
        
        for(int pos = 0; pos < indeceDeUso; pos++){
            str += array[pos] + " | ";
        }
        return str;
    }
    
    public Conjunto gerarUniao(Conjunto obj)throws Exception{
        
        int tam = this.indeceDeUso + obj.indeceDeUso; // obj Conjunto B
        Conjunto aux = new Conjunto(tam);
        for(int pos = 0; pos < this.indeceDeUso; pos++){ //this = Conjunto A
            aux.array[pos] = this.array[pos];
        }
        aux.indeceDeUso = this.indeceDeUso;
        
        for(int pos = 0; pos < obj.indeceDeUso; pos++){
            try {
                 aux.incluir(obj.array[pos]);
            } catch (Exception erro) {
            }           
        }
        return aux;
    }
    
    public Conjunto gerarInterseccao(Conjunto obj)throws Exception{
        
        int tam = indeceDeUso;
        
        if(tam > obj.indeceDeUso) tam = obj.indeceDeUso;
        
        Conjunto aux = new Conjunto(tamanho);
        
        for(int pos = 0; pos < indeceDeUso; pos++){
            if(obj.buscar(array[pos])){
                aux.array[aux.indeceDeUso] = array[pos];
                aux.indeceDeUso++;
            }
        }
        return aux;        
    }
    
}
