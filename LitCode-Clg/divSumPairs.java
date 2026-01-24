public class divSumPairs {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 6};
        System.out.println(divisibleSumPairs(5, ar));
    }
    public static int divisibleSumPairs(int n, int[] arr) {
        int cnt =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if((arr[i]+arr[j]) % n ==0) {
                    cnt++;
                }
            }
            
        }return cnt;
    }
}
