public class Main {
    public static void main(String[] args) {
        int a = -3;
        int b = 5;
        int bi = 0;
        int sm = 0;
        int result = 0;

        if (a >= b){
            bi = a;
            sm = b;
        } else bi = b; sm = a;

        for (int i = sm; i <= bi; i++){
            result += i;
        }
        System.out.println(result);
    }
}