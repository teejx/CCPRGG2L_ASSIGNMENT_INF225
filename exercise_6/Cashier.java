public class Cashier {

    public void checkOut(GroceryItem item) {
        System.out.println("You have purchased " + item.name + " pesos");
        
    }
    public void showItemPrice(GroceryItem price) {
        System.out.println("This item costs:  " + price.price + " pesos");
    }
}
