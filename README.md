# SistemaFuncionarios
## Este sistema permite o cadastro e demissão de colaboradores, monitoramento de renda e a listagem completa dos funcionários ativos.
## Tecnologia utilizada ( Java 21.0.10, VScode)

### Passo a passo para compilar e rodar no console:

* Primeiro passo, clone o projeto: Use (git clone https://github.com/isaquefelicio47-creator/SistemaFuncionarios.git)

* Segundo passo, Acesse a pasta raiz do código: (cd SistemaFuncionarios/SistemaFuncionarios)

* Terceiro passo, Compile o projeto: (javac -d bin *.java)

* Quarto passo, Execute a aplicação: (java -cp bin SistemaFuncionarios.TesteSistema)

### Descrição das classes criadas e a responsabilidade de cada uma:

* Funcionario.java: Representa a entidade do colaborador. É responsável por armazenar informações como Nome, CPF, Cargo, Salário e o Status (Ativo/Inativo), além de conter a lógica de exibição dos dados individuais.

* Departamento.java: Atua como o gerenciador do grupo de funcionários. Sua responsabilidade é manter a lista de colaboradores, permitir novas contratações/demissões e realizar o cálculo total da folha de pagamento dos funcionários ativos.

* TesteSistema.java: É a entrada (Main) do programa. Ela administra o fluxo do sistema, cria as instâncias necessárias e exibe os resultados no console para o usuário.

### Nome: 
Isaque Felício Moreira 
### Turma:  
Informática 2º período
