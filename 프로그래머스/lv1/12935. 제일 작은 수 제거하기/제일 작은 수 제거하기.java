class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int [arr.length - 1];
        int min = arr[0];
        if (arr.length == 1)
            return new int [] {-1};
        for(int x : arr){
            if(min > x)
                min = x;
        }
        int i = 0;
        for(int x : arr){
            if(min < x){
                answer[i] = x;
                i++;
            }
           
        }
        
        return answer;
    }
}