package polymorphism;

interface mycamera1{
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
interface mywifi1{
    void getwifi();
    void dhcpwifi();
}
class mycellphone1{
    void callnumber(int phonenumber){
        System.out.println("calling.." +phonenumber);
    }
    void pickup(){
        System.out.println("connnecting...");
    }
}
class mysmartphone1 extends mycellphone1 implements mywifi1, mycamera1 {
    public void takesanp() {
        System.out.println("taking snap..");
    }
    public void recordvideo(){
        System.out.println("recording video...");
    }

    @Override
    public void getwifi() {
        System.out.println("getting wifi..");
    }

    @Override
    public void dhcpwifi() {
        System.out.println("getting dhcp wifi..");
    }
}
public class polymorphisim {
    public static void main(String[] args) {
        mycamera1 m = new mysmartphone1();
        m.recordvideo();
        m.takesanp();
        mysmartphone1 ms = new mysmartphone1();
        ms.dhcpwifi();
        ms.getwifi();
        ms.pickup();
        ms.callnumber(13);

        //m.getwifi();----not allowed bcz only camera interface method are allowed
    }
}
