import java.io.*;
import java.util.*;

public class Solution {
    static int[] width;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = 10;
        for (int i = 1; i <= T; i++) {
            int dumpChance = Integer.parseInt(br.readLine());
            width = new int[100];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < width.length; j++) {
                width[j] = Integer.parseInt(st.nextToken());
            }
            search(dumpChance, width);
            Arrays.sort(width);
            System.out.println("#" + i + " " + (width[width.length-1] - width[0]));
        }
    }
    public static void search(int dumpChance, int[] width) {

        if(dumpChance == 0) return;

        Arrays.sort(width);
        width[0]++;
        width[width.length-1]--;

        search(dumpChance - 1, width);

    }

}
