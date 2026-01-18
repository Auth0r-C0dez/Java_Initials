public class arrayManipulation {
    public static void main(String[] args) {
        int[][] q = {{2,4,5},{3,6,3},{1,7,10}};
        System.out.println(arreyManipulation(7, q));
    }
    public static long arreyManipulation(int n,int[][] q) {
        long[] arr = new long[n+2];
        for(int[] qe : q) {
            int a = qe[0];
            int b = qe[1];
            int c = qe[2];
            arr[a]+= c;
            arr[b+1] -=c;
        }
        long max = 0;
        long crr = 0;
        for (int i = 1; i <=n; i++) {
            crr +=arr[i];
            if(crr>max) max=crr;
        }return max;
    }
}
