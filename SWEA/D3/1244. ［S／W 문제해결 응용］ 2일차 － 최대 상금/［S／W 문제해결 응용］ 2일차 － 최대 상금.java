import java.io.*;
import java.util.*;

class Solution {
    static String[] strArr;
    static int max, changeCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String number = st.nextToken();
            changeCount = Integer.parseInt(st.nextToken());
            strArr = number.split("");
            max = 0;

            if(changeCount > strArr.length)
                changeCount = strArr.length;

            dfs(0, 0);

            sb.append("#").append(i + 1).append(" ").append(max).append("\n");
        }
        System.out.print(sb);
    }
    public static void dfs(int start, int count) {
        String result = "";
        if(changeCount == count) {
            for (String tmp : strArr) {
                result += tmp;
            }
            max = Math.max(max, Integer.parseInt(result));
            return;
        }

        for (int i = start; i < strArr.length; i++) {
            for (int j = i + 1; j < strArr.length; j++) {

                    String temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                    dfs(i, count + 1);
                    temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
              
            }
        }
    }
}


