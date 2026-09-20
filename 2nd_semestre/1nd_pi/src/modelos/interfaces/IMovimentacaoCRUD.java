/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos.interfaces;
import java.util.ArrayList;
import modelos.classes.Movimentacao;

/**
 *
 * @author alexandermartins
 */
public interface IMovimentacaoCRUD {
     void salvar(Movimentacao movimentacao) throws Exception;
    ArrayList<Movimentacao> listar() throws Exception;
    Movimentacao buscarPorId(int idMovimentacao) throws Exception;
    void atualizar(Movimentacao movimentacao) throws Exception;
    void remover(int idMovimentacao) throws Exception;
    
}
