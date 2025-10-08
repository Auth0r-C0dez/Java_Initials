package pla;

public class leaders {
    public static void main(String[] args) {
        int[] arr= {16,17,4,3,5,2};
        System.out.println("Leader are ");
        int max = arr.length -1 ;
        System.out.println(max);
        for(int i=arr.length-2;i>=0;i--) {
            if(arr[i] > max ) {
                max = arr[i];
                System.out.print(max);
            }
        }
    }
}
