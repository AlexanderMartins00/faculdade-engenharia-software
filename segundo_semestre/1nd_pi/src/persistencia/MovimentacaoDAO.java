/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import modelos.classes.Movimentacao;
import modelos.interfaces.IMovimentacaoCRUD;

/**
 *
 * @author alexandermartins
 */
public class MovimentacaoDAO implements IMovimentacaoCRUD {

    private String nomeDoArquivoNoDisco = "./src/bancodedados/Movimentacoes.txt";

    public void salvar(Movimentacao mov) throws Exception {
        try {
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);

            String str = mov.getIdMovimentacao() + ";";
            str += mov.getIdVeiculo() + ";";
            str += mov.getIdDespesa() + ";";
            str += mov.getPlacaVeiculo() + ";";
            str += mov.getDescricaoDespesa() + ";";
            str += mov.getValorDespesas() + ";";
            str += mov.getData() + "\n";

            bw.write(str);
            bw.close();

        } catch (Exception erro) {
            String msg = "Erro na persistencia - Metodo Salvar - " + erro.getMessage();
            throw new Exception(msg);
        }
    }

    public ArrayList<Movimentacao> listar() throws Exception {
        try {
            ArrayList<Movimentacao> lista = new ArrayList<>();

            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";
            while ((linha = br.readLine()) != null) {

                String vetor[] = linha.split(";");

                int idMov = Integer.parseInt(vetor[0]);
                int idVeiculo = Integer.parseInt(vetor[1]);
                int idDespesa = Integer.parseInt(vetor[2]);
                String placa = vetor[3];
                String descricao = vetor[4];
                double valor = Double.parseDouble(vetor[5]);
                String data = vetor[6];

                Movimentacao mov = new Movimentacao(
                        idMov, idVeiculo, idDespesa,
                        placa, descricao, valor, data
                );

                lista.add(mov);
            }

            br.close();
            return lista;

        } catch (Exception erro) {
            String msg = "Erro na Persistencia - Metodo Listar Movimentações - " + erro.getMessage();
            throw new Exception(msg);
        }
    }

    public Movimentacao buscarPorId(int idMovimentacao) throws Exception {
        try {

            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";
            while ((linha = br.readLine()) != null) {

                String vetor[] = linha.split(";");
                int idAux = Integer.parseInt(vetor[0]);

                if (idAux == idMovimentacao) {

                    int idVeiculo = Integer.parseInt(vetor[1]);
                    int idDespesa = Integer.parseInt(vetor[2]);
                    String placa = vetor[3];
                    String descricao = vetor[4];
                    double valor = Double.parseDouble(vetor[5]);
                    String data = vetor[6];

                    Movimentacao mov = new Movimentacao(idAux, idVeiculo, idDespesa, placa, descricao, valor, data);
                    System.out.println(mov.toString());

                    br.close();
                    return mov;
                }
            }
            br.close();
            
            return null;

        } catch (Exception erro) {
            String msg = "Erro na Persistencia - Metodo Buscar2 Movimentação - " + erro.getMessage();
            throw new Exception(msg);
        }
    }

    public void atualizar(Movimentacao mov) throws Exception {
        try {

            ArrayList<Movimentacao> lista = this.listar();

            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Movimentacao obj : lista) {
                if (obj.getIdMovimentacao() == mov.getIdMovimentacao()) {

                    String str = mov.getIdMovimentacao() + ";";
                    str += mov.getIdVeiculo() + ";";
                    str += mov.getIdDespesa() + ";";
                    str += mov.getPlacaVeiculo() + ";";
                    str += mov.getDescricaoDespesa() + ";";
                    str += mov.getValorDespesas() + ";";
                    str += mov.getData() + "\n";
                    bw.write(str);
                } else {
                    String str = obj.getIdMovimentacao() + ";";
                    str += obj.getIdVeiculo() + ";";
                    str += obj.getIdDespesa() + ";";
                    str += obj.getPlacaVeiculo() + ";";
                    str += obj.getDescricaoDespesa() + ";";
                    str += obj.getValorDespesas() + ";";
                    str += obj.getData() + "\n";
                    bw.write(str);
                }
            }

            bw.close();
        } catch (Exception e) {
            String msg = "Erro ao atualizar o movimento: " + e.getMessage();
            throw new Exception(msg);
        }
    }

    public void remover(int idMovimentacao) throws Exception {
        try {
            ArrayList<Movimentacao> lista = this.listar();

            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Movimentacao obj : lista) {

                if (obj.getIdMovimentacao() != idMovimentacao) {

                    String str = obj.getIdMovimentacao() + ";";
                    str += obj.getIdVeiculo() + ";";
                    str += obj.getIdDespesa() + ";";
                    str += obj.getPlacaVeiculo() + ";";
                    str += obj.getDescricaoDespesa() + ";";
                    str += obj.getValorDespesas() + ";";
                    str += obj.getData() + "\n";

                    bw.write(str);
                }
            }

            bw.close();

        } catch (Exception erro) {
            String msg = "Persistencia - Metodo Remover Movimentação - " + erro.getMessage();
            throw new Exception(msg);
        }
    }

}
