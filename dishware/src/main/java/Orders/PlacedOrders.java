package Orders;

import DishWare.DishesMain;

import java.util.ArrayList;

public class PlacedOrders{
    //Fields
    private String firstName;
    private String lastName;
    private String shippingAddress;
    private ArrayList<DishesMain> dishesOrdered = new ArrayList<>();
    private boolean hasShipped;

    //Constructors
    public PlacedOrders() {
    }

    public PlacedOrders(String firstName, String lastName, String shippingAddress, ArrayList<DishesMain> dishesOrdered, boolean hasShipped) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.shippingAddress = shippingAddress;
        this.dishesOrdered = dishesOrdered;
        this.hasShipped = hasShipped;
    }

    //Getters and Setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public ArrayList<DishesMain> getDishesOrdered() {
        return dishesOrdered;
    }

    public void setDishesOrdered(ArrayList<DishesMain> dishesOrdered) {
        this.dishesOrdered = dishesOrdered;
    }

    public boolean isHasShipped() {
        return hasShipped;
    }

    public void setHasShipped(boolean hasShipped) {
        this.hasShipped = hasShipped;
    }

    //Methods
    public String needToShip(){
        if (hasShipped == false){
            return "This order hasn't shipped out yet.";
        }{
            return "This order has been shipped";
        }
    }
    //ToString

    @Override
    public String toString() {
        return "Orders: \n" +
                "Name: " + firstName + " " + lastName + "\n"+
                "Shipping Address: "+shippingAddress+
                "Order contents: " + dishesOrdered +

                needToShip();
    }
}
