package Practice_Muiltithread;

class mythre extends Thread {
//    public void run(){
//        while (true){
//            try{
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println("Good Morning..");
//        }
//    }
}

class mythre2 extends Thread {
//    public void run(){
//        while (false){
//            try{
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println("Wellcome");
//        }
//    }
}

public class ps_thread {
    public static void main(String[] args) {
        mythre t1 = new mythre();
        mythre2 t2 = new mythre2();
//        t1.setPriority(6);
//        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t2.getState());
        //t1.start();
        t2.start();
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());

    }
}
