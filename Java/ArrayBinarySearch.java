
import java.util.Random;


public class ArrayBinarySearch {

    static final int size = 5;
    static int[] arr = new int[size];


    public static void main(String[] args) {

        Random ran = new Random();
        initArray(arr,ran);

        System.out.println("Отсортированный массив чисел");
        for (int i: arr)
            System.out.printf("%d ", i);
        System.out.println();

        System.out.printf("%b %d\n", binarySearch(9), binarySearchInt(9));
        System.out.println(binarySearchInt(4) - binarySearchInt(3)); // Найти количество элементов, равных искомому числу

    }


    // Двоичный поиск числа + нахождение его первого вхождения, если таковых несколько
    private static boolean binarySearch(int x) {

        int left = -1;
        int right = size;
        int mid;

        while(right - left > 1) {

            mid = left + (right - left) / 2;
            if (arr[mid] >= x)
                right = mid;
            else
                left = mid;

        }
        if (right < size + 1 && arr[right] == x)
            return true;
        else
            return false;

    }

    // Двоичный поиск числа + нахождение его индекса. Если такого числа нет, то найдется индекс первого числа >= искомого

    private static int binarySearchInt(int x) {

        int left = -1;
        int right = size;
        int mid;

        while(right - left > 1) {

            mid = left + (right - left) / 2;
            if (arr[mid] >= x)
                right = mid;
            else
                left = mid;

        }
        return right;

    }

    private static void initArray(int arr[], Random ran) {

        int tmp;
        arr[0] = 1;
        for (int i = 1; i < size; i++) {

            while ((tmp = ran.nextInt(15) + 1) < arr[i - 1]);
            arr[i] = tmp;
        }

    }



}
