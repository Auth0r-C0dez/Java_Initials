package pla;

public class apple {
    public static void main (String[] args ) {
        int apple = 12;
        int count = 0;
        int sum = 0;
        while(sum < apple) {
            count++;
            sum += (12* count * count);
        }
        System.out.println(8* count);
    }
}
