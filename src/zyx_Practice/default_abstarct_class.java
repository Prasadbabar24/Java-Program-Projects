package zyx_Practice;

interface mycamera {
    void takesanp();

    void recordvideo();
//    private void greet(){
//        System.out.println("G M");
//    }
//    default void record4kvideo(){
//        greet();
//        System.out.println("recording 4k videos ...");
//    }
}

interface mywifi {
    String[] getnetworks();

    void connecttonetworks(String network);
}

class mycellphone {
    void callnumber(int phonenumber) {
        System.out.println("calling.." + phonenumber);
    }

    void pickup() {
        System.out.println("connnecting...");
    }
}

class mysmartphone extends mycellphone implements mywifi, mycamera {
    public void takesanp() {
        System.out.println("taking snap..");
    }
    public void recordvideo() {
        System.out.println("recording video...");
    }

    public String[] getnetwork() {
        System.out.println("Getting list of networks");
        String[] networklist = {"prasad", "rohit", "bhagyashree"};
        return networklist;
    }

    @Override
    public String[] getnetworks() {

        return new String[0];
    }

    @Override
    public void connecttonetworks(String network) {

        System.out.println("conncting.." + network);
    }
}

public class default_abstarct_class {
    public static void main(String[] args) {
        mysmartphone ms = new mysmartphone();
        //ms.record4kvideo();
        ms.pickup();
        ms.takesanp();

        String[] ar = ms.getnetworks();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}
