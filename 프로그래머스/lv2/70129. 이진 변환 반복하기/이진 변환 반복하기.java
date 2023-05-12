class Solution {
    static int cnt = 0;
    static int allcount = 0;
    public int[] solution(String s) {
        int[] answer = new int [2];
        delete(s);
        answer[0] = allcount;
        answer[1] = cnt;
        return answer;
    }
    
    private static String delete(String binary) {
        //binary 값이 1이 되면 호출한 부분으로 돌아간다.
        if(binary.equals("1"))
            return binary;
        int zerocount = 0;
        for(int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '0')
                zerocount++;
        }
        cnt += zerocount;
        int length = binary.length() - zerocount;
        allcount++;
        return delete(Integer.toString(length,2));
    }
}