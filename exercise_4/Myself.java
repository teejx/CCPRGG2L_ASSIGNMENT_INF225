public class Myself {

    int age;
    String name;
    
    Myself(String myName, int myAge){
        this.age = myAge;
        this.name = myName;
    }

    void addFriend(Person friend) {
        System.out.println("I am friends with " + friend.name + ", he is " + friend.age + " years old.");
    }
}