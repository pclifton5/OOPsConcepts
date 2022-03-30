package DishWare;

import java.util.ArrayList;

public class Dishes{
    //Fields
    private String itemName;
    private int stock;
    private ArrayList<String> colors = new ArrayList<String>();
    private ArrayList<String> materials = new ArrayList<String>();
    private double price;

    //Constructors

    public Dishes(String itemName, int stock, ArrayList<String> colors, ArrayList<String> materials, double price) {
        this.itemName = itemName;
        this.stock = stock;
        this.colors = colors;
        this.materials = materials;
        this.price = price;
    }
//Getters and Setters

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    public ArrayList<String> getMaterials() {
        return materials;
    }

    public void setMaterials(ArrayList<String> materials) {
        this.materials = materials;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Methods
    public String outOfStock(){
        if (stock <= 0){
            return "Sorry, but this item is currently unavailable.";
        }{
            return "We have "+stock+" "+itemName+" available for purchase.";
        }
    }
    //ToString
    @Override
    public String toString() {
        return itemName+"\n"+
                outOfStock()+"\n"+
                "This item comes in "+getColors()+".\n"+
                "This item is available in "+getMaterials()+"\n"+
                "The price is "+price;

    }
}
