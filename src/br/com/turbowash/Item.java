package br.com.turbowash;

abstract class Item {

    private int id;
    private String nome;
    private String tipo;

//    abstract void Move();

    Item(String nome, String tipo) {
        this.id = 1;
        this.nome = nome;
        this.tipo = tipo;
    }

    abstract public void insertItem();


}
