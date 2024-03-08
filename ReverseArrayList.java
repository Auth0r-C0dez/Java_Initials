import java.util.ArrayList;
public class New {
    public static void main(String args[]) {
        ArrayList<Integer>list = new ArrayList<>();//ways to declare a array list.
        //arraylist is part of java collection framework
        //these are the ways to add elements to a array list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);

        System.out.println(list.size()); //here the list.size is a method and hence the brackets with it.

        //for priniting the reverse array list'

        for(int i=list.size()-1; i >=0 ;i--) {
            System.out.print(list.get(i) + " ");
        }

    }
}
