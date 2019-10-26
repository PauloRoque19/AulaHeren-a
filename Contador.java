/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author lab06usuario11
 */
public class Contador extends Funcionario{
   //Atributos 
   private String cc;
   //construtor
   public Contador(String cc){
       this.cc = cc;
       
   }
   public Contador(){
       
   }
   //gets e sets

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }
   //to String

    @Override
    public String toString() {
        return "Contador{" + "cc=" + cc + '}';
    }
    //metodo
     
}
