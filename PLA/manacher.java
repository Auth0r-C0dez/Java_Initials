package pla;

public class manacher {
    public static void main(String[] args) {
        String s = "abbaacc";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s ) {
        if(s== null || s.length()==0) return "";
        StringBuilder t = new StringBuilder("^");
        for(char c:s.toCharArray()) {
            t.append("#").append(c);
        }t.append("#$");
        int n = t.length();
        int[] p = new int[n];
        int centre = 0; 
        int right =0;
        for(int i=1;i<n-1;i++) {
            int mirror = 2*centre  - i;
            if(i<right) {
                p[i] = Math.min(right-i,p[mirror]);
            }
            while(t.charAt(i+(1+p[i])) == t.charAt(i-(1+p[i]))) {
                p[i]++;
            }
            if(i+p[i] > right) {
                centre = i;
                right = i+p[i];
            }
        }
        int maxLen = 0;
        int centreIndex = 0;
        for(int i=1;i<n-1;i++) {
            if(p[i]>maxLen) {
                maxLen = p[i];
                centreIndex = i;
            }
        }
        int start = (centreIndex -  maxLen) / 2;
        return s.substring(start,start+maxLen);

    }
}
