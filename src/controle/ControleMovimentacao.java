/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;
import java.util.ArrayList;
import modelos.classes.Movimentacao;
import modelos.interfaces.IMovimentacaoCRUD;
import persistencia.MovimentacaoDAO;

/**
 *
 * @author alexandermartins
 */
public class ControleMovimentacao implements IMovimentacaoCRUD{
    
    private MovimentacaoDAO movimentacaoDAO = new MovimentacaoDAO();
    
    @Override
    public void salvar(Movimentacao movimentacao) throws Exception {
        try {
            Movimentacao obj = movimentacaoDAO.buscarPorId(movimentacao.getIdMovimentacao());

            if (obj != null) {
                throw new Exception("ID da movimentação já existe.");
            }

            if (movimentacao.getIdVeiculo() <= 0) {
                throw new Exception("Veículo inválido.");
            }

            if (movimentacao.getIdDespesa() <= 0) {
                throw new Exception("Despesa inválida.");
            }

            if (movimentacao.getDescricaoDespesa().trim().isEmpty()) {
                throw new Exception("Descrição vazia.");
            }

            if (movimentacao.getValorDespesas()<= 0) {
                throw new Exception("Valor inválido.");
            }

            movimentacaoDAO.salvar(movimentacao);

        } catch (Exception erro) {
            throw erro;
        }
    }
    
    @Override
    public Movimentacao buscarPorId(int idMovimentacao) throws Exception {
        try {
            Movimentacao obj = movimentacaoDAO.buscarPorId(idMovimentacao);

            if (obj == null) {
                throw new Exception("Movimentação não encontrada.");
            }

            return obj;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    @Override
    public void atualizar(Movimentacao movimentacao) throws Exception {
        try {
            Movimentacao obj = movimentacaoDAO.buscarPorId(movimentacao.getIdMovimentacao());

            if (obj == null) {
                throw new Exception("Movimentação não encontrada.");
            }

            if (movimentacao.getDescricaoDespesa().isEmpty()) {
                throw new Exception("Descrição vazia.");
            }

            if (movimentacao.getValorDespesas()<= 0) {
                throw new Exception("Valor inválido.");
            }

            movimentacaoDAO.atualizar(movimentacao);

        } catch (Exception erro) {
            throw erro;
        }
    }
    
    @Override
    public void remover(int idMovimentacao) throws Exception {
        try {
            Movimentacao obj = movimentacaoDAO.buscarPorId(idMovimentacao);

            if (obj == null) {
                throw new Exception("Movimentação não encontrada.");
            }

            movimentacaoDAO.remover(idMovimentacao);

        } catch (Exception erro) {
            throw erro;
        }
    }
    
    @Override
    public ArrayList<Movimentacao> listar() throws Exception {
        try {
            ArrayList<Movimentacao> lista = movimentacaoDAO.listar();

            if (lista == null || lista.isEmpty()) {
                throw new Exception("Nenhuma movimentação cadastrada.");
            }

            return lista;

        } catch (Exception erro) {
            throw erro;
        }
    }
}
