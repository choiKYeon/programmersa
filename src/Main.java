import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {101, 102};
        List<Integer> list = new ArrayList<>();
        if (arr.length == 1){
            arr = new int[]{-1};
        }
        for (int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        Arrays.sort(arr);
        for (int j = 0; j < arr.length; j++){
            if (list.get(j) == arr[0]){
                list.remove(list.get(j));
                break;
            }
        }
        int[] result = new int[list.size()];
        for (int x = 0; x < list.size(); x++){
            result[x] = list.get(x);
        }
        System.out.println(list);
    }
}