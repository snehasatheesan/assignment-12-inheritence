package inheritence3;

public class Bike extends Vehicle {
    String brand;
    String bikeModel;
    Bike(){

    }
    Bike(String colour,float price,String brand,String bikeModel){
        super(colour,price);
        this.brand=brand;
        this.bikeModel=bikeModel;
    }
}
