package br.com.turbowash;

import java.util.Scanner;

public class PersonSupplier extends Person {

    private String id_cnpj;

    public PersonSupplier() {
        this(null, null, null);
    }

    public PersonSupplier(String name, String phone, String id_cnpj) {
        super(name, phone);
        this.id_cnpj = id_cnpj;
    }

    @Override
    void receivesInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome");
        this.setName(scan.nextLine());

        System.out.println("Entre com o Telefone");
        this.setPhone(scan.nextLine());

        System.out.println("Entre com o CNPJ");
        this.setId_cnpj(scan.nextLine());
    }

    @Override
    public void presentsItself() {
        System.out.println("FORNECEDOR \nNome: " + this.getName() +
                ", \nTelefone: " + this.getPhone() + ", \nCNPJ: " + this.getId_cnpj());
    }

    public String getId_cnpj() {
        return id_cnpj;
    }

    public void setId_cnpj(String id_cnpj) {
        this.id_cnpj = id_cnpj;
    }


}
