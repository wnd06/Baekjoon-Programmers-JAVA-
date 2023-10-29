import java.io.*;
import java.util.*;

public class Solution {
    static int max;
    static int min;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = 10;
        for (int i = 1; i <= T; i++) {
            max = 0;
            min = 0;
            int dumpChance = Integer.parseInt(br.readLine());
            int[] width = new int[100];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < width.length; j++) {
                width[j] = Integer.parseInt(st.nextToken());
            }
            int result = search(dumpChance, width);
            System.out.println("#" + i + " " + result);
        }
    }
    public static int search(int dumpChance, int[] width) {
        int answer = result(width);

        if(dumpChance == 0) return answer;
        else return search(dumpChance - 1, width);

    }

    public static int result(int[] width) {
        Arrays.sort(width);

        min = width[0];
        max = width[width.length - 1];

        width[0] += 1;
        width[width.length - 1] -= 1;

        return max-min;
    }
}
