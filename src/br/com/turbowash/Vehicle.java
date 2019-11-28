package br.com.turbowash;

import java.util.Scanner;

public class Vehicle {
    private PersonClient owner;
    private String placa;
    private String marca;
    private String modelo;
    private boolean isActive;

    public Vehicle() {
        /* Calling the principal constructor
        if the empty constructor is called to set
        initial values to the parameters
        !! Has got to be the first line !! */
        this(null, null, null, null);
    }

    public Vehicle(PersonClient owner, String placa, String marca, String modelo) {
        this.owner = owner;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.isActive = true;
    }

    public void receivesInput() {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Quem é o dono?");
            CarWashSystem.listClients();

            int ownerId = Integer.parseInt(scan.nextLine());
            if (CarWashSystem.personsArrayList.get(ownerId) instanceof PersonClient) {

                PersonClient dono = (PersonClient) CarWashSystem.personsArrayList.get(ownerId);
                this.setOwner(dono);

                System.out.println("Entre com a Placa");
                this.setPlaca(scan.nextLine());

                System.out.println("Entre com a Marca");
                this.setMarca(scan.nextLine());

                System.out.println("Entre com o Modelo");
                this.setModelo(scan.nextLine());
            } else {
                System.out.println("Veículo só pode ser de Cliente");
            }
        }

        catch (Exception e) {
            System.out.println("Não foi possível receber os dados. " + e);
        }

    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "owner=" + owner +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", status='" + isActive + '\'' +
                '}';
    }

    public PersonClient getOwner() {
        return owner;
    }

    public void setOwner(PersonClient owner) {
        this.owner = owner;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void deactivate() {
        this.isActive = false;
    }
}
