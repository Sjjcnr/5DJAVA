public class MyMethodOverriding{
    public static void main(String[] args){
        //rule of method overriding
        //1 inheritance
        //super-execute parent class method instead of child class 
        
        B obj = new B();
        obj.dance(12);
    }
} 
class A{
    void dance(int a){
        System.out.println("Dancing 1");
    }
}
class B extends A{
    @Override
    void dance(int a){
        super.dance(a);
    }
}