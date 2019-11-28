
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
1. Adição de Itens 
Um novo ITEM é adicionado ao sistema, pode ser do tipo Produto ou Serviço. Item: nome, preço de venda. Produto: estoque.

2. Remoção de um Item
A remoção de um item só é possível se ele não constar em nenhum movimento.

3. Adição de uma Pessoa 
Uma nova PESSOA é adicionada ao sistema. Pode ser do tipo Cliente (CPF), Fornecedor (CNPJ) ou Empregado (CT). 

4. Remoção de uma Pessoa 
A remoção de pessoa coloca seu status como inativo.

5. Adição de um Veículo
Uma novo veículo é adicionada ao sistema, possui: placa, marca, modelo.

6. Remoção de um Veículo 
A remoção de veículo coloca seu status como inativo.

7. Lançar novo Movimento
O lançamento de movimento permite: lançar uma venda de produtos a um Cliente OU lançar uma venda de serviços a um Veículo.

8. Editar Movimento
A edição de movimento permite adicionar ou remover produtos/serviços de uma venda.

9. Listagem dos Produtos e Serviços

10. Listagem das Pessoas

11. Listagem dos Veículos

12. Exibir movimento
Mostra uma lista do movimento do sistema.

13. Novo lançamento financeiro
O lançamento possui: Data, Título, Conta Origem, Conta Destino e valor.

14. Excluir lançamento financeiro
Mostra os últimos movimentos que podem ser excluídos e exclui um movimento.



.
.
.
.
.



> Written with [StackEdit](https://stackedit.io/).