package Arrays_Program;

public class ArrayExample {

    public static void main(String[] args) {
        // One-dimensional array
        int[] oneDimArray = new int[5];
        oneDimArray[0] = 10;
        oneDimArray[1] = 20;
        oneDimArray[2] = 30;
        oneDimArray[3] = 40;
        oneDimArray[4] = 50;

        System.out.println("One-Dimensional Array:");
        for (int i = 0; i < oneDimArray.length; i++) {
            System.out.print(oneDimArray[i] + " ");
        }
        System.out.println();

        // Two-dimensional array
        int[][] twoDimArray = new int[3][3];
        twoDimArray[0][0] = 1;
        twoDimArray[0][1] = 2;
        twoDimArray[0][2] = 3;
        twoDimArray[1][0] = 4;
        twoDimArray[1][1] = 5;
        twoDimArray[1][2] = 6;
        twoDimArray[2][0] = 7;
        twoDimArray[2][1] = 8;
        twoDimArray[2][2] = 9;

        System.out.println("Two-Dimensional Array:");
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }

        // Three-dimensional array
        int[][][] threeDimArray = new int[2][2][2];
        threeDimArray[0][0][0] = 1;
        threeDimArray[0][0][1] = 2;
        threeDimArray[0][1][0] = 3;
        threeDimArray[0][1][1] = 4;
        threeDimArray[1][0][0] = 5;
        threeDimArray[1][0][1] = 6;
        threeDimArray[1][1][0] = 7;
        threeDimArray[1][1][1] = 8;

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
