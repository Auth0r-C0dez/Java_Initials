package pla;

public class majority {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 3,2};
        System.out.println("majority element is " + look(nums));
    }
    
    public static int look(int[] arr) {
        
        int candidate = 0;
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];  
                count = 1;
            } else if (arr[i] == candidate) {
                count++; 
            } else {
                count--;  
            }
        }
        
        
        int frequency = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candidate) {
                frequency++;
            }
        }
        
        
        if (frequency > arr.length / 2) {
            return candidate;
        }
        return -1;  
    }
}
