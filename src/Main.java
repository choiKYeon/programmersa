import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        Collections.sort(list);

        int[] result = new int[list.size()];
        if(list.size() == 0){
            result = new int[]{-1};
        }
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);

        }
        System.out.println(list);
    }
}