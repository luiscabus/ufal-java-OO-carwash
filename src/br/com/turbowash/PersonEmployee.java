package br.com.turbowash;

public class PersonEmployee extends Person {

    private String id_ctrabalho;

    public PersonEmployee(String name, String phone, String id_ctrabalho) {
        super(name, phone);
        this.id_ctrabalho = id_ctrabalho;
    }


    @Override
    public void presentsItself() {
        System.out.println("FUNCIONÁRIO Nome: " + this.name + ", CT: " + this.id_ctrabalho + ", Telefone: " + this.phone);
    }


    @Override
    public void retrieveInformation() {

    }
}
