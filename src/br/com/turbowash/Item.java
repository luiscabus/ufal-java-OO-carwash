package br.com.turbowash;

import java.util.Scanner;

class Item {

    private String name;
    private String price;
    private boolean isActive;

    public Item() {
        this(null, null);
    }

    public Item(String name, String price) {
        this.name = name;
        this.price = price;
        this.isActive = true;
    }

    public void insertItem() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome do item");
        this.setName(scan.nextLine());

        System.out.println("Entre com o preço do item");
        this.setPrice(scan.nextLine());
    }

    @Override
    public String toString() {
        return ("ITEM Nome: " + name +
                ", Preço: " + price);
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void deactivate() {
        this.isActive = false;
    }
}
