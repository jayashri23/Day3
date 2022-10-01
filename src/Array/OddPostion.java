package Array;

public class OddPostion {
    public static void main(String[] args) {

        int[] arr = new int[]{34, 67, 21, 87, 91};
        System.out.println("Elements of an array present on even position:");
        //loop thr the array by increcing value of i by 2
        for (int i = 1; i < arr.length; i = i - 1) {
            System.out.println(arr[i]);
        }
    }
}