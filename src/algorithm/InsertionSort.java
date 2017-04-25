package algorithm;

/**
 * Created by Lili on 4/24/2017.
 */
public class InsertionSort {
    public static void sort(int list[]) {
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j] < list[j - 1]) {
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                }

            }
        }
    }
}
