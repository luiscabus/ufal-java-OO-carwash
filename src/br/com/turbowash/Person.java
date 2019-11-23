package br.com.turbowash;

abstract class Person implements PersonData {

    String name;
    String phone;

    Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    abstract public void presentsItself();

}
