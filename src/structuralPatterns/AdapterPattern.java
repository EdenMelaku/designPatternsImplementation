/*
making different classes communicate in a similar manner
creates classes of different types so that they can become interchangeable
 */


package structuralPatterns;

// the target class- which we wish to implement the adapter

class Car{

    private double speed;
    private String model;
    private String color;


    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


//Adapter- the class that provides the join for the 2 class, houses the methods for conjoining functionality between them
class BikeAdaptor extends Car{
    private MotorBike mb=new MotorBike();


    @Override
    public void setSpeed(double speed) {
        mb.setBikeSpeed(speed);
    }

    public void setModel(String model) {
        mb.setBikeModel(model);
    }

    public void setColor(String color) {
        mb.setBikeColor(color);
    }

}

//Adaptee- class that we wiah to give access to the methods and functionality of the target class

class MotorBike
{
    private double bikeSpeed;
    private String bikeModel;
    private String bikeColor;


    public void setBikeSpeed(double bikeSpeed) {
        this.bikeSpeed = bikeSpeed;
    }

    public void setBikeModel(String bikeModel) {
        this.bikeModel = bikeModel;
    }

    public void setBikeColor(String bikeColor) {
        this.bikeColor = bikeColor;
    }
}


public class AdapterPattern {
      public static void main(String ... args ){

          Car c= new Car();
          c.setColor("blue");
          c.setModel("new");
          c.setSpeed(100.0);


          Car motorBike =new BikeAdaptor();
          motorBike.setSpeed(130);
          motorBike.setModel("xyz");
          motorBike.setColor("green");


     }

}

