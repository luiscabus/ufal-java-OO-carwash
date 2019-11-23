package br.com.turbowash;

public class PersonSupplier extends Person {

    private String id_cnpj;

    PersonSupplier(String name, String phone, String id_cnpj) {
        super(name, phone);
        this.id_cnpj = id_cnpj;
    }


    @Override
    public void presentsItself() {
        System.out.println("FORNECEDOR Nome: " + this.name + ", Cnpj: " + this.id_cnpj + ", Telefone: " + this.phone);
    }


    @Override
    public void retrieveInformation() {

    }
}
