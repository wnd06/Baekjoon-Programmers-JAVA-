import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] arr = new int[n][n];
        int searchnum = Integer.parseInt(br.readLine());

        int x = -1;
        int y = 0;
        int direction = 1;
        int num = n * n;
        int answerX = 0;
        int answerY = 0;
        while (n > 0) {
            for (int i = 0; i < n; i++) {
                x += direction;
                if(num == searchnum) {
                    answerX = x + 1;
                    answerY = y + 1;
                }
                arr[x][y] = num--;
            }
            n--;
            for (int i = 0; i < n; i++) {
                y += direction;
                if(num == searchnum) {
                    answerX = x + 1;
                    answerY = y + 1;
                }
                arr[x][y] = num--;
            }
            direction *= -1;

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
        System.out.println(answerX + " " + answerY);
    }
}
