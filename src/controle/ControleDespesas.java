package controle;

import java.util.ArrayList;
import modelos.interfaces.IDespesasCRUD;
import modelos.classes.Despesas;
import persistencia.DespesasDAO;

public class ControleDespesas implements IDespesasCRUD {
    //Atributo
    private IDespesasCRUD despesasPersistencia;
    //Metodos
    public ControleDespesas() {
        this.despesasPersistencia = new DespesasDAO();
    }    

 

    @Override
    public void salvar(Despesas despesas) throws Exception {
        
        if (despesas.getIdTipoDeDespesa() <= 0) {
            throw new Exception("O ID da despesa deve ser maior que zero.");
        }
        if (despesas.getDescricao() == null || despesas.getDescricao().equals("")) {
            throw new Exception("A descrição da despesa não pode estar vazia.");
        }       
       
        Despesas despesaExistente = despesasPersistencia.buscarID(despesas.getIdTipoDeDespesa());
        if (despesaExistente != null) {
             throw new Exception("Já existe uma despesa cadastrada com este ID.");
        }
        despesasPersistencia.salvar(despesas);
    }        
    
    @Override
    public ArrayList<Despesas> listaDeTipoDasDespesas() throws Exception {
        
       
        ArrayList<Despesas> listaDoArquivo = despesasPersistencia.listaDeTipoDasDespesas();
        
        if (listaDoArquivo.isEmpty()) {
            throw new Exception("Nenhuma despesa cadastrada.");
        }
        
        return listaDoArquivo;
    }

    @Override
    public Despesas buscarID(int idTipoDeDespesa) throws Exception {
        
        Despesas despesaBuscada = despesasPersistencia.buscarID(idTipoDeDespesa);
        
        if(despesaBuscada == null){
            throw new Exception("Despesa não encontrada.");
        }
        return despesaBuscada;
    }

    @Override
    public void atualizar(Despesas tipoDeDespesa) throws Exception {
        
        // Validação de Existência
        Despesas despesaExistente = despesasPersistencia.buscarID(tipoDeDespesa.getIdTipoDeDespesa());
                
        if (despesaExistente == null) {
            throw new Exception("Despesa não encontrada para atualização.");
        }
    
        if (tipoDeDespesa.getDescricao() == null || tipoDeDespesa.getDescricao().equals("")) {
            throw new Exception("Descrição da despesa vazia.");
        }
        if (tipoDeDespesa.getDescricao().length() < 3) {
            throw new Exception("A descrição deve ter pelo menos 3 caracteres.");
        }
                
        despesasPersistencia.atualizar(tipoDeDespesa);            
        
    }

    @Override
    public void excluir(int idTipoDeDespesa) throws Exception {
     Despesas despesaExistente = despesasPersistencia.buscarID(idTipoDeDespesa);
        if (despesaExistente == null) {
            throw new Exception("Despesa não encontrada para exclusão.");
        }
        
        // Persistência: Delega a responsabilidade de excluir do arquivo para o DAO
        despesasPersistencia.excluir(idTipoDeDespesa);
    }    
}