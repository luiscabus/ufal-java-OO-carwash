package br.com.turbowash;

import java.util.Scanner;

class Item implements Presentsitelf {

    private String name;
    private String price;
    private int stock;


    public Item() {
        this.name = null;
        this.price = null;
        this.stock = 0;
    }

    public Item(String name, String price) {
        this.name = name;
        this.price = price;
        this.stock = 0;
    }

    public void insertItem() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome do item");
        this.setName(scan.nextLine());

        System.out.println("Entre com o preço do item");
        this.setPrice(scan.nextLine());

        this.presentsItself();
    }

    @Override
    public void presentsItself() {
        System.out.println("ITEM \nNome: " + this.getName() +
                ", \nPreço: " + this.getPrice());
    }

    @Override
    public String toString() {
        return "\n'" + name + '\'' +
                ", '" + price + '\'' + "\n" ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
