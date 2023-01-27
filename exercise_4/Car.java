public class Car {
    String name;
    String brand;
    Myself holder;

    Car(String carName, String carBrand, Myself carHolder){
        this.name = carName;
        this.brand = carBrand;
        this.holder = carHolder;
    }
    void showCarHolder(){
        System.out.println("My name is " + holder.name + ", I have a car and it's called " + this.name + " and it's a " + this.brand);
    }

}
