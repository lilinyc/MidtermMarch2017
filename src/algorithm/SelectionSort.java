package algorithm;

/**
 * Created by Lili on 4/24/2017.
 */
public class SelectionSort {
    public static void sort(int list[]) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[i]) {
                    int temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }
    }
}
