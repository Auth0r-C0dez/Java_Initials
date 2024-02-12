import java.util.*;//inport header file is used to import al the funtions methods etc.
public class array {
    public static int stock(int prices[]) {//function for performing basic operations 
        int buy= Integer.MAX_VALUE;
        int mprofit = 0;//max profit is initialised with 0
        for(int i=0;i<prices.length;i++) {
            if (buy<prices[i]) {
                int profit =prices[i] - buy;
                mprofit=Math.max(mprofit,profit);//in built method is used to take the max value from max profit and profit.
            } else {
                buy =prices[i];
            }
        }
        return mprofit;//we get a return bkx we are using a int return type funtion
    }
    public static void main (String args[]) {//main function
     int prices[] = {7,1,5,3,6,4};//an array is defined indicating prices of stocks
     System.out.print(stock(prices));//previous function is called
    }
}
