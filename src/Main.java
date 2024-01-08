public class Main {
    public static void main(String[] args) {
        int answer = 0;
       int left = 13;
       int right = 17;
       for (int i = left; i <= right; i++){
           int number = num(i);
           if (number % 2 == 0){
               answer += i;
           }else {
               answer -= i;
           }
       }
        System.out.println(answer);
    }
    public static int num(int num){
        int result = 0;
        for (int i = 1; i * i <= num; i++){
            if (i * i == num){
                result++;
            } else if (num % i == 0) {
                result += 2;
            }
        }
        return result;
    }
}
// 두 정수 left와 right가 매개변수로 주어집니다.
// left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.