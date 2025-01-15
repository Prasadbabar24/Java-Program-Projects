package JavaDoc;

/**
 * this io the discription of java doc
 */

public class method_tag_javadoc {
    /**
     * @param args this is the parament arugument of the JavaDoc.javadoc
     */
    public static void main(String[] args) {
        System.out.println("this is the main method");
    }

    /**
     * this is the method description
     *
     * @param i enter the value of i
     * @param j enter the value of j
     * @return Additio of the two number
     * @throws Exception if i is 0
     * @deprecated this main method is deprecated plese use + Basic_Program.operator
     */
    public int add(int i, int j) throws Exception {
        if (i == 0) {
            throw new Exception();
        }
        int c;
        c = i + j;
        return c;
    }
}
