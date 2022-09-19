package recusrion;

public class CheckArraySorted {

    public static int arraySorted(int arr[], int n){


        if(n==0|| n==1){
            return 1;
        }

        if(arr[n-1]<arr[n-2]){
            return 0;
        }

        return arraySorted(arr,n-1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,20,4,5,6,7};
        int n=arr.length;
        if(arraySorted(arr,n) !=0)
            System.out.println("yes");


        else
            System.out.println("no");

}
}