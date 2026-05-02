package SistemaFuncionarios;

public class Departamento {
    private String nomeDepartamento;
    private Funcionario[] funcionario; 
    private int contador;

public Departamento(String nomeDepartamento){
    this.nomeDepartamento = nomeDepartamento;
    this.funcionario = new Funcionario[5];
    this.contador = 0;
}
public void adicionarFuncionario(Funcionario F){
    if(this.contador < 5){
    this.funcionario[this.contador] = F;
    this.contador++; 
    }else{
        System.out.printf("Departamento lotado. Não é possível adicionar mais funcionários.");
    }
}
public void listarFuncionarios(){
    for(int cont = 0; cont < this.contador ; cont++ ){
        this.funcionario[cont].exibirDados();
    }
}
public double calcularFolhaSalarial(){
    double salarioTotal = 0.0;
    for(int cont = 0; cont < this.contador; cont++){
    if(this.funcionario[cont].getAtivo()){
        salarioTotal += this.funcionario[cont].getSalario();
        
    }
   }

   System.out.println("---------------------------------------------");
   System.out.println("Total da folha salarial dos funcionários ativos: "+ salarioTotal);
    
   return salarioTotal;   
 }
}
