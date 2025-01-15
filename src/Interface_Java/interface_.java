package Interface_Java;

interface bycycle {
    int a = 10;

    void horn(int up);

    void speed(int fast);
}

interface motor {
    void sparkon();
}

class hpcycle implements bycycle, motor {
    void sound() {
        System.out.println("1233455");
    }

    public void horn(int up) {
        System.out.println("peee pooo peee");
    }

    public void speed(int fast) {
        System.out.println(" Apply speed");
    }

    public void sparkon() {
        System.out.println("Motor on");
    }
}

public class interface_ {
    public static void main(String[] args) {
        hpcycle hc = new hpcycle();
        hc.horn(5);
        hc.speed(6);
        //can not change the value of int a =10; beacause its constat or final value
        //hc.a=3543;
//        System.out.println(hc.a);

        hc.sparkon();
        hc.sound();

    }
}
