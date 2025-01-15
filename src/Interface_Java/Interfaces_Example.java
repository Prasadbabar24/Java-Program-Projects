package Interface_Java;

interface old {
    void meth1();
    void meth2();
}

interface new1 extends old {
    void meth3();
    void meth4();
}

class generation implements new1 {
    public void meth1() {
        System.out.println("meth1");
    }

    public void meth2() {
        System.out.println("meth2");
    }

    public void meth3() {
        System.out.println("meth3");
    }

    public void meth4() {
        System.out.println("meth4");
    }
}

public class Interfaces_Example {
    public static void main(String[] args) {
        generation g = new generation();
        g.meth1();
        g.meth2();
        g.meth3();
        g.meth4();
    }
}
