import java.util.Random;
import java.util.Scanner;
public class ran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        int guess;
        int attempts=0;
        int num= rn.nextInt(1,11);

        System.out.println("Welcome to number guessing game ");


        do {
            System.out.print("Choose a number ");
            guess= sc.nextInt();
            attempts++;
            String wr = (guess == num) ? "Gotcha " :  "OOpz ";
            System.out.print(wr);
            if(guess > num) {
                System.out.println("TO high");
            } else if (guess < num) {
                System.out.println("too low");
            } else {
                System.out.println("You got the right number in "+attempts + " attempts");
            }

            

        }while(guess!=num);
        
        sc.close();

    }
    
}
