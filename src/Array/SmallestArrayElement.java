package Array;

public class SmallestArrayElement {
    public static void main(String[] args) {
        // initioalize array element

        int[] arr = new int[]{90, 80, 78, 67, 45, 23};
        //  initalize min array first element
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
          {
            if (arr[i] < min)
                min = arr[i];
           }
                System.out.println("Smallest element in array:" + min);
            }
        }


