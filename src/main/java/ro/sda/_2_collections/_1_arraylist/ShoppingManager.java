package ro.sda._2_collections._1_arraylist;

/*
 * Create a class ShoppingManager. The class should have 2 lists as instance variables.
 * Both fields are lists of Item. One of them represents store's stock and
 * the other one is the shopping basket of the client.
 *
 * Create the following methods:
 * - constructor without parameters (initialize both lists)
 *
 * - addItemInStock(name, quantity, price) -> in order to add an item we need to check first if the
 * item has not been already added in the store's stock (iterate through the store stock and check item names)
 * if the item was already added just increment the quantity of the already added item and update the price (exit from function after)
 * if the item is not already in the list then add it by creating a new Item
 *
 * - sellItemFromStock(name, quantity) - check if the item is in stock (iterate through the store's stock)
 * and then check if the name parameter is equal to item name (item name from the list)
 * if the item needed is found then check the available quantity
 * return then total price of the sold item (multiply item price with quantity)
 *
 * - addItemToBasket(name, quantity) - check if the item is in store's stock (iterate through the store stock and check item names)
 * if the quantity in stock is greater or equal to the desired quantity then add the item
 * in the basket list by creating a new item (a copy of the one that is in the stock) - exit method for loop after
 *
 * - buyItemsFromBasket() - returns total price of the items
 * iterate through the shopping basket and use sellItemFromStock() method and append the
 * result to a totalPrice variable which will be returned
 * clear the basket
 *
 */

import java.util.ArrayList;

public class ShoppingManager {
    private ArrayList<Item> storeStock;
    private ArrayList<Item> shoppingBasket;

    public ShoppingManager() {
        storeStock = new ArrayList<>();
        shoppingBasket = new ArrayList<>();

    }

    public void addItemInStock(String name, int quantity, double price) {
        for (Item item : storeStock) {
            if (item.getName().equals(name)) {
                item.incrementQuantity(quantity);
                item.setPrice(price);
                return;
            }
        }
        storeStock.add(new Item(name, quantity, price));
    }

    public double sellItemFromStock(String name, int quantity) {
        for (Item item : storeStock) {
            if (item.getName().equals(name)) {
                if (quantity <= item.getQuantity()) {
                    item.decrementQuantity(quantity);
                    return quantity * item.getPrice();
                } else {
                    System.out.println("Quantity is not available: ");
                }
            }
        }
        return 0;
    }

    public void addItemToBasket(String name, int quantity) {
        for (Item item : storeStock) {
            if (item.getQuantity() >= quantity) {
                shoppingBasket.add(new Item(name, quantity, item.getPrice()));
                break;
            } else {
                System.out.println("Quantity is not available in stock");
            }
        }
    }

    public double buyItemsFromBasket() {
        double totalPrice = 0;
        for (Item item : shoppingBasket) {
            totalPrice += sellItemFromStock(item.getName(), item.getQuantity());
        }
        shoppingBasket.clear();
        return totalPrice;
    }
}
