public class pinCoding {
    public static void main(String[] args) {
        int[] arr = {4, 10, 1, 9, 1102, 6}; // sample encoded array

        String pin = decodePIN(arr);
        System.out.println("Decoded PIN: " + pin);
    }
    public static String decodePIN(int[] arr) {
        StringBuilder st = new StringBuilder();
        for(int num : arr) {
            int single = num;
            while(single>9) {
                int sum = 0;
                while(single>0){
                    sum+= (single%10);
                    single /=10;
                }
                single = sum;
            }
            if(single %2 !=0) {
                char ch  = (char) ('a' +(single-1));
                st.append(ch);
            }else {
                st.append(single);
            }
        } return st.toString();
    }
}
