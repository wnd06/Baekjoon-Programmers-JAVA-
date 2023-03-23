class Solution {
    boolean solution(String s) {
        boolean answer;
        int num = 0;
        int num_2 = 0;
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P')
                num++;
            else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y')
                num_2++;
        }
        if (num == num_2)
            answer = true;
        else
            answer = false;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}