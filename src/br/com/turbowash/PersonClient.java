package br.com.turbowash;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonClient extends Person {

    private String id_cpf;

    PersonClient(String name, String phone, String id_cpf) {
        super(name, phone);
        this.id_cpf = id_cpf;
    }


    @Override
    public void presentsItself() {
        System.out.println("CLIENTE Nome: " + this.name + ", Cpf: " + this.id_cpf +", Telefone: " + this.phone);
    }


    @Override
    public void retrieveInformation() {

    }
}
