/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;
import java.util.ArrayList;
import modelos.enumeracoes.StatusVeiculo;
import modelos.classes.Veiculos;
import modelos.interfaces.IVeiculoCRUD;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author alexandermartins
 */
public class VeiculosDAO implements IVeiculoCRUD{
    
     //Atributos
    private String nomeDoArquivoNoDisco = null;
    
    public VeiculosDAO(){
        nomeDoArquivoNoDisco = "./src/bancodedados/Veiculos.txt";
    }

    @Override
    public void salvar(Veiculos veiculo) throws Exception {
        try {
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            String str = veiculo.getIdVeiculo() + ";";
            str += veiculo.getPlaca() + ";";
            str += veiculo.getMarca() + ";";
            str += veiculo.getModelo() + ";";
            str += veiculo.getAnoDeFabricacao() + ";";
            str += veiculo.getStatus().name() + "\n";

            bw.write(str);
            bw.close();
            
        } catch (Exception erro) {
            String msg = "Persistencia - Metodo Salvar - " + erro.getMessage();
            throw new Exception(msg);
        }
    }
    @Override
    public ArrayList<Veiculos> listar() throws Exception {
        try {
            ArrayList<Veiculos> lista = new ArrayList<>();

            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";
            while ((linha = br.readLine()) != null) {
                String vetorStr[] = linha.split(";");
                
                int id = Integer.parseInt(vetorStr[0]);
                String placa = vetorStr[1];
                String marca = vetorStr[2];
                String modelo = vetorStr[3];
                int ano = Integer.parseInt(vetorStr[4]);
                StatusVeiculo status = StatusVeiculo.valueOf(vetorStr[5]);

                Veiculos v = new Veiculos(id, placa, marca, modelo, ano, status);
                lista.add(v);
            }
            br.close();
            return lista;
        } catch (Exception erro) {
            String msg = "Persistencia - Metodo Listar - " + erro.getMessage();
            throw new Exception(msg);
        }
    }
    @Override
    public Veiculos buscarPorId(int idVeiculo) throws Exception {
        try {
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";
            while ((linha = br.readLine()) != null) {
                String vetorStr[] = linha.split(";");

                int idVeiculoAux = Integer.parseInt(vetorStr[0]);
                if (idVeiculoAux == idVeiculo) {

                    String placa = vetorStr[1];
                    String marca = vetorStr[2];
                    String modelo = vetorStr[3];
                    int ano = Integer.parseInt(vetorStr[4]);
                    StatusVeiculo status = StatusVeiculo.valueOf(vetorStr[5]);

                    Veiculos v = new Veiculos(idVeiculoAux, placa, marca, modelo, ano, status);
                    
                    br.close();
                    return v;
                }
            }
            br.close();
            return null;
            
        } catch (Exception erro) {
            String msg = "Persistencia - Metodo Buscar - " + erro.getMessage();
            throw new Exception(msg);
        }
    }
    @Override
    public void atualizar(Veiculos veiculo) throws Exception {
        try {
            ArrayList<Veiculos> listagem = this.listar();

            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Veiculos obj : listagem) {
                if (obj.getIdVeiculo() == veiculo.getIdVeiculo()) {
                    String str = veiculo.getIdVeiculo() + ";";
                    str += veiculo.getPlaca() + ";";
                    str += veiculo.getMarca() + ";";
                    str += veiculo.getModelo() + ";";
                    str += veiculo.getAnoDeFabricacao() + ";";
                    str += veiculo.getStatus().name() + "\n";
                    bw.write(str);
                } else {
                    String str = obj.getIdVeiculo() + ";";
                    str += obj.getPlaca() + ";";
                    str += obj.getMarca() + ";";
                    str += obj.getModelo() + ";";
                    str += obj.getAnoDeFabricacao() + ";";
                    str += obj.getStatus().name() + "\n";
                    bw.write(str);
                }
            }
            bw.close();
        } catch (Exception erro) {
            String msg = "Persistencia - Metodo Atualizar - " + erro.getMessage();
            throw new Exception(msg);
        }
    }

    @Override
    public void remover(int idVeiculo) throws Exception {
        try {
            ArrayList<Veiculos> listagem = this.listar();

            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Veiculos obj : listagem) {
                if (obj.getIdVeiculo() != idVeiculo) {
                    String str = obj.getIdVeiculo() + ";";
                    str += obj.getPlaca() + ";";
                    str += obj.getMarca() + ";";
                    str += obj.getModelo() + ";";
                    str += obj.getAnoDeFabricacao() + ";";
                    str += obj.getStatus().name() + "\n";
                    bw.write(str);
                }
            }
            bw.close();
        } catch (Exception erro) {
            String msg = "Persistencia - Metodo Remover - " + erro.getMessage();
            throw new Exception(msg);
        }
    }
    
}
