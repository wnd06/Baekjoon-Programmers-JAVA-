import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        int []arr = new int[2];
        for (int i = 0; i < 2; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr_2 = new int[arr[0]];
        for (int i = 0; i < arr_2.length; i++) {
            arr_2[i] = Integer.parseInt(st2.nextToken());
        }
        int a = 0;
        for (int i = 0; i < arr[0]; i++) {
            for (int j = i + 1; j < arr[0]; j++) {
                for (int k = j + 1; k < arr[0]; k++) {
                    a = arr_2[i] + arr_2[j] + arr_2[k];
                    if(!(a > arr[1])) {
                        list.add(a);
                    }
                }
            }
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list.get(list.size()-1));
    }

}