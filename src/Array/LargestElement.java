package Array;




public class LargestElement {
   // initionaliz array
    public static void main(String [] args){
        int[] arr = new int[]{20 ,56,89,32,61};
        //initializ max array with first element of arr
        int max=arr[0];
        //loop thr the array
    for(int i=0;i<arr.length;i++){
        //compare elements of array with max
        if(arr[i]>max)
            max=arr[i];
    }
    System.out.println("Largest element present in given"+max);
    }
}
