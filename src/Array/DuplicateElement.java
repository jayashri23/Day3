package Array;

public class DuplicateElement {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {11, 55, 33, 11, 20, 55, 33, 99};

        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}