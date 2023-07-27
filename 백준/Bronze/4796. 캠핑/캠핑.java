import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(true) {
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            if(L == 0 && P == 0 && V == 0){
                break;
                }
            else {
                int count = 0;
                i++;
                count += ((V / P) * L);
                
                if(V % P < L)
                    count += V % P;
                else
                    count += L;
                sb.append("Case ").append(i).append(": ").append(count).append('\n');
            }
        }
        System.out.println(sb);
    }
}
