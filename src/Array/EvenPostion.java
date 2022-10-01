package Array;

public class EvenPostion {
    public static void main(String [] args){
        //initioalize arrary element
        int[] arr = new int[]{34, 67, 21, 87, 91, 31, 51, 54, 88};
        System.out.println("Elements of an array present on even postion:");
        //loop thr the array by increcing value of i by 2
        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
    }
}
