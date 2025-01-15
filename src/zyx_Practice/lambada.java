package zyx_Practice;

interface Demoano {
    void meth1();

    void meth2();
}

class anodemo implements Demoano {

    public void meth1() {
        System.out.println("i am meth 1");
    }

    @Override
    public void meth2() {
        System.out.println(" i am meth 2");
    }
}

public class lambada {
    public static void main(String[] args) {
//        zyx_Practice.anodemo mydemo=new zyx_Practice.anodemo();
//        mydemo.meth1();
        Demoano obj = new Demoano() {
            @Override
            public void meth1() {
                System.out.println(" i am meth 1");
            }

            @Override
            public void meth2() {
                System.out.println(" i am meth2");
            }
        };
        obj.meth1();
    }
}
