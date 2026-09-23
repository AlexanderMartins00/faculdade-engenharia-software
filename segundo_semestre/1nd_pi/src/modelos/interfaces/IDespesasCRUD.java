/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos.interfaces;
import modelos.classes.Despesas;
import java.util.ArrayList;
/**
 *
 * @author ezequ
 */
public interface IDespesasCRUD {
    void salvar (Despesas tipoDeDespesa) throws Exception;
    ArrayList<Despesas>listaDeTipoDasDespesas() throws Exception;
    Despesas buscarID (int idTipoDeDespesa) throws Exception;
    void atualizar (Despesas tipoDeDespesa) throws Exception;
    void excluir (int idTipoDeDespesas) throws Exception;
}
