package DS_Algorithms;
public class SelectionSort{
    public void sort(int []arr){
        for (int i = 0; i <arr.length ; i++) {

            int index=i;

            for(int j=i+1;j<arr.length;j++){

                if(arr[j]<arr[index]){

                    //searching for smallest index
                    index=j;

                }

            }

            //temp variable will contain the small number
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;

        }

    }
}
