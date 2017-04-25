package algorithm;

/**
 * Created by Lili on 4/24/2017.
 */
public class BubbleSort {
    public static void sort(int list[]) {
        int j;
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}
