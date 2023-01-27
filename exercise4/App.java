public class App {
    public static void main (String [] args) {

    Person friend= new Person("Mark Joshua Rivera",18);

    Myself me = new Myself("Tehrence Joie C. Llenarez",19);

    Pet dog = new Pet("Bella", friend);

    Car whipp = new Car("Mcqueen", "Mazda RX9", me);
    

    me.addFriend(friend);
    dog.showOwnerName();
    whipp.showCarHolder();
    }
    
}
