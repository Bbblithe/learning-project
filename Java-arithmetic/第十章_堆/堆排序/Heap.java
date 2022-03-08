package 第十章_堆.堆排序;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/8 19:49
 * Description:
 */


class Heap {
    private Node[] heapArray;
    private int maxSize;
    private int currentSize;

    public Heap(int max){
        maxSize = max;
        currentSize = 0;
        heapArray = new Node[maxSize];
    }

    public Node remove(){
        Node root = heapArray[0];
        heapArray[0] = heapArray[--currentSize];
        trickleDown(0);
        return root;
    }

    public void trickleDown(int index){
        int largerChild;
        Node top = heapArray[index];
        while(index < currentSize/2){
            int leftChild = index*2 + 1;
            int rightChild = leftChild + 1;

            if(rightChild < currentSize && heapArray[leftChild].getKey() < heapArray[rightChild].getKey()){
                largerChild = rightChild;
            }else{
                largerChild = leftChild;
            }
            if(top.getKey() >= heapArray[largerChild].getKey()){
                break;
            }
            heapArray[index] = heapArray[largerChild];
            index = largerChild;
        }
        heapArray[index] = top;
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

    public void displayArray(){
        for(int i = 0 ; i < maxSize ; i ++){
            System.out.print(heapArray[i].getKey() + " ");
        }
        System.out.println("");
    }

    public void insertAt(int index,Node newNode){
        heapArray[index] = newNode;
    }

    public void incrementSize(){
        currentSize++;
    }
}
