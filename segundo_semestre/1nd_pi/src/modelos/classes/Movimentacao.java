/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.classes;

/**
 *
 * @author alexandermartins
 */
public class Movimentacao {

    //Atributos
    private int idMovimentacao = 0;
    private int idVeiculo = 0;
    private int idDespesa = 0;
    private String placaVeiculo = "";
    private String descricaoDespesa = "";
    private double valorDespesas = 0;
    private String data = "";
    //Metodos

    public Movimentacao() {
    }

    public Movimentacao(int idMovimentacao, int idVeiculo, int idDespesa,
            String placaVeiculo, String descricaoDespesa, double valorDespesas, String data) {

        this.idMovimentacao = idMovimentacao;
        this.idVeiculo = idVeiculo;
        this.idDespesa = idDespesa;
        this.placaVeiculo = placaVeiculo;
        this.descricaoDespesa = descricaoDespesa;
        this.valorDespesas = valorDespesas;
        this.data = data;
    }

    public int getIdMovimentacao() {
        return idMovimentacao;
    }

    public void setIdMovimentacao(int idMovimentacao) {
        this.idMovimentacao = idMovimentacao;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public int getIdDespesa() {
        return idDespesa;
    }

    public void setIdDespesa(int idDespesa) {
        this.idDespesa = idDespesa;
    }

    public double getValorDespesas() {
        return valorDespesas;
    }

    public void setValorDespesas(double valorDespesas) {
        this.valorDespesas = valorDespesas;
    }

    public String getDescricaoDespesa() {
        return descricaoDespesa;
    }

    public void setDescricaoDespesa(String descricaoDespesa) {
        this.descricaoDespesa = descricaoDespesa;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Movimentacao{" + "idMovimentacao=" + idMovimentacao + ", idVeiculo=" + idVeiculo + ", idDespesa=" + idDespesa + ", placaVeiculo=" + placaVeiculo + ", descricaoDespesa=" + descricaoDespesa + ", valorDespesas=" + valorDespesas + ", data=" + data + '}';
    }
    
    
}
