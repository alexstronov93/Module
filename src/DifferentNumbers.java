import java.util.Arrays;

public class DifferentNumbers {
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 1, 2, 2, 4, 4};
        System.out.println("The count different number is " + diffCount(arr));
    }

    public static int diffCount(int[] array) {
        int diffcount = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] == array[i]) {
                    diffcount--;
                    break;
                }
            }
            diffcount++;
        }
        return diffcount;
    }
}
