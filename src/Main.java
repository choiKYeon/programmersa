public class Main {
    public static void main(String[] args) {
        String answer = "";
        String s = "abced";
        String[] str = new String[s.length()];
        str = s.split("");
        if (s.length() % 2 != 0){
            answer = str[s.length()/2];
        } else {
            answer = str[s.length()/2] + str[s.length()/2 - 1];
        }
        System.out.println(answer);
    }
}