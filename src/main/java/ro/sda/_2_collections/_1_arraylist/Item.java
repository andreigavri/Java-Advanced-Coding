package ro.sda._2_collections._1_arraylist;
/*
 * Create a class Item with the following instance variables: name - String, quantity - int, price - double
 *
 * Create the following methods:
 * - constructor (check if the price is greater than 0)
 * - getters for all the fields
 * - setter for price - (check if the price is greater than 0)
 * - incrementQuantity(int quant) - method that adds the parameter "quant" to the field quantity
 * - decrementQuantity(int quant) - method that subtracts the parameter "quant" from the field quantity

 */

public class Item {
    private String name;
    private int quantity;
    private double price;

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price < 0 ? 0 : price;

    }


    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price < 0 ? 0 : price;

    }

    public void incrementQuantity(int quant) {
        this.quantity += quant;

    }

    public void decrementQuantity(int quant) {
        this.quantity -= quant;
    }
}
