import java.util.*;
public class DivAndCon {//using the divide and conquer algorithim
    public static void parray(int toSort[]) {
        for(int i=0;i<toSort.length-1;i++) {
            System.out.print(toSort[i]+" "); 
        }
        System.out.println();
    }
    public static void mergeSort(int toSort[],int si,int ei) {//si=starting index and ei= ending index
        if(si >= ei) {
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(toSort,si,mid);
        mergeSort(toSort,mid+1,ei);
        merge(toSort,si,mid,ei);
    
    }
    public static void merge(int toSort[],int si,int mid,int ei) {
        int temp[] = new int[ei-si+1];
        int i= si;
        int j= mid+1;
        int k=0;
        while(i<=mid && i<=ei) {
            if (toSort[i] < toSort[j]) {
                temp[k] = toSort[i];
                i++;
            } else {
                temp[k] = toSort[j];
                j++;
            }
            k++;
        }
        //for left part
        while(i <= mid) {
            temp[k++] = toSort[i++];
        }
        //for right part
        while(j <=ei) {
            temp[k++] = toSort[j++];
        }
        //copying temp array to original array
        for(k=0, i = si; k <temp.length; k++,i++) {
            toSort[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        int toSort[]={3,2,5,6,2,3};
        mergeSort(toSort,0,toSort.length-1);
        parray(toSort);

    }

}
