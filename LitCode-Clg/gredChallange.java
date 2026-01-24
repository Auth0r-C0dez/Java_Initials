public class gredChallange {
    public static void main(String[] args){
         String[] grid={"mpxz", "abcd", "wlmf"};
         String result = gridChallange(grid);
         System.out.println(result);
    }
    public static String gridChallange(String[] grid ) {
        int n = grid.length;
        char arr[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            char[] row = grid[i].toCharArray();
            java.util.Arrays.sort(row);
            arr[i] = row;        
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if(arr[j][i]<arr[j-1][i])
                    return "NO";
                
            }
            
        }return "YES";
    }
}
