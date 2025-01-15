package Arrays_Program;

public class Types_of_Array {
    public static void main(String[] args) {

        // One-dimensional array
        int[] oneDimArray = {10, 20, 30, 40, 50};
        System.out.println("One-Dimensional Array:");
        for (int i = 0; i < oneDimArray.length; i++) {
            System.out.print(oneDimArray[i] + " ");
        }
        System.out.println();

        // Two-dimensional array
        int[][] twoDimArray = {
                {1, 2},
                {3, 4}
        };
        System.out.println("Two-Dimensional Array:");
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }

        // Three-dimensional array
        int[][][] threeDimArray = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {11, 12, 13},
                        {14, 15, 16},
                        {17, 18, 19}
                }
        };
        System.out.println("Three-Dimensional Array:");
        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray[i].length; j++) {
                for (int k = 0; k < threeDimArray[i][j].length; k++) {
                    System.out.print(threeDimArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
