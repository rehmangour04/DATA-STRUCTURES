package sorting;
public class SelectionSort {
   public static  void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
               int minIdx = i;
               for (int j = i+1; j < n; j++)
                if (arr[j] < arr[minIdx])
                   minIdx = j;
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        sort(arr);
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+ " ");
        }

    }

}
