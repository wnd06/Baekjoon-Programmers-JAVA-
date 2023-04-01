class Solution {
    public String solution(String s) {
        String answer = "";
        String [] arr = s.split(" ");
        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);
        for(int i = 0; i < arr.length; i++){
            int num = Integer.parseInt(arr[i]);
            if(min > num)
                min = num;
            if(max < num)
                max = num;
            
        }
        answer = Integer.toString(min) + " " + Integer.toString(max);
        return answer;
    }
}