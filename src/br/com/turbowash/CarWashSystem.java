package br.com.turbowash;

import java.util.ArrayList;
import java.util.Scanner;

class CarWashSystem {

    private ArrayList<Person> lista_de_pessoas = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    void run() {

        String escolha;

        do {
            System.out.println("Olá, usuário CarWash. Escolha no menu sua opção.");
            System.out.println("1. inserir pessoa");
            System.out.println("2. inserir item");
            System.out.println("3. listar pessoas");
            System.out.println("4. listar itens");

            escolha = scanner.nextLine();
            if (escolha.equals("1")) { insertPerson(); }
            if (escolha.equals("2")) { insertItem(); }
            if (escolha.equals("3")) { listPerson(); }


        } while (!escolha.equals("99"));

    }

    private void insertPerson() {
        System.out.println("=> Inserir Pessoa. Opções:");
        System.out.println("1. inserir cliente");
        System.out.println("2. inserir fornecedor");
        System.out.println("3. inserir empregado");
        System.out.println("9. voltar");

        String escolha = scanner.nextLine();
        if (escolha.equals("1")) {
            PersonClient novo_cliente = new PersonClient("Luis", "82.999146000", "051.501.524-55");
            lista_de_pessoas.add(novo_cliente);
        }
        if (escolha.equals("2")) {
            PersonSupplier novo_fornecedor = new PersonSupplier("Walmart", "82.21210000", "14.123.321/0001-10");
            lista_de_pessoas.add(novo_fornecedor);
        }
    }

    private void insertItem() {
        System.out.println("Inserir Item. Opções:");
        System.out.println("1. inserir produto");
        System.out.println("2. inserir serviço");
        System.out.println("9. voltar");

        String escolha = scanner.nextLine();
        if (escolha.equals("1")) {
            ItemProduto novo_produto = new ItemProduto();
            novo_produto.insertItem();
        }
    }

    private void listPerson() {

        for (Person i: lista_de_pessoas
        ) {
            i.presentsItself();
        }
    }


}
