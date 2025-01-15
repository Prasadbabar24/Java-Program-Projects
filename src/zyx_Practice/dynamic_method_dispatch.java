package zyx_Practice;

class phone {
    public void greet() {
        System.out.println("Good morning");
    }

    public void name() {
        System.out.println("my name is java in class one");
    }
}

class smartphone extends phone {
    public void swagat() {
        System.out.println("appka swagta hai");
    }

    public void name() {
        System.out.println("my name is java in class two");
    }
}

public interface dynamic_method_dispatch {
    public static void main(String[] args) {
//        zyx_Practice.phone obj = new zyx_Practice.phone();//allowed
//        zyx_Practice.smartphone obj2 = new zyx_Practice.smartphone();//allowed
//        obj.name();

        phone obj = new smartphone();  // allowed
//        zyx_Practice.smartphone obj1= new zyx_Practice.phone(); // not allowed reverse
        obj.name(); // run the zyx_Practice.smartphone obj . name
        //obj.swagat// get error bcz aapn zyx_Practice.smartphone madhale method run karuu shakt nahi
        obj.greet();
    }
}
