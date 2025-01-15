package KeyWords_in_Java;

class Ekclass{
    int a;

    public int getA() {
        return a;
    }

    Ekclass(int a){
        this.a =a;
    }
    public int return1(){
        return 1;
    }
}
class Doclass extends Ekclass{
    Doclass(int c){
        super(c);
        System.out.println("i am a constructor c :");
    }
}
public class this_super_keyword {
    public static void main(String[] args) {
        Ekclass ek = new Ekclass(5);
        Doclass dc = new Doclass(8);
        System.out.println(ek.getA());
    }
}
