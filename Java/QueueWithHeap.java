
// Сортировка с помощью кучи


public class QueueWithHeap {


    static int size = 14;

    static int[] arr = {0, 3, 4, 1, 2, 13, 23, 52, 14, 5, 6, 4, 2, 3, 1};


    public static void main(String[] args) {

        final int sizer = size;
        // Сортировка массива testArray по убыванию.

        for (int k = 1; k < sizer + 1; k++) {
            siftUp(k);
        }
        for (int k = 1; k < sizer + 1; k++) {

            int min = pickMin();
            exMin();
            arr[size + 1] = min;
        }

        for (int k = sizer; k > 0; k--) {
            System.out.printf("%d ", arr[k]);
        }

    }

    public static void insert(int x) {
        size = size + 1;
        arr[size] = x;
        siftUp(size);
    }

    public static void exMin(){

        int exMin = pickMin();
        arr[1] = arr[size];
        size--;
        siftDown(1);
    }

    // Просеивание вверх
    private static void siftUp(int i) {

        while (i > 1 && arr[i/2] > arr[i]) {

            int tmp = arr[i];
            arr[i] = arr[i/2];
            arr[i/2] = tmp;
            i = i/2;

        }
    }

    // Просеивание вниз
    private static void siftDown(int i) {

        int j;

        while(2 * i <= size) {

            j = i;

            if (arr[2 * i] < arr[i])
                j = 2 * i;

            if (2 * i + 1 <= size && arr[2 * i + 1] <= arr[j])
                j = 2 * i + 1;

            if (j == i)
                break;

            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;

            i = j;
        }

    }

    private static int pickMin() {
        return arr[1];
    }


}
