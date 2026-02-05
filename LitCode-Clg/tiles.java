public class tiles {
    public static void main(String[] args ) {
        String test1 = "FFGHJ";
        System.out.println(toChar(test1));
    }
    public static int toChar(String test1) {
        int[] freq = new int[24];
        for(char c : test1.toCharArray()) {
            freq[c-'A']++;
        }
        return tilez(freq);
    }
    public static int tilez(int[] freq) {
        int cnt =0;
        for(int i=0;i<freq.length;i++) {
            if(freq[i]>0) {
                cnt++;
                freq[i]--;
                cnt += tilez(freq);
                freq[i]++;
            }
        }return cnt;
    }
}
