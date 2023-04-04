class Solution {
    int [] numbers;
    int target;
    int answer;
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        answer = 0;
        dfs(0, numbers.length-1);
        return answer;
    }
    public void dfs(int sum, int index){
        
        if(index == -1){
            if(sum == target)
                answer++;
            return;
        }
        dfs(sum + numbers[index], index-1);
        dfs(sum - numbers[index], index-1);
        
    }
}