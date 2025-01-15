package Arrays_Program;

public class ps_array {
    public static void main(String[] args) {
//        int [] marks={ 78,78,67,56,78,89};
//        int sum =0;
//        for (int element:marks){
//            sum = sum+ element;
//        }
//        System.out.println("total sum ="+sum);


////        problem 02
//        int [] marks={ 78,78,67,56,78,89};
//        int num=56;
//        boolean isinarray =false;
//        for (int element:marks){
//            if (num==element){
//             isinarray=true;
//             break;
//            }
//        }
//        if (isinarray){
//            System.out.println("the no is match in the Arrays_Program.array");
//        }
//        else {
//            System.out.println("the Arrays_Program.array is not present in the Arrays_Program.array");
//        }
//        problem no 3
//        int [][] mat1={{1,2,3},
//                       {4,5,6}};
//        int [][] mat2={{7,8,9},
//                       {3,5,7}};
//        int [][] result={{0,0,0},
//                         {0,0,0}};
//        for (int i=0; i<mat1.length; i++){
//            for (int j=0; j<mat1[i].length; j++){
//                System.out.format("the seeting up the value i=%d and j=%d\n",i,j);
//                result[i][j] =mat1[i][j] + mat2[i][j];
//            }
//        }
//        for (int i=0; i<mat1.length; i++){
//            for (int j=0; j<mat1[i].length; j++){
//                System.out.print(result[i][j] + " ");
//                result[i][j] =mat1[i][j] + mat2[i][j];
//            }
//            System.out.println();
//        }
//        problem no 5

//        int []arr={1,2,3,4,5,6};
//        int temp;
//        int l= arr.length;
//        int n= Math.floorDiv(l,2);
//        for (int i=0; i<n; i++){
//
//            temp=arr[i];
//            arr[i]=arr[l-i-1];
//            arr[l-i-1]=temp;
//        }
//        for (int element:arr){
//            System.out.print(element + " ");
//        }
        int []arr={1,9,3,4,5,6};
        boolean issorted=true;
        for (int i=0; i< arr.length-1; i++){
            if (arr[i]>arr[i+1]){
                issorted=false;
                break;
            }
        }
        if (issorted){
            System.out.println("the Arrays_Program.array is sorted");
        }
        else {
            System.out.println("the Arrays_Program.array is not sorted");
        }
    }
}
