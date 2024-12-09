#include <iostream>
using namespace std;

class heap {
    public:
    int arr[100];
    int size ;
    heap() {
        arr[0] = -1;
        size = 0;
    }
    //the insertion code takes time complexity of logn
    void insert(int val) {
        size = size +1 ;//increasing the size of the array
        int index = size; //giving the value of size to the array
        arr[index ] = val; // puttin the new value in the new index

        while(index >1) {
            int parent = index/2; //finiding the parent  index
            if(arr[parent] < arr[index]) {
                swap(arr[parent],arr[index]); //swaping the values as in treee the higher value stays in above
                index = parent;
            }
            else {
                return;
            }

        }

    }
    void print() {
        for(int i=1; i<=size;i++) {
            cout<<arr[i] <<" ";
        }
        cout<<endl;
    }
    //deleting also takes time complexity of logn
    void del () {
        if(size == 0) {
            cout<<"noting to delete" <<endl;
            return;
        }
        //putting the last element in the first element
        arr[1] = arr[size]; //swapping the values
        size--; //decreasing the size and rwmoving the last element

        //now re organising the tree
        int i=1;
        while(i <size) {
            int leftindex = 2*i;
            int rightindex = 2 *i + 1;
            if(leftindex < size && arr[i] <arr[leftindex]) {
                swap(arr[i],arr[leftindex]);
                i = leftindex;
            }
            else if(rightindex < size && arr[i] < arr[rightindex]) {
                swap(arr[i] , arr[rightindex]);
                i= rightindex;
            }
            else {
                return;
            }
        }

    }
};
int main() {
    heap h ;
    h.insert(50);
    h.insert(55);
    h.insert(53);
    h.insert(52);
    h.insert(54);
    h.print();
    h.del();
    h.print();

}
