class Solution {
    int[] numbers;
    int target;
    int answer;
    public int solution(int[] numbers, int target) {
        
        this.target = target;
        this.numbers = numbers;
        answer = 0;
        dfs(0, 0);
        
        return answer;
        
    }
    
    public void dfs(int sum, int index){
        if(numbers.length == index){
            if(sum == target){
                answer++;
            }
            return;
        }
        dfs(sum+numbers[index], index+1);
        dfs(sum-numbers[index], index+1);
    }
    
}