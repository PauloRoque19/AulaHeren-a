/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class Professor extends Funcionario{
    //Atributos
    private String numeroDeHorasAula;
    private String leciona;
    //Construtor
    public Professor(String numeroDeHorasAula,String leciona){
        
        this.numeroDeHorasAula = numeroDeHorasAula;
        this.leciona = leciona;
    }

    public Professor(String nome, String matricula, String sexo, String dataDeNascimento, int salario) {
        super(nome, matricula, sexo, dataDeNascimento, salario);
    }
    public Professor(){
        
    }    
    //gets e sets
    public String getNumeroDeHorasAula() {
        return numeroDeHorasAula;
    }

    public void setNumeroDeHorasAula(String numeroDeHorasAula) {
        this.numeroDeHorasAula = numeroDeHorasAula;
    }

    public String getLeciona() {
        return leciona;
    }

    public void setLeciona(String leciona) {
        this.leciona = leciona;
    }
    
    //toString
    @Override
    public String toString() {
        return "Professor{" + "numeroDeHorasAula=" + numeroDeHorasAula + ", leciona=" + leciona + '}';
    }
    //Metodos

    

    
}
