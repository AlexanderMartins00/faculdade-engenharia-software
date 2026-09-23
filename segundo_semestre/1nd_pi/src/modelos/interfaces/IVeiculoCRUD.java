/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos.interfaces;
import java.util.ArrayList;
import modelos.classes.Veiculos;


/**
 *
 * @author alexandermartins
 */
public interface IVeiculoCRUD {
    void salvar(Veiculos veiculo) throws Exception;
    ArrayList<Veiculos> listar() throws Exception;
    Veiculos buscarPorId(int idVeiculo) throws Exception;
    void atualizar(Veiculos veiculo) throws Exception;
    void remover(int idVeiculo) throws Exception;
    
}
