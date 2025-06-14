public class MyMethodOverloading{
    public static void main(String[] args){
        //ways to achieve 1function overloading 2function overriding
        //1 same name different parameter, 
        //Rules
        // type of parameter different, 
        // number of parameter can be different,
        // order of parameter different
        College c=new College();
        c.study()
    }
}
class College{
    String name;
    String address;
    void study(){  //function can have any datatype as parameter and any return type like both primitive and non premitive
        System.out.println("Study 1");
    }
    void study(int a){
        System.out.println("Study 2");
    }
    void study(float a){
        System.out.println("Study 2");
    }
    void study(int a,int b){
        System.out.println("Study 2");
    }
    void study(int a,String b){
        System.out.println("Study 2");
    }
    void study(String a,int b){
        System.out.println("Study 2");
    }
}