package zyx_Practice;

class mygeneric<T1, T2> {
    int val;
    private T1 t1;
    private T2 t2;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public mygeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }
}

public class Generic {
    public static void main(String[] args) {
        mygeneric<String, Integer> generic = new mygeneric(34, "Hello Java", 567);
        String str1 = generic.getT1();
        Integer int1 = generic.getT2();
//        System.out.println(str1  +  int1);
//        System.out.print(str1);
        System.out.print(str1 +" "+int1);
//        ArrayList arrayList = new ArrayList();
//        arrayList.add("Str1");
//        arrayList.add(23);
//        arrayList.add(467);
//        int arr =(int) arrayList.get(2);
//        System.out.println(arr);

//        ArrayList<Integer> arrayList = new ArrayList<>();
////        arrayList.add("Str1");
//        arrayList.add(23);
//        arrayList.add(467);
//        int arr = arrayList.get(1);
//        System.out.println(arr);

    }
}
