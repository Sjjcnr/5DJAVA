public class MyInheritance{
    public static void main(String[] args){
        SUV s= new SUV();
        s.name="SUV";
        s.speed=100;
        s.seats=4;
        s.move();
    }
}

class Vehicle{
    String name;
    int speed;
    int seats;
    void move(){
        System.out.println("Vehicle is moving");
    }
}
class SUV extends Vehicle{


}