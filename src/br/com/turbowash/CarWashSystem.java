package br.com.turbowash;

import com.sun.tools.corba.se.idl.constExpr.Or;

import java.util.ArrayList;
import java.util.Scanner;

class CarWashSystem {

    static ArrayList<Person> lista_de_pessoas = new ArrayList<>();
    private static ArrayList<ItemProduto> lista_de_produtos = new ArrayList<>();
    private static ArrayList<ItemServico> lista_de_servicos = new ArrayList<>();
    private static ArrayList<Vehicle> lista_de_veiculos = new ArrayList<>();
    private static ArrayList<Order> lista_de_compras = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    void run() {
        String escolha;
        do {
            System.out.println();
            System.out.println("## CarWash - Menu Principal. Olá, usuário. ##");
            System.out.println("1. Cadastros (pessoas, veículos, itens)");
            System.out.println("2. Movimento vendas (produtos, serviços)");
            System.out.println("3. Financeiro");
            System.out.println("999. Sair do sistema");

            escolha = scanner.nextLine();
            if (escolha.equals("1")) { menuCadastros(); }
            if (escolha.equals("2")) { menuMovimento(); }
            if (escolha.equals("3")) { menuFinanceiro(); }
        } while (!escolha.equals("999"));
    }

    private void menuCadastros() {
        String escolha;
        do {
            System.out.println();
            System.out.println("## CarWash PDV - Menu de Cadastros. ##");
            System.out.println("  1. inserir pessoa");
            System.out.println("  2. listar pessoas");
            System.out.println("  3. inserir itens");
            System.out.println("  4. listar itens");
            System.out.println("  5. inserir veículo");
            System.out.println("  6. listar veículos");
            System.out.println("  99. Voltar ao menu principal");

            escolha = scanner.nextLine();
            if (escolha.equals("1")) { insertPerson(); }
            if (escolha.equals("2")) { listPerson(); }
            if (escolha.equals("3")) { insertItem(); }
            if (escolha.equals("4")) { listItem(); }
            if (escolha.equals("5")) { insertVehicle(); }
            if (escolha.equals("6")) { listVehicles(); }
        } while (!escolha.equals("99"));
    }

    private void insertPerson() {
        System.out.println("  => Inserir Pessoa. Opções:");
        System.out.println("    1. inserir cliente");
        System.out.println("    2. inserir fornecedor");
        System.out.println("    3. inserir empregado");
        System.out.println("    99. voltar");

        String escolha = scanner.nextLine();
        if (escolha.equals("1")) {
            PersonClient novo_cliente = new PersonClient();
            novo_cliente.receivesInput();
            lista_de_pessoas.add(novo_cliente);
        }
        if (escolha.equals("2")) {
            PersonSupplier novo_fornecedor = new PersonSupplier();
            novo_fornecedor.receivesInput();
            lista_de_pessoas.add(novo_fornecedor);
        }
        if (escolha.equals("3")) {
            PersonEmployee novo_empregado = new PersonEmployee();
            novo_empregado.receivesInput();
            lista_de_pessoas.add(novo_empregado);
        }
    }

    public static void listPerson() {
        System.out.println("---- Listagem de Pessoas cadastradas ----");
        for (Person i: lista_de_pessoas
        ) {
            System.out.println("BD ID: " + lista_de_pessoas.indexOf(i));
            i.presentsItself();
            System.out.println();
        }
        System.out.println("---");
    }

    public static void listClients() {
        System.out.println("---- Listagem de Pessoas cadastradas ----");
        for (Person i: lista_de_pessoas
        ) {
            if (i instanceof PersonClient ) {
                System.out.println("BD ID: " + lista_de_pessoas.indexOf(i));
                i.presentsItself();
                System.out.println();
            }
        }
        System.out.println("---");
    }

    private void insertItem() {
        System.out.println("  => Inserir Item. Opções:");
        System.out.println("    1. inserir produto");
        System.out.println("    2. inserir serviço");
        System.out.println("    99. voltar");

        String escolha = scanner.nextLine();
        if (escolha.equals("1")) {
            ItemProduto novo_produto = new ItemProduto();
            novo_produto.insertItem();
            lista_de_produtos.add((novo_produto));
        }

        if (escolha.equals("1")) {
            ItemServico novo_servico = new ItemServico();
            novo_servico.insertItem();
            lista_de_servicos.add((novo_servico));
        }
    }

    private void listProducts() {
        System.out.println("---- Listagem de Produtos cadastrados ----");
        for (Item i: lista_de_produtos
        ) {
            System.out.println("BD ID: " + lista_de_produtos.indexOf(i));
            i.presentsItself();
            System.out.println();
        }
        System.out.println("---");
    }

    private void listServices() {
        System.out.println("---- Listagem de Serviços cadastrados ----");
        for (Item i: lista_de_servicos
        ) {
            System.out.println("BD ID: " + lista_de_servicos.indexOf(i));
            i.presentsItself();
            System.out.println();
        }
        System.out.println("---");
    }

    private void listItem() {
        listProducts();
        listServices();
    }

    private void insertVehicle() {
        if (!lista_de_pessoas.isEmpty()) {
            Vehicle novo_veiculo = new Vehicle();
            novo_veiculo.receivesInput();
            lista_de_veiculos.add(novo_veiculo);
        } else {
            System.out.println("Você precisa cadastrar clientes primeiro.");
        }

    }

    private void listVehicles() {
        System.out.println("---- Listagem de Veículos ----");
        for (Vehicle i: lista_de_veiculos
        ) {
            System.out.println("BD ID: " + lista_de_veiculos.indexOf(i));
            System.out.println(i.toString());
        }
        System.out.println("---");
    }


    private void menuMovimento() {
        String escolha;
        do {
            System.out.println();
            System.out.println("## CarWash PDV - Menu de Movimento. ##");
            System.out.println("  1. Vender produto");
            System.out.println("  2. Vender serviço");
            System.out.println("  3. Listar vendas");
            System.out.println("  99. Voltar ao menu principal");

            escolha = scanner.nextLine();
            if (escolha.equals("1")) { sellProduct(); }
            if (escolha.equals("2")) { sellService(); }
            if (escolha.equals("3")) { listSales(); }
        } while (!escolha.equals("99"));
    }

    private void sellProduct() {
        if (!lista_de_pessoas.isEmpty() && !lista_de_produtos.isEmpty() && !lista_de_veiculos.isEmpty()) {

            listClients();
            System.out.println("Indique o cliente (ID)");
            PersonClient cliente = (PersonClient) lista_de_pessoas.get(Integer.parseInt(scanner.nextLine()));

            listVehicles();
            System.out.println("Indique o veículo (ID)");
            Vehicle veiculo = lista_de_veiculos.get(Integer.parseInt(scanner.nextLine()));

            Order order = new Order(cliente, veiculo);
            lista_de_compras.add(order);

            String escolha;
            do {
                listProducts();
                System.out.println("Indique o produto (ID) -> 99 para finalizar");
                escolha = scanner.nextLine();

                if (escolha.equals("99"))
                    break;

                ItemProduto produto = lista_de_produtos.get(Integer.parseInt(escolha));

                System.out.println("Indique a quantidade");
                escolha = scanner.nextLine();

                for (int i = 0; i < Integer.parseInt(escolha); i++) {
                    order.addItem(produto);
                }
            } while (!escolha.equals("99"));

        } else {
            System.out.println("O sistema ainda não possui pessoas && produtos && veiculos.");
        }
    }

    private void sellService() {
        if (!lista_de_veiculos.isEmpty() && !lista_de_servicos.isEmpty()) {

            listVehicles();
            System.out.println("Indique o veículo (ID)");
            Vehicle veiculo = lista_de_veiculos.get(Integer.parseInt(scanner.nextLine()));

            Order order = new Order(veiculo.getOwner(), veiculo);
            lista_de_compras.add(order);

            String escolha;
            do {
                listServices();
                System.out.println("Indique o serviço  a realizar (ID) -> 99 para finalizar");
                escolha = scanner.nextLine();

                if (escolha.equals("99"))
                    break;

                ItemServico servico = lista_de_servicos.get(Integer.parseInt(escolha));
                order.addItem(servico);

            } while (!escolha.equals("99"));

        } else {
            System.out.println("O sistema ainda não possui veículos && serviços.");
        }
    }

    private void listSales() {
        if (lista_de_compras.isEmpty()) {
            System.out.println("Nenhum movimento de vendas.");
        } else {
            System.out.println("---- Listagem de vendas ----");
            for (Order i: lista_de_compras) {
                System.out.println("VENDA ID(" + lista_de_compras.indexOf(i) + ")");
                System.out.println(i.toString());
            }
            System.out.println("----");
        }
    }

    private void menuFinanceiro() {

    }

    public void addManyStuff() {
//        lista_de_pessoas;
//        lista_de_veiculos
//        lista_de_produtos;
//        lista_de_servicos;
//        lista_de_compras;
        PersonClient cliente = new PersonClient("Luis", "82", "051");
        lista_de_pessoas.add(cliente);
        cliente = new PersonClient("Jose", "83", "132");
        lista_de_pessoas.add(cliente);
        cliente = new PersonClient("Maria", "84", "866");
        lista_de_pessoas.add(cliente);

        PersonSupplier fornecedor = new PersonSupplier("RED", "82", "123-55");
        lista_de_pessoas.add(fornecedor);
        fornecedor = new PersonSupplier("PARTSco", "81", "333/0001-10");
        lista_de_pessoas.add(fornecedor);
        fornecedor = new PersonSupplier("BMW", "87", "201/0001-45");
        lista_de_pessoas.add(fornecedor);

        PersonEmployee empregado = new PersonEmployee("Manoel", "81", "333");
        lista_de_pessoas.add(empregado);
        empregado = new PersonEmployee("Joca", "91", "121");
        lista_de_pessoas.add(empregado);
        empregado = new PersonEmployee("Rubya", "74", "765");
        lista_de_pessoas.add(empregado);

        Vehicle veiculo = new Vehicle(cliente, "MUV-8874", "BMV", "320i");
        lista_de_veiculos.add(veiculo);
        veiculo = new Vehicle(cliente, "QLE-0101", "GM", "Corsa");
        lista_de_veiculos.add(veiculo);
        veiculo = new Vehicle(cliente, "ABC-9999", "CADDY", "Taurus");
        lista_de_veiculos.add(veiculo);

        ItemProduto produto = new ItemProduto("Pneu", "22.30");
        lista_de_produtos.add(produto);
        produto = new ItemProduto("Janela", "14.00");
        lista_de_produtos.add(produto);
        produto = new ItemProduto("Rodas", "333.50");
        lista_de_produtos.add(produto);

        ItemServico servico = new ItemServico("Lavagem Simples", "40.00");
        lista_de_servicos.add(servico);
        servico = new ItemServico("Lavagem Completa", "60.00");
        lista_de_servicos.add(servico);



    }


}
