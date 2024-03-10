import java.util.ArrayList;
import java.util.Collections;
public class New {
   
    public static void main(String args[]) {
       //multi dimensional array list r used to store other aray list
     ArrayList<ArrayList<Integer>> actualList = new ArrayList<>();//syntax for creating multi dimensional  array
     ArrayList<Integer> list1 = new ArrayList<>() ;
     ArrayList<Integer> list2 = new ArrayList<>() ;
     ArrayList<Integer> list3 = new ArrayList<>() ;

     for(int i=1; i<=5;i++) {
        list1.add(i*1);//for adding multiplication table of 1 in list1
        list2.add(i*2);//for adding multiplication table of 2 in list1
        list3.add(i*3);//for adding multiplication table of 3 in list1
    
     }
     //adding the individual list to actualList
     actualList.add(list1);
     actualList.add(list2);
     actualList.add(list3);

     //printing main list
     System.out.println(actualList);


    }
}
