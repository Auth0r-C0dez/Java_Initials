package pla;

public class permutation {
    public static void main(String[] args) {
        String s = "ABC";
        char[] arr = s.toCharArray();
        permute(arr,0);
    }
    public static void permute (char[] a, int fi) {
        if(fi== a.length-1) {
            System.out.println(new String(a));
            return ;
        }
            for(int i=fi;i<a.length;i++) {
                swap(a,i,fi);
                permute(a,fi+1);
                
                swap(a,i,fi);
            }
        
    }
    public static void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
}
