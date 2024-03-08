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
        System.out.println(list);

        //for getting an element at a given index
        int element = list.get(3);
        System.out.println(element);

        //for deleting an element in a array list with passing the index of the element 
        list.remove(2);
         System.out.println(list);

         //for setting an element or updatng an elemet at a given index
         list.set(2, 10);//first we pass the index then we pass the new element
         System.out.println(list);

            //to check if a given element exists in the list or not
            System.out.println(list.contains(10));

            //to add a given element to a aray list and update the arraylist further
            list.add(1,25);//in this first we pass the index then we pass the element.

    }
}
