package pla;

public class maxProduct {
    public static void main(String[] args) {
        int arr[] ={4,0,-2,6};
        int max = arr[0];
        for(int i=0;i<arr.length;i++) {
            int product = 1;
            for(int j=i;j<arr.length;j++) {
                product *= arr[j];
            if(product > max) {
                max = product;
            }
        }
        }
        System.out.println("max product of given array " + max);
    }
}
