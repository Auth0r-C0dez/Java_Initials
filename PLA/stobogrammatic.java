package pla;
import java.util.Scanner;
public class stobogrammatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        String s = sc.nextLine();
        int left = 0;
        int right = s.length()-1;
        boolean check = true;
        while(left<=right) {
            char l = s.charAt(left);
            char r = s.charAt(right);
             if ((l == '0' && r == '0') || 
                (l == '1' && r == '1') || 
                (l == '6' && r == '9') || 
                (l == '8' && r == '8') || 
                (l == '9' && r == '6')) {
                    left++;
                    right--;
                } else {
                    check = false;
                    break;
                }
                
        }
        if(check) {
                    System.out.println(s+" is a stobogrammatic number.");
                }else {
                    System.out.println(s+" is not a stobogrammatic number.");
                }
        sc.close();
    }
    
}
