import java.util.ArrayList;
import java.util.Collections;
public class New {
   
    
    public static void main(String args[]) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(767);
        list.add(176);
        list.add(89);
        list.add(298);
        list.add(90);

        System.out.println("List as it is");
        
        System.out.println(list);

        System.out.println("List in ascending order");
        Collections.sort(list);//for sorting in ascending order
        System.out.println(list);
        //for sorting in descending order

         System.out.println("List in descending order");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);


    }
}
