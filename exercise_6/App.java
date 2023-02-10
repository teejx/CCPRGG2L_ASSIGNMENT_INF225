public class App {
    public static void main(String[] args) throws Exception {

        GroceryItem item1 = new GroceryItem();

        item1.name = "Tissue";

        item1.showItemName();

        GroceryItem item2 = new Toothbrush();
        item2.name = "Colgate";
        item2.price = 12;
        item2.showItemName();

        GroceryItem item3 = new Toothpaste();
        item3.name = "Pepsodent";
        item3.price = 14;
        item3.showItemName();

        Cashier c1 = new Cashier();

        // polymorphic parameter
        c1.checkOut(item2);
        c1.checkOut(item3);
        c1.showItemPrice(item2);
        c1.showItemPrice(item3);

        // polymorphic array
        GroceryItem[] itemArray = new GroceryItem[2];
        itemArray[0] = item2;
        itemArray[1] = item3;

        // loop through all items
        for (int i = 0; i < itemArray.length; i++) {
            itemArray[i].showItemName();
        }

        Dog myDog = new Dog();
        myDog.eat();

        Lion myLion = new Lion();
        myLion.walk();
        myLion.run();
    }
}
