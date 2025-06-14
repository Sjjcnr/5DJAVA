public class MyAbstraction{
    public static void main(String[] args){
        //two ways to achieve abstraction
        //1)abstarct class (if any class has abstarct method it must be abstarct class)
        //2)interface - interface is a group of abstract method only cant have variable, normal method
        //3)abstract class ka object nai banta
    }
}
abstract class Weather{
    double temp;
    double windSpeed;
    abstract void tornado(); //method without body
    void rain(){
        System.out.println("Raining")
    }
}
class MyClass extends Weather{
    @Override
    //we cant use super keyword in void tornado because there is no implementation in the parent class
    void tornado(){ //compalsory to override in the fist subclass
        System.out.println("Tornado")
    }
    void rain(){
        System.out.println("Raining")
    }
}
//we cant make object of interface class
interface MyInterface{ //no need to write abstract behind methods
    void fun1();
    void fun2();
    void fun3();
}
class ParulClass implements MyInterface{
    @Override
    public void func1(){  //here we need to increase the access because it is rule of method overriding thats why we used public 
        System.out.println("");
    }
    @Override
    public void func2(){
        System.out.println("");
    }
    @Override
    public void func3(){
        System.out.println("");
    }
}

//final is used before variable,method and class too.