class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxw = 0;
        int maxh = 0;
        int temp = 0;
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        for(int i = 0; i < sizes.length; i++){
            if(maxw < sizes[i][0])
                maxw = sizes[i][0];
        }
        for(int i = 0; i < sizes.length; i++){
            if(maxh < sizes[i][1])
                maxh = sizes[i][1];
        }
        answer = maxw * maxh;
        return answer;
    }
}