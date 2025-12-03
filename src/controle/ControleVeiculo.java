/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;
import java.util.ArrayList;
import modelos.classes.Veiculos;
import modelos.interfaces.IVeiculoCRUD;
import persistencia.VeiculosDAO;

/**
 *
 * @author alexandermartins
 */
public class ControleVeiculo implements IVeiculoCRUD{
    
    private VeiculosDAO veiculoDAO = new VeiculosDAO(); 

    @Override
    public void salvar(Veiculos veiculo) throws Exception {
        try {
            Veiculos obj = veiculoDAO.buscarPorId(veiculo.getIdVeiculo());
            if (obj != null) {
                throw new Exception("Identificador já existe.");
            }
             if (veiculo.getPlaca().isEmpty()) {
                throw new Exception("Placa vazia.");
            }
             if(veiculo.getPlaca().length()  != 7){
                 throw new Exception("A quantidade de caracteres da placa deve ser igual a 7");
                 
             }
              if (veiculo.getMarca().isEmpty()) {
                throw new Exception("Marca vazia.");
            }
              if (veiculo.getModelo().isEmpty()) {
                throw new Exception("Modelo vazio.");
            }
            if (veiculo.getAnoDeFabricacao() <= 0) {
                throw new Exception("Ano de fabricação inválido.");
            }
            if (veiculo.getStatus() == null) {
                throw new Exception("Status não definido.");
            }
            veiculoDAO.salvar(veiculo);
        } catch (Exception erro) {
            throw erro;
        }
    }
    @Override
    public Veiculos buscarPorId(int idVeiculo) throws Exception {
        try {
        Veiculos obj = veiculoDAO.buscarPorId(idVeiculo);
        if (obj == null) {
            throw new Exception("Veículo não encontrado.");
        }
        return obj;
    } catch (Exception erro) {
        throw erro;
    }
}
    @Override
    public void atualizar(Veiculos veiculo) throws Exception {
        try {
            Veiculos obj = veiculoDAO.buscarPorId(veiculo.getIdVeiculo());
            if (obj == null) {
                throw new Exception("Veículo não encontrado.");
            }
            if (veiculo.getPlaca().isEmpty()) {
                throw new Exception("Placa vazia.");
            }
            if (veiculo.getMarca().isEmpty()) {
                throw new Exception("Marca vazia.");
            }
            if (veiculo.getModelo().isEmpty()) {
                throw new Exception("Modelo vazio.");
            }
            veiculoDAO.atualizar(veiculo);
        } catch (Exception erro) {
            throw erro;
        }
    }
    @Override
    public void remover(int idVeiculo) throws Exception {
        try {
            Veiculos obj = veiculoDAO.buscarPorId(idVeiculo);

            if (obj == null) {
                throw new Exception("Veículo não encontrado.");
            }
            veiculoDAO.remover(idVeiculo);
        } catch (Exception erro) {
            throw erro;
        }
    }
    @Override
    public ArrayList<Veiculos> listar() throws Exception {
        try {
            ArrayList<Veiculos> lista = veiculoDAO.listar();
            if(lista == null || lista.isEmpty()){
                throw new Exception("Nenhum veículo cadastrado");
            }
            return lista;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
}
    

