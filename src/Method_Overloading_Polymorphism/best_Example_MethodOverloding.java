package Method_Overloading_Polymorphism;

class Mathunit{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
}
public class best_Example_MethodOverloding {
    public static void main(String[] args) {
        Mathunit Mu=new Mathunit();
        System.out.println("Addition Of Two num :"+Mu.add(10,20));
        System.out.println("Addition Of Three num :"+Mu.add(10,20,30));
    }
}
