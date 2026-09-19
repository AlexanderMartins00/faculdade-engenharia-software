/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexander
 */
public class Paciente {
    
        //Atributos
        private String nomeCompleto = "";
        private int peso = 0;
        private float altura = 0;
        private String sexo = "";

        public Paciente(String nomeCompleto, int peso, float altura,String sexo) throws Exception{
            
            if(peso <= 0) throw new Exception("O peso nao pode ser <= 0");
            if(altura <= 0) throw new Exception("A altura nao pode ser <= 0");
            
            this.nomeCompleto = nomeCompleto;
            this.peso = peso;
            this.altura = altura;
            this.sexo = sexo;
        }

                
        //Metodos
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) throws Exception {
        if(peso <= 0) throw new Exception("O peso nao pode ser <= 0");
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {
        if(altura <= 0) throw new Exception("A altura nao pode ser <= 0");
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
        
        public float calcularIMC(){
            return (peso/(altura*altura));
            
        }    
    
}
