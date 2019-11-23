package br.com.turbowash;

public class ItemProduto extends Item {


    public ItemProduto(String nome, String tipo) {
        super(nome, tipo);
    }

    ItemProduto() {
        super("", "");

    }

    @Override
    public void insertItem() {

    }

    public void gogogo() {
        System.out.println("Gogo go, boy!");
    }
}
