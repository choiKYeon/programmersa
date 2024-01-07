import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        int[] numbers = {1,2,3,4,6,7,8,0};
        Arrays.sort(numbers);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numbers.length; i++){
                stack.add(numbers[i]);
        }
        for (int j = 0; j <= 9; j++){
            stack.search(j);
            if (stack.search(j) == -1){
                answer += j;
            }
        }
        System.out.println(answer);
    }
}