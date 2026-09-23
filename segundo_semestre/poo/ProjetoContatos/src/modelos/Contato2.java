/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.util.ArrayList;

/**
 *
 * @author alexandermartins
 */
public class Contato2 {
    //Atributos
    private String nome = "";
    private ArrayList<String> email = null;
    private ArrayList<Telefone> fone = null;
    private ArrayList<Endereco> ender = null;
    //Metodos
    public Contato2(){
        email = new ArrayList<>();
        fone = new ArrayList<>();
        ender = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getEmail() {
        return email;
    }

    public void setEmail(ArrayList<String> email) {
        this.email = email;
    }
     public void setEmail(String email){
         this.email.add(nome);         
     }

    public ArrayList<Telefone> getFone() {
        return fone;
    }

    public void setFone(ArrayList<Telefone> fone) {
        this.fone = fone;
    }
    public void setFone(Telefone fone){
        this.fone.add(fone);
    }

    public ArrayList<Endereco> getEnder() {
        return ender;
    }

    public void setEnder(ArrayList<Endereco> ender) {
        this.ender = ender;
    }
    
     public void setEnder(Endereco ender){
         this.ender.add(ender);
     }
    
}
