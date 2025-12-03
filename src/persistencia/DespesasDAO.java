/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;
import java.util.ArrayList;
import modelos.classes.Despesas;
import modelos.interfaces.IDespesasCRUD;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
        


/**
 *
 * @author ezequ
 */
public class DespesasDAO implements IDespesasCRUD{
    
    private String nomeDoArquivoNodisco = null;
    
    public DespesasDAO(){
        nomeDoArquivoNodisco = "./src/bancodedados/TiposDeDespesas.txt";
    }
    

    @Override
    public void salvar(Despesas tipoDeDespesa) throws Exception {
        try {
            //cria
            FileWriter fw = new FileWriter (nomeDoArquivoNodisco, true);
            //melhora
            BufferedWriter bw = new BufferedWriter (fw); 
            //escreve 
            String str = tipoDeDespesa.getIdTipoDeDespesa() + ";";
            str += tipoDeDespesa.getDescricao() + "\n";
            bw.write(str);
            //feha
            bw.close();
        } catch (Exception erro) {
            String mensagem = "Erro na Persistência - Salvar - " + erro.getMessage();
            throw new Exception(mensagem);
        }
    }

    @Override
    public ArrayList<Despesas> listaDeTipoDasDespesas() throws Exception {
        try {
            ArrayList<Despesas>listaDeTipoDasDespesas = new ArrayList<>();
            
            FileReader fr = new FileReader(nomeDoArquivoNodisco);
            BufferedReader br = new BufferedReader(fr);
            
            String linha = " ";
            while ((linha= br.readLine()) !=null){
                String vetorStr[] = linha.split(";");
                Despesas objDespesa = null;
                int idTipoDeDespesaAux = Integer.parseInt(vetorStr[0]);
                String descricao = vetorStr[1];
                objDespesa = new Despesas (idTipoDeDespesaAux,descricao);
                listaDeTipoDasDespesas.add(objDespesa);
                
                
            }
            br.close();
            return listaDeTipoDasDespesas;
        } catch (Exception e) {
            String mensagem = "Erro na Persistência - Listar - " +e.getMessage();
            throw new Exception(mensagem);
        }
    }

    @Override
    public Despesas buscarID(int idTipoDeDespesa) throws Exception {
        try{
      //abrir um arquivo existente
      FileReader fr = new FileReader(nomeDoArquivoNodisco);
      //Criar o buffer do arquivo
      BufferedReader br  = new BufferedReader(fr);
      String linha = "";
      while((linha=br.readLine())!=null){
        String vetorStr[] = linha.split(";");
        int idTipoDeDespesaAux = Integer.parseInt(vetorStr[0]);
        if(idTipoDeDespesaAux == idTipoDeDespesa){
          String descricao = vetorStr[1];
          Despesas objTipoDeDespesa = null;
          objTipoDeDespesa = new Despesas(idTipoDeDespesaAux,descricao);
          br.close();
          return objTipoDeDespesa;
        }
      }
      br.close();
      return null;
    }catch(Exception erro){
      String msg = "Erro na Persistencia - Buscar - "+erro.getMessage();
      throw new Exception(msg);
    }   

    }

    @Override
    public void atualizar(Despesas tipoDeDespesa) throws Exception {
        try {
      ArrayList<Despesas> listagem = null;
      listagem = this.listaDeTipoDasDespesas();
      //cria o arquivo
      FileWriter fw = new FileWriter(nomeDoArquivoNodisco);
      //Criar o buffer do arquivo
      BufferedWriter bw = new BufferedWriter(fw);
      for(Despesas obj : listagem){
        if(obj.getIdTipoDeDespesa() == tipoDeDespesa.getIdTipoDeDespesa()){
          String str = tipoDeDespesa.getIdTipoDeDespesa() + ";";
          str += tipoDeDespesa.getDescricao() + "\n";
          bw.write(str);
        }else{
          String str = obj.getIdTipoDeDespesa() + ";";
          str += obj.getDescricao() + "\n";
          bw.write(str);
        }
      }
      bw.close();
    }catch(Exception erro){
      String msg = "erro na Persistência - Metodo Atualizar - " + erro.getMessage();
      
    } 
    }

    @Override
    public void excluir(int idTipoDeDespesas) throws Exception {
        try {
      ArrayList<Despesas> listagem = null;
      listagem = this.listaDeTipoDasDespesas();
      //cria o arquivo
      FileWriter fw = new FileWriter(nomeDoArquivoNodisco);
      //Criar o buffer do arquivo
      BufferedWriter bw =new BufferedWriter(fw);
      for(Despesas obj : listagem){
        if(obj.getIdTipoDeDespesa() != idTipoDeDespesas){
          String str = obj.getIdTipoDeDespesa() + ";";
          str += obj.getDescricao() + "\n";
          bw.write(str);
        }
      }
      bw.close();
    }catch(Exception erro){
      String msg = "Erro na Persistência - Remover - "+erro.getMessage();
      throw new Exception(msg);
    } 
    }
    
    
}
