class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        char [] a = t.toCharArray();
        char [] b = p.toCharArray();
        long d = Long.parseLong(p);
        for(int i = 0; i <= a.length - b.length; i++){
            String s = "";
            for(int j = i; j < i + b.length; j++){
                s += a[j];
            }
            long c = Long.parseLong(s);
                if(d >= c)
                    answer++;
        }
        return answer;
    }
}