package br.com.turbowash;

import java.util.ArrayList;
import java.util.Scanner;

class CarWashSystem {

    private ArrayList<Person> lista_de_pessoas = new ArrayList<>();
    private ArrayList<Item> lista_de_itens = new ArrayList<>();
    private ArrayList<Orders> lista_de_compras = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    void run() {
        String escolha;
        do {
            System.out.println();
            System.out.println("## CarWash - Menu Principal. Olá, usuário. ##");
            System.out.println("1. Cadastros (pessoas, veículos, itens)");
            System.out.println("2. Movimento vendas (produtos, serviços)");
            System.out.println("3. Financeiro");
            System.out.println("99. Sair do sistema");

            escolha = scanner.nextLine();
            if (escolha.equals("1")) { menuCadastros(); }
            if (escolha.equals("2")) { menuMovimento(); }
            if (escolha.equals("3")) { menuFinanceiro(); }
        } while (!escolha.equals("99"));
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
            System.out.println("  9. Voltar ao menu principal");

            escolha = scanner.nextLine();
            if (escolha.equals("1")) { insertPerson(); }
            if (escolha.equals("2")) { listPerson(); }
            if (escolha.equals("3")) { insertItem(); }
            if (escolha.equals("4")) { listItem(); }
            if (escolha.equals("5")) { insertVehicle(); }
            if (escolha.equals("6")) { listVehicle(); }
        } while (!escolha.equals("9"));
    }

    private void insertPerson() {
        System.out.println("  => Inserir Pessoa. Opções:");
        System.out.println("    1. inserir cliente");
        System.out.println("    2. inserir fornecedor");
        System.out.println("    3. inserir empregado");
        System.out.println("    9. voltar");

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

    private void listPerson() {
        System.out.println("---- Listagem de Pessoas cadastradas ----");
        for (Person i: lista_de_pessoas
        ) {
            System.out.println("BD ID: " + lista_de_pessoas.indexOf(i));
            i.presentsItself();
            System.out.println();
        }
        System.out.println("---");
    }

    private void insertItem() {
        System.out.println("  => Inserir Item. Opções:");
        System.out.println("    1. inserir produto");
        System.out.println("    2. inserir serviço");
        System.out.println("    9. voltar");

        String escolha = scanner.nextLine();
        if (escolha.equals("1")) {
            ItemProduto novo_produto = new ItemProduto();
            novo_produto.insertItem();
            lista_de_itens.add((novo_produto));
        }
    }

    private void listItem() {
        System.out.println("---- Listagem de Itens cadastrados ----");
        for (Item i: lista_de_itens
        ) {
            System.out.println("BD ID: " + lista_de_itens.indexOf(i));
            i.presentsItself();
            System.out.println();
        }
        System.out.println("---");
    }

    private void insertVehicle() {

    }

    private void listVehicle() {

    }


    private void menuMovimento() {
        String escolha;
        do {
            System.out.println();
            System.out.println("## CarWash PDV - Menu de Movimento. ##");
            System.out.println("  1. Vender produto");
            System.out.println("  2. Vender serviço");
            System.out.println("  9. Voltar ao menu principal");

            escolha = scanner.nextLine();
//            if (escolha.equals("1")) { menuCadastros(); }
//            if (escolha.equals("2")) { menuMovimento(); }
//            if (escolha.equals("3")) { menuFinanceiro(); }
        } while (!escolha.equals("9"));
    }

    private void menuFinanceiro() {
        String escolha;
        do {
            System.out.println();
            System.out.println("## CarWash PDV - Menu de Financeiro. ##");
            System.out.println("  1. Nova despesa");
            System.out.println("  2. Listar despesas");
            System.out.println("  9. Voltar ao menu principal");

            escolha = scanner.nextLine();
//            if (escolha.equals("1")) { menuCadastros(); }
//            if (escolha.equals("2")) { menuMovimento(); }
//            if (escolha.equals("3")) { menuFinanceiro(); }
        } while (!escolha.equals("9"));
    }


}
