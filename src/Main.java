
public class Main {
    public static void main(String[] args) {
        int[][] arr1 = {{1}, {2}};
        int[][] arr2 = {{3}, {4}};

        int[][] answer = new int[arr1.length][arr2.length];
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println(answer[0][1]);
    }
}
