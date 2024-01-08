public class Main {
    public static void main(String[] args) {
        long result = 0;
        int answer = 0;
        int price = 3;
        int money = 20;
        int count = 4;
        for (int i = 1; i <= count; i++){
            answer += price*i;
        }
        if (money <= answer){
            result = answer - money;
        } else {
            result = 0;
        }
        System.out.println(result);

    }
}
