class Solution {
    public int[] plusOne(int[] digits) {
        int last = digits.length - 1;

        if(digits[last] <9) {
            digits[last]++;
            return digits;
        }
        for(int i=last;i>=0;i--) {
            if(digits[i] == 9) {
                digits[i] = 0;

            } else {
                digits[i]++;
                return digits;
            }
            
        }
        int arr[] = new int[digits.length +1];
            arr[0] =1;
        return arr;
    }
}
        // int  val = digits[last];
        // val ++;
        // digits[last] = val;
        // int arr[] = new int[digits.length]  ;
        // for(int i=0;i<digits.length;i++) {
        //     arr[i] = digits[i];
        // }
        // return arr;

    
