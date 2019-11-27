package br.com.turbowash;

import java.util.Scanner;

public class PersonEmployee extends Person {

    private String id_ctrabalho;


    public PersonEmployee() {
        this(null,null,null);
    }

    public PersonEmployee(String name, String phone, String id_ctrabalho) {
        super(name, phone);
        this.id_ctrabalho = id_ctrabalho;
    }

    @Override
    void receivesInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome");
        this.setName(scan.nextLine());

        System.out.println("Entre com o Telefone");
        this.setPhone(scan.nextLine());

        System.out.println("Entre com o CT");
        this.setId_ctrabalho(scan.nextLine());

        this.presentsItself();
    }

    @Override
    public void presentsItself() {
        System.out.println("FUNCIONÁRIO \nNome: " + this.getName() +
                ", \nTelefone: " + this.getPhone() + ", \nCT: " + this.getId_ctrabalho());
    }


    public String getId_ctrabalho() {
        return id_ctrabalho;
    }

    public void setId_ctrabalho(String id_ctrabalho) {
        this.id_ctrabalho = id_ctrabalho;
    }


}
