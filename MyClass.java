public class MyClass{
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="Uday";
        s1.roll=1;
        s1.marks=100;
        s1.phone=9123456780L;
        s1.study();
    }
}
class Student{
    String name;
    int roll;
    int marks;
    long phone;
void study(){
    System.out.println("Student is studying");
}}