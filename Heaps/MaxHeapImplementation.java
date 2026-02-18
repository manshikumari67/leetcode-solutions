package Heaps;

class Heap{
    int arr[];
    int idx=1;

    int peek(){
        if(size()==0){ 
             System.out.println("Heap is empty");
             return -1;
        }
        return arr[1]; // max element
    }

    void add(int ele){
        if(idx==arr.length){
            System.out.println("Heap is full");
            return;
        }
        arr[idx++]=ele;

        // rearrangement (bottom to top)
        int root=idx-1;
        while(root!=1){
            int parent=root/2;

            // CHANGE: parent < child
            if(arr[parent] < arr[root]){
                int temp=arr[root];
                arr[root]=arr[parent];
                arr[parent]=temp;

                root=parent;
            }
            else break;
        }
    }

    int remove(){
        if(idx==1){ 
             System.out.println("Heap is empty");
             return -1;
        }

        int max=arr[1];

        arr[1]=arr[idx-1];
        idx--;

        // rearrangement (top to bottom)
        int root=1;

        while(root<=size()){

            int left=2*root;
            int right=2*root+1;

            int leftVal=(left<=size())?arr[left]:Integer.MIN_VALUE;
            int rightVal=(right<=size())?arr[right]:Integer.MIN_VALUE;

            // CHANGE: parent > children
            if(arr[root] > leftVal && arr[root] > rightVal)
                break;

            else{

                if(leftVal > rightVal){

                    int temp=arr[root];
                    arr[root]=arr[left];
                    arr[left]=temp;

                    root=left;
                }
                else{

                    int temp=arr[root];
                    arr[root]=arr[right];
                    arr[right]=temp;

                    root=right;
                }
            }
        }

        return max;
    }

    void display(){
        for(int i=1;i<idx;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    int size(){
        return idx-1;
    }

    Heap(int capacity){
        arr=new int[capacity+1];
    }
}

public class MaxHeapImplementation {
     public static void main(String[] args) {

        Heap h=new Heap(10);

        h.add(10);
        h.add(15);
        h.add(8);
        h.add(9);
        h.add(4);

        h.display();

        System.out.println(h.remove());

        h.add(20);

        h.display();

        System.out.println(h.remove());

        h.display();
    }
}
