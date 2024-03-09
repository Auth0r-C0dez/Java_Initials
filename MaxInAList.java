import java.util.ArrayList;
public class New {
    public static void main(String args[]) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(67);
        list.add(76);
        list.add(89);
        list.add(98);
        list.add(90);
        
        int maxValue = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++) {
            if(maxValue < list.get(i)); {
            maxValue = list.get(i);
            }
        }
        System.out.println("maximum value from the list is " + maxValue);


    }
}
