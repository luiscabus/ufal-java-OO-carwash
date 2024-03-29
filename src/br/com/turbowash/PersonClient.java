package br.com.turbowash;

import java.util.Scanner;

public class PersonClient extends Person {

    private String id_cpf;

    public PersonClient() {
        this(null, null, null);
    }

    public PersonClient(String name, String phone, String id_cpf) {
        super(name, phone);
        this.id_cpf = id_cpf;
    }

    @Override
    void receivesInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome");
        this.setName(scan.nextLine());

        System.out.println("Entre com o Telefone");
        this.setPhone(scan.nextLine());

        System.out.println("Entre com o CPF");
        this.setId_cpf(scan.nextLine());
    }

    @Override
    public void presentsItself() {
        System.out.println("CLIENTE \nNome: " + this.getName() +
                ", \nTelefone: " + this.getPhone() +
                ", \nCPF: " + this.getId_cpf() +
                ", \nStatus: " + this.isActive() );
    }

    public String getId_cpf() {
        return id_cpf;
    }

    public void setId_cpf(String id_cpf) {
        this.id_cpf = id_cpf;
    }
}
