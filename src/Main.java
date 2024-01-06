public class Main {
    public static void main(String[] args) {
        int x = 1238;
        int num = 0;
        int result = x;

        boolean answer = false;
        while (true) {

            num += result % 10;
            result = result / 10;
            if (result < 1 && x % num == 0) {
                answer = true;
                break;
            } else if (result < 1 && x % num != 0) {
                answer = false;
                break;
            }
        }
        System.out.println(answer);
    }
}