import java.util.Random;

public class ArrayQuickSort {

    static int len = 5;
    static Random ran = new Random();

    public static void main(String[] args) {

        int[] arr = new int[len];

        initArray(arr, ran);

        for (int i: arr)
            System.out.printf("%d ", i);
        System.out.println();

        quickSort(arr, 0, arr.length - 1);

        for (int i: arr)
            System.out.printf("%d ", i);

    }


    static int partition(int arr[], int left, int right)
    {
        int i = left, j = right;
        int tmp;
        int x = arr[ran.nextInt(right - left) + left];
        //int x = arr[left];

        while (i <= j) {

            while (arr[i] < x)
                i++;

            while (arr[j] > x)
                j--;

            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }

        }

        return i;
    }

    static void quickSort(int arr[], int left, int right) {

        int mid = partition(arr, left, right);

        if (mid - 1 > left)
            quickSort(arr, left, mid - 1);

        if (mid < right)
            quickSort(arr, mid, right);

    }


    public static void initArray(int arr[], Random ran) {

        for (int i = 0; i < len; i++) {
            arr[i] = ran.nextInt(16) + 1;
        }

    }
}
