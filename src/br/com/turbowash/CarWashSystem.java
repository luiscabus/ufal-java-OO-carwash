package br.com.turbowash;

import java.util.ArrayList;
import java.util.Scanner;

class CarWashSystem {

    static ArrayList<Person> personsArrayList = new ArrayList<>();
    private static ArrayList<ItemProduto> productsArrayList = new ArrayList<>();
    private static ArrayList<ItemServico> servicesArrayList = new ArrayList<>();
    private static ArrayList<Vehicle> vehiclesArrayList = new ArrayList<>();
    private static ArrayList<Order> ordersArrayList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    void run() {
        String escolha;
        do {
            System.out.println();
            System.out.println("## CarWash - Menu Principal. Olá, usuário. ##");
            System.out.println("1. Cadastros (pessoas, veículos, itens)");
            System.out.println("2. Movimento vendas (produtos, serviços)");
            System.out.println("3. Financeiro");
            System.out.println("4. Cadastros Remoção (pessoas, veículos, itens)");
            System.out.println("999. Sair do sistema");

            escolha = scanner.nextLine();
            if (escolha.equals("1")) { menuCadastros(); }
            if (escolha.equals("2")) { menuMovimento(); }
            if (escolha.equals("3")) { menuFinanceiro(); }
            if (escolha.equals("4")) { menuCadastrosRemocao(); }
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

    private void menuCadastrosRemocao() {
        String escolha;
        do {
            System.out.println();
            System.out.println("## CarWash PDV - Menu de Remoção de Cadastros. ##");
            System.out.println("  1. remover pessoa");
            System.out.println("  2. remover serviço");
            System.out.println("  3. remover produto");
            System.out.println("  4. remover veículo");
            System.out.println("  99. Voltar ao menu principal");

            escolha = scanner.nextLine();
            if (escolha.equals("1")) { removePerson(); }
            if (escolha.equals("2")) { removeService(); }
            if (escolha.equals("3")) { removeProduct(); }
            if (escolha.equals("4")) { removeVehicle(); }
        } while (!escolha.equals("99"));
    }

    private void removePerson() {
        listPerson();
        System.out.println("Indique a pessoa que será removida (desativada)");
        String escolha = scanner.nextLine();
        Person pessoa = personsArrayList.get(Integer.parseInt(escolha));
        pessoa.deactivate();
    }

    private void removeService() {
        listServices();
        System.out.println("Indique o serviço que será removido (desativada)");
        String escolha = scanner.nextLine();
        ItemServico servico = servicesArrayList.get(Integer.parseInt(escolha));
        servico.deactivate();
    }

    private void removeProduct() {
        listProducts();
        System.out.println("Indique o produto que será removido (desativada)");
        String escolha = scanner.nextLine();
        ItemProduto produto = productsArrayList.get(Integer.parseInt(escolha));
        produto.deactivate();
    }

    private void removeVehicle() {
        listVehicles();
        System.out.println("Indique o veículo que será removido (desativada)");
        String escolha = scanner.nextLine();
        Vehicle veiculo = vehiclesArrayList.get(Integer.parseInt(escolha));
        veiculo.deactivate();
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
            novo_cliente.presentsItself();
            personsArrayList.add(novo_cliente);
        }
        if (escolha.equals("2")) {
            PersonSupplier novo_fornecedor = new PersonSupplier();
            novo_fornecedor.receivesInput();
            novo_fornecedor.presentsItself();
            personsArrayList.add(novo_fornecedor);
        }
        if (escolha.equals("3")) {
            PersonEmployee novo_empregado = new PersonEmployee();
            novo_empregado.receivesInput();
            novo_empregado.presentsItself();
            personsArrayList.add(novo_empregado);
        }
    }

    public static void listPerson() {
        System.out.println("---- Listagem de Pessoas cadastradas ----");
        for (Person i: personsArrayList
        ) {
            System.out.println("BD ID: " + personsArrayList.indexOf(i));
            i.presentsItself();
            System.out.println();
        }
        System.out.println("---");
    }

    public static void listClients() {
        System.out.println("---- Listagem de Pessoas cadastradas ----");
        for (Person i: personsArrayList
        ) {
            if (i instanceof PersonClient ) {
                System.out.println("BD ID: " + personsArrayList.indexOf(i));
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
            productsArrayList.add((novo_produto));
        }

        if (escolha.equals("1")) {
            ItemServico novo_servico = new ItemServico();
            novo_servico.insertItem();
            servicesArrayList.add((novo_servico));
        }
    }

    private void listProducts() {
        System.out.println("---- Listagem de Produtos cadastrados ----");
        for (Item i: productsArrayList
        ) {
            System.out.println("BD ID: " + productsArrayList.indexOf(i));
            System.out.println(i.toString());
            System.out.println();
        }
        System.out.println("---");
    }

    private void listServices() {
        System.out.println("---- Listagem de Serviços cadastrados ----");
        for (Item i: servicesArrayList
        ) {
            System.out.println("BD ID: " + servicesArrayList.indexOf(i));
            System.out.println(i.toString());
            System.out.println();
        }
        System.out.println("---");
    }

    private void listItem() {
        listProducts();
        listServices();
    }

    private void insertVehicle() {
        if (!personsArrayList.isEmpty()) {
            Vehicle novo_veiculo = new Vehicle();
            novo_veiculo.receivesInput();
            vehiclesArrayList.add(novo_veiculo);
        } else {
            System.out.println("Você precisa cadastrar clientes primeiro.");
        }

    }

    private void listVehicles() {
        System.out.println("---- Listagem de Veículos ----");
        for (Vehicle i: vehiclesArrayList
        ) {
            System.out.println("BD ID: " + vehiclesArrayList.indexOf(i));
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
        if (!personsArrayList.isEmpty() && !productsArrayList.isEmpty() && !vehiclesArrayList.isEmpty()) {

            listClients();
            System.out.println("Indique o cliente (ID)");
            PersonClient cliente = (PersonClient) personsArrayList.get(Integer.parseInt(scanner.nextLine()));

            listVehicles();
            System.out.println("Indique o veículo (ID)");
            Vehicle veiculo = vehiclesArrayList.get(Integer.parseInt(scanner.nextLine()));

            Order order = new Order(cliente, veiculo);
            ordersArrayList.add(order);

            String escolha;
            do {
                listProducts();
                System.out.println("Indique o produto (ID) -> 99 para finalizar");
                escolha = scanner.nextLine();

                if (escolha.equals("99"))
                    break;

                ItemProduto produto = productsArrayList.get(Integer.parseInt(escolha));

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
        if (!vehiclesArrayList.isEmpty() && !servicesArrayList.isEmpty()) {

            listVehicles();
            System.out.println("Indique o veículo (ID)");
            Vehicle veiculo = vehiclesArrayList.get(Integer.parseInt(scanner.nextLine()));

            Order order = new Order(veiculo.getOwner(), veiculo);
            ordersArrayList.add(order);

            String escolha;
            do {
                listServices();
                System.out.println("Indique o serviço  a realizar (ID) -> 99 para finalizar");
                escolha = scanner.nextLine();

                if (escolha.equals("99"))
                    break;

                ItemServico servico = servicesArrayList.get(Integer.parseInt(escolha));
                order.addItem(servico);

            } while (!escolha.equals("99"));

        } else {
            System.out.println("O sistema ainda não possui veículos && serviços.");
        }
    }

    private void listSales() {
        if (ordersArrayList.isEmpty()) {
            System.out.println("Nenhum movimento de vendas.");
        } else {
            System.out.println("---- Listagem de vendas ----");
            for (Order i: ordersArrayList) {
                System.out.println("VENDA ID(" + ordersArrayList.indexOf(i) + ")");
                System.out.println(i.toString());
                System.out.println();
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
        PersonClient cliente1 = new PersonClient("Luis", "82", "051");
        personsArrayList.add(cliente1);
        PersonClient cliente2 = new PersonClient("Jose", "83", "132");
        personsArrayList.add(cliente2);
        PersonClient cliente3 = new PersonClient("Maria", "84", "866");
        personsArrayList.add(cliente3);

        PersonSupplier fornecedor = new PersonSupplier("RED", "82", "123-55");
        personsArrayList.add(fornecedor);
        fornecedor = new PersonSupplier("PARTSco", "81", "333/0001-10");
        personsArrayList.add(fornecedor);
        fornecedor = new PersonSupplier("BMW", "87", "201/0001-45");
        personsArrayList.add(fornecedor);

        PersonEmployee empregado = new PersonEmployee("Manoel", "81", "333");
        personsArrayList.add(empregado);
        empregado = new PersonEmployee("Joca", "91", "121");
        personsArrayList.add(empregado);
        empregado = new PersonEmployee("Rubya", "74", "765");
        personsArrayList.add(empregado);

        Vehicle veiculo = new Vehicle(cliente1, "MUV-8874", "BMV", "320i");
        vehiclesArrayList.add(veiculo);
        veiculo = new Vehicle(cliente2, "QLE-0101", "GM", "Corsa");
        vehiclesArrayList.add(veiculo);
        veiculo = new Vehicle(cliente3, "ABC-9999", "CADDY", "Taurus");
        vehiclesArrayList.add(veiculo);

        ItemProduto produto = new ItemProduto("Pneu", "22.30");
        productsArrayList.add(produto);
        produto = new ItemProduto("Janela", "14.00");
        productsArrayList.add(produto);
        produto = new ItemProduto("Rodas", "333.50");
        productsArrayList.add(produto);

        ItemServico servico = new ItemServico("Lavagem Simples", "40.00");
        servicesArrayList.add(servico);
        servico = new ItemServico("Lavagem Completa", "60.00");
        servicesArrayList.add(servico);



    }


}
