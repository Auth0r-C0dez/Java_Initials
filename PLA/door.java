package pla;

public class door {
    public static void main(String[] args) {
        int n = 100;
        boolean[] status = new boolean[n+1];
        for(int i=1;i<=n;i++) {
            for(int door = i;door<=n;door+= i) {
                status[door] =! status[door];
            }
        }
        
        int open =0; int close = 0;
        for(int i=0;i<=n;i++){
            if(status[i] == true){
                open=open+1;}
            else{
                close= close+1;
            }
        }
        System.out.println("Number of doors open: " + open);
        System.out.println("Number of doors closed: " + close);
        System.out.print("Open doors: ");
        for (int i = 1; i <= n; i++) {
            if (status[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    
    }
}
