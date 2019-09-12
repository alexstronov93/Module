import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 1, 2 ,2, 3,4, 4};
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if (i!=arr.length-1){
                if (arr[i]!=arr[i+1]){
                    count++;
                }
            }
            else {
                count++;
            }
        }
        System.out.println(count);
    }
}
