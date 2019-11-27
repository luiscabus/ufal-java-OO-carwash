package br.com.turbowash;

import java.util.ArrayList;

public class Order {
    private PersonClient client;
    private Vehicle vehicle;

    private ArrayList<Item> ordered_items = new ArrayList<>();

    private int itemsQty;
    private double orderTotal;


    public Order() {
        this.client = null;
        this.vehicle = null;
        this.itemsQty = 0;
        this.orderTotal = 0;
    }

    public Order(PersonClient client, Vehicle vehicle) {
        this.client = client;
        this.vehicle = vehicle;
        this.itemsQty = 0;
        this.orderTotal = 0;
    }

    public void addItem(Item item) {
        this.ordered_items.add(item);
        this.itemsQty += 1;
        this.orderTotal += Double.parseDouble(item.getPrice());
    }

    public void removeItem(Item item) {
        this.ordered_items.remove(item);
        this.itemsQty -= 1;
        this.orderTotal -= Double.parseDouble(item.getPrice());
    }

    public void clearCart() {
        this.ordered_items.clear();
        this.itemsQty = 0;
        this.orderTotal = 0;
    }

//    public void printOrder() {
//        System.out.println("Cliente: " + client + "\nVeículo: " + vehicle +
//                "\nQuantidade de itens: " + itemsQty + "\nTotal: " + orderTotal +
//                "\nITENS: " + ordered_items.toString());
//    }

    @Override
    public String toString() {
        return "VENDA " +
                "\nCliente: " + client +
                "\nVeículo: " + vehicle.getMarca() + " " + vehicle.getModelo() +
                "\nQtd Itens: " + itemsQty +
                "\nTotal: " + orderTotal +
                "\nItens: \n" + ordered_items.toString() +
                "";
    }

    public PersonClient getClient() {
        return client;
    }

    public void setClient(PersonClient client) {
        this.client = client;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ArrayList<Item> getOrdered_items() {
        return ordered_items;
    }

    public void setOrdered_items(ArrayList<Item> ordered_items) {
        this.ordered_items = ordered_items;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }
}
