
# Welcome to carwash app!

Hi! I'm a CS Grad at **Universidade Federal de Alagoas - UFAL**. My professor, Baldoíno Fonseca, have instructed us to build a simple **Object Oriented** software code in **JAVA**.

## Compiling and running

- javac -d /bin/ src/*.java
- cd bin/
- java Main


## Functionalities:

O objetivo do projeto é construir um sistema de gerenciamento de Lava Jato / Estética Automotiva. O sistema gerencia um banco de dados de produtos, pessoas, veículos, movimento do dia e lançamentos financeiros. 

Os itens no cadastro podem ser produtos físicos ou serviços. Alguns produtos são itens à venda, outros são consumíveis nos serviços ou dia-a-dia. 

As pessoas podem ser Físicas ou Jurídicas, do tipo: Fornecedores, Empregados e Clientes. Empregados têm cartão de ponto. 

Há um cadastro de veículos, identificados pela placa, marca, modelo, cor, ano ~

O movimento do dia é composto pelas vendas de serviços, e movimento de produtos, com entradas de produtos (compras) e saídas de produtos (vendas). No movimento do dia há anotação do veículo, no caso de serviços.

Os lançamentos financeiros podem compreender as receitas das vendas, despesas de compras de produtos ou de itens de uso, contas de consumo, taxas, impostos e salários.

• Movimentos podem ter métodos de pagamento.
• Movimentos utilizam os serviços/produtos cadastrados, cliente e veículo.
• O sistema registra um set de movimentos todo dia. 


### #Funcionalidade - Título / Breve Descrição 
1. Adição de Produtos (item) 
Um novo ITEM é adicionado ao sistema, e pode ser do tipo Produto ou Serviço. Item: id/referência, nome, unidade, preço de venda. Produto: estoque.

2. Remoção de um item
A remoção de um item só é possível se ele não constar em nenhum movimento.

3. Adição de uma pessoa 
Uma nova PESSOA é adicionada ao sistema. Pode ser do tipo Física ou Jurídica (CPF/CNPJ, Nome/Razão Social). Pode ser do tipo Fornecedor, Empregado ou Cliente. Pessoa: id, ddd, telefone, status. Empregado: cargo, salário mensal.

4. Remoção de uma pessoa 
A remoção de pessoa apenas coloca seu status como inativo.

5. Adição de um Veículo
Uma novo veículo é adicionada ao sistema, possui: id/placa, marca, modelo. A placa é única.

6. Remoção de um veículo 
Só é possível se não constar em nenhum movimento.

7. Lançar novo movimento
O lançamento de movimento permite lançar uma venda de serviços ou produtos a um Cliente, relacionado a uma placa de Veículo, feita por um Funcionário, em um determinado dia.

8. Editar movimento
A edição de movimento permite adicionar novos serviços/produtos, remover, modificar o Cliente ou a Placa do Veículo.

9. Listagem dos Produtos
10. Listagem das Pessoas
11. Listagem dos Veículos

12. Exibir movimento do dia
Mostra uma lista de movimentos e pode ser selecionado um dia específico.

13. Novo lançamento financeiro
O lançamento possui: Conta Origem, Conta Destino, Nome do Título, Data do movimento, mês de competência, valor.

14. Excluir lançamento financeiro
Mostra os últimos movimentos que podem ser excluídos

15. Clear
Limpa o terminal


.
.
.
.
.



> Written with [StackEdit](https://stackedit.io/).