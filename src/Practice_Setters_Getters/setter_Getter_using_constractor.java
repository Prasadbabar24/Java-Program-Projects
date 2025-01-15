package Practice_Setters_Getters;

class myemployee1{
    private int id;
    private String name;

    public myemployee1(){
        id = 45;
        name= "your name ";
    }
    public myemployee1(String myname, int myid){
        id = myid;
        name=myname;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}
public class setter_Getter_using_constractor {
    public static void main(String[] args) {
        myemployee1 prasad = new myemployee1("code" ,98);
        System.out.println(prasad.getId());
        System.out.println(prasad.getName());

    }
}
