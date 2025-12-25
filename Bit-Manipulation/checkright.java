public class checkright {
    public static void main(String[] args) {
        int n = 5;
        int i = 2;
        System.out.println(checking(n, i));

    }
    private static boolean checking(int n , int i ) {
        return (1&(n>>i))!=0;
    }
}
