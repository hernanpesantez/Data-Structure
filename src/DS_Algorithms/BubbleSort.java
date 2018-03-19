package DS_Algorithms;
public class BubbleSort {

    public BubbleSort(){ }


    public void sort(int [] arr ){
        int n=arr.length;
        int temp=0;

        for(int i=0;i<n-1;i++){

            for(int j=0;j<n-i-1;j++){

                if(arr[j+1]<arr[j]){

                    temp=arr[j];

                    arr[j]=arr[j+1];

                    arr[j+1]=temp;
                }
            }
        }


    }


}