package arrays;

public class rotateRight {
    public static void main(String args[]) {
    
    int[] arr = {1,2,3,4,5,6,7};
    int n = arr.length;
    int k = 3;
    Rotatetoright(arr, n, k);
    System.out.println("After Rotating the elements to right ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  public static void Rotatetoright(int arr[], int n, int k) {
    if (n == 0)
      return;
    k = k % n;
    if (k > n)
      return;
      int [] temp = new int[k];
      for(int i=n-k;i<n;i++) {
        temp[i-n+k] = arr[i];
      }
      for(int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }
      for(int i=0;i<k;i++) {
        arr[i] = temp[i];
      }
  }
}
