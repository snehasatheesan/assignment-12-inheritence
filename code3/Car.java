package inheritence3;
public class Car extends Vehicle{
    int modelNo;
    String type;
    String brand;
    Car(){
        super();
        this.brand="Porsche";
        this.type="SUV";
        this.modelNo=1502;
    }
    Car(int modelNo,String type,String brand,String colour,float price){
        super(colour,price);
        this.modelNo=modelNo;
        this.type=type;
        this.brand=brand;
    }
}
