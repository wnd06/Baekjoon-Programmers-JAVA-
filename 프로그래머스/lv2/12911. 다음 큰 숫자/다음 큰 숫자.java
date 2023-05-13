class Solution {
    static int temp = 0;
    public int solution(int n) {
        
        int cnt = 0; //n의 2진수의 1의 개수
        String s = Integer.toString(n,2);
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1')
                cnt++;
        }
        
        result(n, cnt, n);
        
        return temp;
    }
    
    private static int result(int a, int count, int b) {
        int answercnt = 0;
        
        if(b > a) { //종료조건
            String str = Integer.toString(b, 2);
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '1')
                    answercnt++;    
            }
            if(count == answercnt) 
                return a;
            else
                temp = b + 1;
                return result(a, count, b+1);
        }
        
        else {
            temp = b + 1;
            return result(a, count, b+1);
        }
    }
}