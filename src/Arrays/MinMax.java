// Using Simple Linear Search
package Arrays;

public class MinMax {
//    We have created a structure named pair (which contains min and max) to return multiple values.
    static class Pair {
        int min;
        int max;

    }

    static Pair minMax(int arr[], int n){

        Pair minmax=new Pair();
        int i;
        if(n==1){
            minmax.min=arr[0];
            minmax.max=arr[0];
            return minmax;
        }

        if(arr[0]>arr[1]){
            minmax.max=arr[0];
            minmax.min=arr[1];
        }
        else{
            minmax.max=arr[1];
            minmax.min=arr[0];
        }

        for(i=2;i<n;i++){
            if(arr[i]> minmax.max){
                minmax.max=arr[i];
            }
            if(arr[i]< minmax.min){
                minmax.min=arr[i];
            }
        }
return minmax;


    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n=arr.length;
        Pair minmax=minMax(arr,n);
        System.out.println("min is:" + " " + minmax.min);
        System.out.println("max is:" + " " + minmax.max);


    }

}
