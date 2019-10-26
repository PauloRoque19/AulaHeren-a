
package modelo;


public class Funcionario {
    //atritubos
    private String nome;
    private String matricula;
    private String sexo;
    private String dataDeNascimento;
    private int salario;
    
    //construtor
    public Funcionario(String nome, String matricula, String sexo, String dataDeNascimento,int salario){
        this.nome = nome;
        this.matricula = matricula;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
        this.salario = salario;
    }
    public Funcionario(){
        
    }
    //gets e sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    //to String
    @Override
    public String toString(){
        return "Funcionario{" + "nome=" + nome + ", matricula=" + matricula + ", sexo=" + sexo + ", dataDeNascimento=" + dataDeNascimento + '}';
        
    }

    //Metodos
    public int recebeSalario() {
        return salario = salario + 998;
    }
}
