/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alexandermartins
 */
public class Estudante extends Pessoa{
    
    //Atributo
    protected String matricula = "";
    protected String curso = "";
    protected String campus = "";
    

    public Estudante() {
    }

    public Estudante(String nome, String endereco, String telefone, String email,
            String matricula, String curso, String campus) {
        super(nome, endereco, telefone, email);
        this.matricula = matricula;
        this.curso = curso;
        this.campus = campus;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\nEstudante: " + "matricula = " + matricula + ",\n curso = " + curso + 
                ", campus = " + campus;
    }
    
    
    
    
}
