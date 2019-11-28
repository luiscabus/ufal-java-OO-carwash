package br.com.turbowash;

public class ItemProduto extends Item {

    int stock;

    public ItemProduto() {
        this(null, null);
    }

    public ItemProduto(String name, String price) {
        super(name, price);
        this.stock = 0;
    }

    public int getStock() {
        return stock;
    }

}
