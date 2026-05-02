package SistemaFuncionarios;
    public class Funcionario{
        private String nome, cpf, cargo;
        private double salario;
        private boolean ativo;

    public Funcionario(String nome, String cpf, String cargo, double salario, boolean ativo){
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
        this.ativo = ativo;
    }
    public Funcionario(){
        nome = "Valdernir";
        cpf = "222 11 333-44";
        cargo = "faxineiro";
        salario = 100.0;
        ativo = false;
    }
    public void alterarDados(String nome, String cpf, String cargo, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }
    public void aplicarReajuste(double percentual){
        this.salario += this.salario * (percentual / 100);
        
    }
    public void demitir(){
        this.ativo = false;
    }
    public void exibirDados(){
       String ATIVO = (this.ativo) ? "ATIVO" : "INATIVO";
    System.out.println("-----------------Funcionario-----------------");
    System.out.println("Nome: "+ nome);
    System.out.println("cpf: "+ cpf);
    System.out.println("cargo: "+ cargo);
    System.out.println("salario: "+ salario);
    System.out.println(""+ ATIVO);
    }
    

    public double getSalario(){
        return salario;
    }
    public boolean getAtivo(){
        return ativo;
    }
}
