package DS_Algorithms;


public class BinarySearch {

    public BinarySearch(){ }

    public boolean search(int searchValue,int arr[]){
         int minIndex, midIndex, maxIndex;
         minIndex=0;
         maxIndex=arr.length-1;
        while (maxIndex>=minIndex){
            midIndex=(int)(minIndex+maxIndex)/2;
            if(arr[midIndex]==searchValue){
                return true;
            }else if(arr[midIndex]<searchValue){
                minIndex=midIndex+1;

            }else {
                maxIndex=midIndex-1;
            }

        }
        return false;

    }
}
