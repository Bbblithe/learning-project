package 第十章_堆.编程作业.升序堆;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/6 16:05
 * Description:
 */


public class Heap {
    private Node[] heapArray;
    private int maxSize;
    private int currentSize;

    public Heap(int max){
        maxSize = max;
        currentSize = 0;
        heapArray = new Node[maxSize];
    }

    public boolean isEmpty(){
        return currentSize== 0;
    }

    public boolean insert(int key){
        if(currentSize == maxSize){
            return false;
        }
        Node newNode = new Node(key);
        heapArray[currentSize] = newNode;
        trickleUp(currentSize++);
        return true;
    }

    public Node remove(){
        Node root = heapArray[0];
        heapArray[0] = heapArray[--currentSize];
        trickleDown(0);
        return root;
    }


    private void trickleUp(int index) {
        int parent = (index - 1)/2;
        Node bottom = heapArray[index];
        while(index > 0 && heapArray[parent].getKey() > bottom.getKey()){
            heapArray[index] = heapArray[parent];
            index = parent;
            parent = (parent -1)/2;
        }
        heapArray[index] = bottom;
    }

    private void trickleDown(int index){
        int smallerChild;
        Node top = heapArray[index];
        while(index < currentSize/2){
            int leftChild = index*2 + 1;
            int rightChild = leftChild + 1;

            if(rightChild < currentSize && heapArray[leftChild].getKey() < heapArray[rightChild].getKey()){
                smallerChild = leftChild;
            }else{
                smallerChild = rightChild;
            }
            if(top.getKey() <= heapArray[smallerChild].getKey()){
                break;
            }
            heapArray[index] = heapArray[smallerChild];
            index = smallerChild;
        }
        heapArray[index] = top;
    }

    public boolean change(int index,int newValue){
        if(index < 0 || index >= currentSize){
            return false;
        }
        int oldValue = heapArray[index].getKey();
        heapArray[index].setKey(newValue);
        if(oldValue > newValue){
            trickleUp(index);
        }else{
            trickleDown(index);
        }
        return true;
    }

    public void displayHeap(){
        System.out.print("heapArray: ");
        for(int m = 0 ; m < currentSize ; m++){
            if(heapArray != null){
                System.out.print(heapArray[m].getKey() + " ");
            }else{
                System.out.print("-- ");
            }
        }
        System.out.println("");

        int nBlanks = 32;
        int itemsPerRow = 1;
        int column = 0;
        int j = 0 ;
        String dots = "-----------------------------";
        System.out.println(dots + dots);

        while(currentSize > 0){
            if(column == 0){
                for(int k = 0 ; k < nBlanks ; k ++){
                    System.out.print(' ');
                }
            }
            System.out.print(heapArray[j].getKey());
            if( ++j == currentSize){
                break;
            }

            if(++column == itemsPerRow){
                nBlanks/=2;
                itemsPerRow *= 2;
                column = 0;
                System.out.println("");
            }else{
                for(int k = 0 ; k < nBlanks * 2 - 2 ; k ++){
                    System.out.print(" ");
                }
            }
        }
        System.out.println("\n " + dots + dots);
    }


}
