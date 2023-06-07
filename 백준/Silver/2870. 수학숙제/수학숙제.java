

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<BigInteger> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];
        //입력
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        //문제 시작
        String[] intarr = new String[N];

        for (int i = 0; i < N; i++) {
            intarr[i] = arr[i].replaceAll("[^0-9]", " ");
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            String[] str = intarr[i].split(" ");
            for (int j = 0; j < str.length; j++) {
                if (!str[j].isEmpty()) {
                    count++;
                    list.add(new BigInteger(str[j]));
                }
            }
        }
        BigInteger[] arr_2 = new BigInteger[count];
        for (int i = 0; i < count; i++) {
            arr_2[i] = list.get(i);
        }
        Arrays.sort(arr_2);
        for (int i = 0; i < count; i++) {
            System.out.println(arr_2[i]);
        }

    }
}
