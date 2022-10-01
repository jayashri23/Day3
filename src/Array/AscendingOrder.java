package Array;

public class AscendingOrder {
    public static void main(String [] args) {
        int[] arr = new int[]{90, 80, 70, 50, 30};
        int temp = 0;
        //Display original array
        System.out.println("Elements of array original:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
        //sort array in acsending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    System.out.println();
    //Display elements of array after sorting
    System.out.println("Elements of array sorting in ascending order:");
    for( int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]+ "");
    }
}

