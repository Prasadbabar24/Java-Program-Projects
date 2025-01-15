public class variables {
    int x =10;    //instance Basic_Program.variables
    static int y= 20; //static Basic_Program.variables

    public static void main(String[] args) {
        int z= 30;  //local Basic_Program.variables

        variables obj= new variables();
        System.out.println("instance Basic_Program.variables :"+ obj.x);

        System.out.println("static Basic_Program.variables :"+variables.y);

        System.out.println(";local Basic_Program.variables :"+z);
    }

}
