
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
            if(arr[i].length() < M)
                continue;
            int count = map.getOrDefault(arr[i], 0);
            map.put(arr[i], count+1);

        }
        List<String> arrayList = map.keySet().stream().collect(Collectors.toList());
        arrayList.sort((e1, e2) -> {
            int c1 = map.get(e1);
            int c2 = map.get(e2);
            if(c1 == c2) {
                if (e1.length() == e2.length())
                    return e1.compareTo(e2);
                else
                    return e2.length() - e1.length();
            }
            return c2-c1;
        });

        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(arrayList.get(i)).append("\n");
        }
        System.out.println(sb);

    }
}
