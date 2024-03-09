import java.util.ArrayList;
public class New {
    public static void swap(ArrayList<Integer> list,int index1,int index2) {
        int temp = list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2,temp);
    }
    public static void main(String args[]) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(67);
        list.add(76);
        list.add(89);
        list.add(98);
        list.add(90);
        
        int index1 = 1,index2 = 3;
        System.out.println(list);
        swap(list,index1,index2);
        System.out.println(list);



    }
}
