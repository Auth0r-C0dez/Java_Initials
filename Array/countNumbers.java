package arrays;

public class countNumbers {
    public static void main(String args[]) {
        int arr [] ={ 4,1,2,1,2};
        System.out.println("the namber that appears once is " + useXor(arr));
    }

    public static int useXor(int [] arr) {
        int n = arr.length;
         int xor1=0;
         for(int i=0;i<n;i++) {
            xor1=xor1 ^ arr[i];
         } return xor1;

    }
    // public static int countNum(int[] arr) {
        
    //     for(int i=0;i<arr.length;i++) {
    //         int num = arr[i];
    //         int count = 0;
    //         for(int j=0;j<arr.length;j++) {
    //             if(num == arr[j]) {
    //                 count ++;
    //             }if(count==1) return num;
    //         }
    //     }return -1;
        
    // }
    
}
