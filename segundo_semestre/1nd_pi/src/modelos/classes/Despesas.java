/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.classes;

import java.util.Objects;

/**
 *
 * @author ezequ
 */
public class Despesas {
    //atributos

    private int idTipoDeDespesa = 0;
    private String descricao = " ";

    //metodos
    public Despesas() {

    }

    public Despesas(int idTipoDeDespesa, String descricao) {
        this.idTipoDeDespesa = idTipoDeDespesa;
        this.descricao = descricao;
    }

    public int getIdTipoDeDespesa() {
        return idTipoDeDespesa;
    }

    public void setIdTipoDeDespesa(int idTipoDeDespesa) {
        this.idTipoDeDespesa = idTipoDeDespesa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "ID: " + idTipoDeDespesa
                +"/" + descricao;
    }
    
    @Override
    public boolean equals (Object o){
        if (this ==o) return true;
        if (o==null || getClass() != o.getClass()) return false;
        Despesas despesas = (Despesas) o;
        return idTipoDeDespesa == despesas.idTipoDeDespesa;
        
        
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(idTipoDeDespesa);
    }
    
//    @Override
//    public String toString(){
//        return 
//    }
    

}
