/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Coordenador extends Professor {
    //Atributos
    String cargo;
    String turma;
    //contrutor
    public Coordenador(String cargo,String turma){
        this.cargo = cargo;
        this.turma = turma;
    }
    //gets e sets
    
    //to String
    
    //metodos

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}
