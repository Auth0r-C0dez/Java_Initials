public class percentChar {
    public static void main(String[] args) {
        analyzeString("My e-mail: eMail_Address321@anymail.com");
    }
    public static void analyzeString(String s) {
        int n = s.length();
        int other=0;
        int small=0;
        int cap = 0;
        int num=0;
        for(char c: s.toCharArray()) {
            if(Character.isUpperCase(c)) cap++;
            else if(Character.isLowerCase(c)) small++;
            else if(Character.isDigit(c)) num++;
            else other++;
        }
        System.out.println("Other " +(other*100)/n);
        System.out.println("Caps " + (cap*100)/n);
        System.out.println("Smalls "+(small*100)/n);
        System.out.println("Num " + (num*100)/n);
    }
}
