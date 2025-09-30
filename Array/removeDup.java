package arrays;

public class removeDup {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int index=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[index] != arr[i]) {
                index++;
                arr[index]=arr[i];

            }
        }
        for(int i=0;i<arr.length;i++) {
        System.out.println("duplicates removed arrray is " + arr[i]); }
    }
    
}

// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//        int arr[] = {1,1,2,2,2,3,3};
//         int k = removeDuplicates(arr);
//         System.out.println("The array after removing duplicate elements is ");
//         for (int i = 0; i < k; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     static int removeDuplicates(int[] arr) {
//         int i = 0;
//         for (int j = 1; j < arr.length; j++) {
//             if (arr[i] != arr[j]) {
//                 i++;
//                 arr[i] = arr[j];
//             }
//         }
//         return i + 1;
//     }
// }
