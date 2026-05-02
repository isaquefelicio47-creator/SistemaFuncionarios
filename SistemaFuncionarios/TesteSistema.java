package SistemaFuncionarios;
public class TesteSistema{
    public static void main(String[] args){
       Departamento D;
       Funcionario F;
        D = new Departamento("Tecnologia da Informação");
        F = new Funcionario();
        
        Funcionario f1 = new Funcionario("Luiz Vitão", "544 000 212-55", "doJob",1000,  true);
        Funcionario f2 = new Funcionario("Tomas Turbando", "888 253 785-05", "Ator",5500,  false);
        Funcionario f3 = new Funcionario("Luciano Gonçalves", "436 182 771-32", "C.O",20500,  true);
        Funcionario f4 = new Funcionario();
       
         D.adicionarFuncionario(f1);
         D.adicionarFuncionario(f2);
         D.adicionarFuncionario(f3);
         D.adicionarFuncionario(f4);

       f2.alterarDados("Domer", "333 523 273-42","Segurança", 3000);
       f1.aplicarReajuste(15.0);
       f3.demitir(); 
       D.listarFuncionarios();
       D.calcularFolhaSalarial();
    }
}