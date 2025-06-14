//banking application mostly use java because of encapsulation(achieved using access modifier)
public class MyEncapsulation{
    public static void main(String[] args){
        Demo d= new Demo();
    }
}
class Demo{
    int a; //Default access modifier - acess in class and package
    public int b; //accessible everywhere
    private int c; //only accessible inside class
    protected int d; //acess in class,package,subclass but not global like public
public void dance(){
    System.out.println("Dancing")
}
}
class Child extends Demo{

}